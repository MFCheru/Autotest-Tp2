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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        boolean b7 = defaultedMap5.equals((java.lang.Object) true);
        boolean b8 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(1);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.util.Collection collection8 = defaultedMap5.values();
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        java.lang.String str35 = defaultedMap5.toString();
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation47);
        int i51 = defaultedMap50.size();
        java.lang.Object obj54 = defaultedMap50.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation57.addChromosome(chromosome58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation57);
        boolean b61 = defaultedMap50.equals((java.lang.Object) defaultedMap60);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome65 = null;
        elitisticListPopulation64.addChromosome(chromosome65);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation64);
        int i68 = defaultedMap67.size();
        java.lang.Object obj71 = defaultedMap67.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation74.addChromosome(chromosome75);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation74);
        boolean b78 = defaultedMap67.equals((java.lang.Object) defaultedMap77);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome82 = elitisticListPopulation81.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome83 = elitisticListPopulation81.getChromosomes();
        int i84 = elitisticListPopulation81.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome85 = elitisticListPopulation81.getChromosomes();
        java.lang.Object obj87 = defaultedMap77.put((java.lang.Object) elitisticListPopulation81, (java.lang.Object) 10.0f);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 10.0f);
        boolean b89 = defaultedMap15.containsKey((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome82);
        org.junit.Assert.assertNotNull(list_chromosome83);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertNotNull(list_chromosome85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) 10.0f);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation4 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation4.addChromosome(chromosome5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation4);
        int i8 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        try {
            java.util.Map map15 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.lang.String str23 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        defaultedMap29.clear();
        java.util.Set set31 = defaultedMap29.entrySet();
        java.util.Collection collection32 = defaultedMap29.values();
        boolean b33 = defaultedMap5.containsValue((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0, -1.0= }" + "'", str23.equals("{-1=1.0, -1.0= }"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        defaultedMap15.clear();
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) 10.0f);
        try {
            math.genetics.Chromosome chromosome26 = elitisticListPopulation19.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.lang.String str17 = defaultedMap5.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{-1=1.0}" + "'", str17.equals("{-1=1.0}"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation9.nextGeneration();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) population14);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) i22);
        java.util.Collection collection24 = defaultedMap15.values();
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        java.lang.String str35 = defaultedMap5.toString();
        int i36 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.lang.String str23 = defaultedMap5.toString();
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0, -1.0= }" + "'", str23.equals("{-1=1.0, -1.0= }"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        boolean b21 = defaultedMap10.equals((java.lang.Object) defaultedMap20);
        java.util.Set set22 = defaultedMap20.entrySet();
        java.util.Set set23 = defaultedMap20.keySet();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) set23);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        int i13 = elitisticListPopulation10.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome14, (int) (byte) 100, 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome14);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome14, 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(list_chromosome14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation8);
        int i12 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set17 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation8);
        int i12 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.String str17 = defaultedMap11.toString();
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{ =-1}" + "'", str17.equals("{ =-1}"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        java.lang.String str23 = defaultedMap8.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation19.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation19.getChromosomes();
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) elitisticListPopulation19);
        java.lang.String str27 = elitisticListPopulation19.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        math.genetics.Population population45 = elitisticListPopulation40.nextGeneration();
        math.genetics.Population population46 = elitisticListPopulation40.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation40.iterator();
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) elitisticListPopulation40);
        java.lang.String str49 = elitisticListPopulation40.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation24);
        java.util.Set set28 = defaultedMap27.keySet();
        java.util.Set set29 = defaultedMap27.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap27);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation33.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        int i36 = elitisticListPopulation33.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation33.spliterator();
        java.lang.String str38 = elitisticListPopulation33.toString();
        int i39 = elitisticListPopulation33.getPopulationLimit();
        boolean b40 = defaultedMap5.containsKey((java.lang.Object) elitisticListPopulation33);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(i39 == 10);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        int i10 = elitisticListPopulation7.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation13.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome19 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        int i11 = elitisticListPopulation8.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation14.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) list_chromosome16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1.0d);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        java.util.Set set33 = defaultedMap24.keySet();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str28 = defaultedMap23.toString();
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1));
        boolean b31 = defaultedMap13.equals((java.lang.Object) b30);
        java.util.Collection collection32 = defaultedMap13.values();
        java.lang.String str33 = defaultedMap13.toString();
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation2.spliterator();
        int i10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation19.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation19.getChromosomes();
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) elitisticListPopulation19);
        java.util.Collection collection27 = defaultedMap5.values();
        boolean b28 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        int i11 = elitisticListPopulation8.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation14.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) list_chromosome16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1.0d);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation35);
        java.util.Set set39 = defaultedMap38.keySet();
        java.util.Set set40 = defaultedMap38.entrySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) spliterator_chromosome11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        int i19 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str23 = defaultedMap18.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap18.containsKey((java.lang.Object) set30);
        boolean b33 = defaultedMap18.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation36.addChromosome(chromosome37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation36);
        int i40 = defaultedMap39.size();
        java.lang.Object obj43 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        defaultedMap18.putAll(map46);
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) defaultedMap18);
        java.util.Set set49 = defaultedMap18.keySet();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0}" + "'", str23.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        java.lang.String str35 = defaultedMap5.toString();
        int i36 = defaultedMap5.size();
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17);
        math.genetics.Population population20 = elitisticListPopulation15.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome21);
        elitisticListPopulation2.setChromosomes(list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation9.nextGeneration();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) population14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate(map15, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42);
        math.genetics.Population population45 = elitisticListPopulation40.nextGeneration();
        math.genetics.Population population46 = elitisticListPopulation40.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome47 = elitisticListPopulation40.iterator();
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) elitisticListPopulation40);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome52 = elitisticListPopulation51.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation51.getChromosomes();
        int i54 = elitisticListPopulation51.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome55 = elitisticListPopulation51.getChromosomes();
        double d56 = elitisticListPopulation51.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation59.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        math.genetics.Population population64 = elitisticListPopulation59.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome65 = elitisticListPopulation59.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation59.getChromosomes();
        elitisticListPopulation51.setChromosomes(list_chromosome66);
        elitisticListPopulation40.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome66);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertNotNull(iterator_chromosome47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(spliterator_chromosome52);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(list_chromosome55);
        org.junit.Assert.assertTrue(d56 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(population64);
        org.junit.Assert.assertNotNull(iterator_chromosome65);
        org.junit.Assert.assertNotNull(list_chromosome66);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        int i17 = defaultedMap16.size();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        boolean b27 = defaultedMap16.equals((java.lang.Object) defaultedMap26);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Population population35 = elitisticListPopulation30.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation30.getChromosomes();
        boolean b37 = defaultedMap16.containsKey((java.lang.Object) elitisticListPopulation30);
        java.util.Collection collection38 = defaultedMap16.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection38);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation47);
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap50.containsKey(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1.0d);
        defaultedMap50.putAll((java.util.Map) defaultedMap54);
        defaultedMap15.putAll((java.util.Map) defaultedMap54);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) 10.0f);
        try {
            elitisticListPopulation19.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap5.remove(obj7);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation11);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation11.iterator();
        java.lang.Object obj16 = defaultedMap5.remove((java.lang.Object) iterator_chromosome15);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation20.spliterator();
        boolean b22 = defaultedMap15.containsKey((java.lang.Object) spliterator_chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str33 = defaultedMap28.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation36.addChromosome(chromosome37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation36);
        java.util.Set set40 = defaultedMap39.keySet();
        boolean b41 = defaultedMap28.containsKey((java.lang.Object) set40);
        boolean b43 = defaultedMap28.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation46.addChromosome(chromosome47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation46);
        int i50 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        defaultedMap28.putAll(map56);
        java.lang.Object obj58 = defaultedMap15.get((java.lang.Object) defaultedMap28);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{-1=1.0}" + "'", str33.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation9.spliterator();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str28 = defaultedMap23.toString();
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1));
        boolean b31 = defaultedMap13.equals((java.lang.Object) b30);
        java.util.Collection collection32 = defaultedMap13.values();
        int i33 = defaultedMap13.size();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = list_chromosome9.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 0);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(i3 == 100);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        int i13 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        defaultedMap8.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        int i29 = elitisticListPopulation26.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation26.getChromosomes();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) elitisticListPopulation26);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation40);
        int i44 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap43.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str48 = defaultedMap43.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome52 = null;
        elitisticListPopulation51.addChromosome(chromosome52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation51);
        java.util.Set set55 = defaultedMap54.keySet();
        boolean b56 = defaultedMap43.containsKey((java.lang.Object) set55);
        boolean b58 = defaultedMap43.equals((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap43.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome64 = null;
        elitisticListPopulation63.addChromosome(chromosome64);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation63);
        int i67 = defaultedMap66.size();
        java.lang.Object obj70 = defaultedMap66.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate71, predicate74);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array79 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome80 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b81 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80, chromosome_array79);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome80);
        math.genetics.Population population83 = elitisticListPopulation78.nextGeneration();
        math.genetics.Population population84 = elitisticListPopulation78.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome85 = elitisticListPopulation78.iterator();
        java.lang.Object obj86 = defaultedMap43.get((java.lang.Object) elitisticListPopulation78);
        java.util.Set set87 = defaultedMap43.keySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{-1=1.0}" + "'", str48.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(chromosome_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(population83);
        org.junit.Assert.assertNotNull(population84);
        org.junit.Assert.assertNotNull(iterator_chromosome85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(set87);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap5.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection35 = defaultedMap5.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation38);
        int i42 = defaultedMap41.size();
        java.lang.Object obj45 = defaultedMap41.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str46 = defaultedMap41.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation50.addChromosome(chromosome51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation50);
        int i54 = defaultedMap53.size();
        java.lang.Object obj57 = defaultedMap53.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj58 = defaultedMap41.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap41);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{-1=1.0}" + "'", str46.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        int i14 = defaultedMap13.size();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str18 = defaultedMap13.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation21);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap13.containsKey((java.lang.Object) set25);
        boolean b28 = defaultedMap13.equals((java.lang.Object) 0.0d);
        defaultedMap13.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = elitisticListPopulation32.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation32.getChromosomes();
        int i35 = elitisticListPopulation32.getPopulationSize();
        java.lang.String str36 = elitisticListPopulation32.toString();
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) str36);
        boolean b38 = defaultedMap5.containsValue((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{-1=1.0}" + "'", str18.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        double d9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) i22);
        java.util.Collection collection24 = defaultedMap15.values();
        java.lang.String str25 = defaultedMap15.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) (byte) 100, 0.0d);
        java.lang.String str10 = elitisticListPopulation9.toString();
        int i11 = elitisticListPopulation9.getPopulationLimit();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(i11 == 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(1);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population22 = elitisticListPopulation17.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation17.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation17.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation27.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation27.getChromosomes();
        int i30 = elitisticListPopulation27.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation33.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(list_chromosome35);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.setChromosomes(list_chromosome35);
        java.lang.String str39 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i7 == 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation38.addChromosome(chromosome39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation38);
        int i42 = defaultedMap41.size();
        java.lang.Object obj45 = defaultedMap41.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str46 = defaultedMap41.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation49.addChromosome(chromosome50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation49);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b54 = defaultedMap41.containsKey((java.lang.Object) set53);
        boolean b56 = defaultedMap41.equals((java.lang.Object) 0.0d);
        boolean b58 = defaultedMap41.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation61 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome62 = null;
        elitisticListPopulation61.addChromosome(chromosome62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation61);
        int i65 = defaultedMap64.size();
        java.lang.Object obj68 = defaultedMap64.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate69, predicate72);
        try {
            java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate35, predicate72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{-1=1.0}" + "'", str46.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap5.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap28.isEmpty();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d5 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.entrySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1.0d);
        java.util.Collection collection23 = defaultedMap20.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj31 = defaultedMap20.get((java.lang.Object) set30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation34.addChromosome(chromosome35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation34);
        defaultedMap37.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation41.addChromosome(chromosome42);
        boolean b44 = defaultedMap37.containsValue((java.lang.Object) elitisticListPopulation41);
        math.genetics.Population population45 = elitisticListPopulation41.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation48.addChromosome(chromosome49);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation48);
        int i52 = defaultedMap51.size();
        java.lang.Object obj55 = defaultedMap51.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.Object obj56 = defaultedMap20.put((java.lang.Object) population45, (java.lang.Object) 1.0d);
        boolean b57 = defaultedMap15.containsValue((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation40);
        int i44 = elitisticListPopulation40.getPopulationLimit();
        math.genetics.Population population45 = elitisticListPopulation40.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome46 = elitisticListPopulation40.spliterator();
        java.util.Map map47 = collections.map.DefaultedMap.decorate(map37, (java.lang.Object) spliterator_chromosome46);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(spliterator_chromosome46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        boolean b34 = defaultedMap23.equals((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Set set36 = defaultedMap33.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation39.addChromosome(chromosome40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation39);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap5.put((java.lang.Object) defaultedMap33, (java.lang.Object) collection44);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome8);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        int i16 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str20 = defaultedMap15.toString();
        java.lang.String str21 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1.0d);
        java.util.Collection collection26 = defaultedMap23.values();
        boolean b27 = defaultedMap15.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj28 = defaultedMap9.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1=1.0}" + "'", str20.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{-1=1.0}" + "'", str21.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome8);
        java.lang.String str10 = defaultedMap9.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        java.util.Set set23 = defaultedMap8.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap8.put((java.lang.Object) elitisticListPopulation26, obj29);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        int i13 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        int i16 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str20 = defaultedMap15.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b28 = defaultedMap15.containsKey((java.lang.Object) set27);
        boolean b30 = defaultedMap15.equals((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap15.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation35);
        int i39 = defaultedMap38.size();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate43, predicate46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        math.genetics.Population population55 = elitisticListPopulation50.nextGeneration();
        math.genetics.Population population56 = elitisticListPopulation50.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome57 = elitisticListPopulation50.iterator();
        java.lang.Object obj58 = defaultedMap15.get((java.lang.Object) elitisticListPopulation50);
        java.util.Set set59 = defaultedMap15.keySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        java.util.Set set61 = defaultedMap15.entrySet();
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1=1.0}" + "'", str20.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertNotNull(population56);
        org.junit.Assert.assertNotNull(iterator_chromosome57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        defaultedMap12.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) elitisticListPopulation16);
        double d20 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) elitisticListPopulation16);
        java.lang.String str22 = elitisticListPopulation16.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[null]" + "'", str22.equals("[null]"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap5.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation9.nextGeneration();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) population14);
        java.lang.String str16 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str27 = defaultedMap22.toString();
        defaultedMap5.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{-1=1.0}" + "'", str27.equals("{-1=1.0}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        int i9 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        int i10 = elitisticListPopulation7.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = elitisticListPopulation13.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation7.setChromosomes(list_chromosome15);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        double d19 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue(d19 == 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map map0 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation3.addChromosome(chromosome4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation3);
        int i7 = defaultedMap6.size();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation16);
        int i20 = defaultedMap19.size();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        try {
            java.util.Map map27 = collections.map.PredicatedMap.decorate(map0, predicate12, predicate25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj17 = defaultedMap11.remove((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        java.util.Set set24 = defaultedMap23.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        math.genetics.Population population32 = elitisticListPopulation27.nextGeneration();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) population32);
        boolean b34 = defaultedMap11.containsKey((java.lang.Object) map33);
        defaultedMap5.putAll(map33);
        java.lang.Object obj37 = defaultedMap5.remove((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        java.util.Collection collection18 = defaultedMap13.values();
        int i19 = defaultedMap13.size();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation6);
        int i10 = defaultedMap9.size();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str14 = defaultedMap9.toString();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) (-1));
        boolean b18 = defaultedMap9.containsKey((java.lang.Object) '4');
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.lang.String str20 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{-1=1.0}" + "'", str14.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 100 + "'", obj19.equals((short) 100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str22 = defaultedMap17.toString();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) (-1));
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) '4');
        java.lang.Object obj27 = defaultedMap9.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj28 = defaultedMap3.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{-1=1.0}" + "'", str22.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 100 + "'", obj27.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        int i13 = defaultedMap5.size();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        double d8 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(1);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population22 = elitisticListPopulation17.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation17.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation17.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome28 = elitisticListPopulation27.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation27.getChromosomes();
        int i30 = elitisticListPopulation27.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation33.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation33.getChromosomes();
        elitisticListPopulation27.setChromosomes(list_chromosome35);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome35);
        elitisticListPopulation2.setChromosomes(list_chromosome35);
        int i39 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome28);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        int i9 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        double d13 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        defaultedMap20.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) elitisticListPopulation24);
        double d28 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome29);
        try {
            math.genetics.Chromosome chromosome31 = elitisticListPopulation9.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome29);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) elitisticListPopulation19, (java.lang.Object) 10.0f);
        java.util.Collection collection26 = defaultedMap15.values();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        int i7 = defaultedMap5.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation16);
        int i20 = defaultedMap19.size();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        int i25 = defaultedMap19.size();
        java.lang.Object obj26 = defaultedMap5.remove((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation19.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation19.getChromosomes();
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = elitisticListPopulation29.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation29.getChromosomes();
        int i32 = elitisticListPopulation29.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome36 = elitisticListPopulation35.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation35.getChromosomes();
        elitisticListPopulation29.setChromosomes(list_chromosome37);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation29.getChromosomes();
        elitisticListPopulation29.setPopulationLimit(1);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46);
        math.genetics.Population population49 = elitisticListPopulation44.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome50 = elitisticListPopulation44.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation44.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = elitisticListPopulation54.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation54.getChromosomes();
        int i57 = elitisticListPopulation54.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome61 = elitisticListPopulation60.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome62 = elitisticListPopulation60.getChromosomes();
        elitisticListPopulation54.setChromosomes(list_chromosome62);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome62);
        elitisticListPopulation29.setChromosomes(list_chromosome62);
        int i66 = elitisticListPopulation29.getPopulationSize();
        java.lang.Object obj67 = defaultedMap5.get((java.lang.Object) i66);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome36);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(population49);
        org.junit.Assert.assertNotNull(iterator_chromosome50);
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome61);
        org.junit.Assert.assertNotNull(list_chromosome62);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        defaultedMap15.clear();
        java.util.Collection collection45 = defaultedMap15.values();
        java.util.Map map46 = null;
        try {
            defaultedMap15.putAll(map46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Population population19 = elitisticListPopulation14.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation14.getChromosomes();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) elitisticListPopulation14);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        int i19 = defaultedMap18.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation22.addChromosome(chromosome23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation22);
        defaultedMap25.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) elitisticListPopulation29);
        double d33 = elitisticListPopulation29.getElitismRate();
        java.lang.Object obj34 = defaultedMap18.get((java.lang.Object) elitisticListPopulation29);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d33 == 0.0d);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) spliterator_chromosome11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        int i19 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str23 = defaultedMap18.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        java.util.Set set30 = defaultedMap29.keySet();
        boolean b31 = defaultedMap18.containsKey((java.lang.Object) set30);
        boolean b33 = defaultedMap18.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation36.addChromosome(chromosome37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation36);
        int i40 = defaultedMap39.size();
        java.lang.Object obj43 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        defaultedMap18.putAll(map46);
        java.lang.Object obj48 = defaultedMap5.get((java.lang.Object) defaultedMap18);
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0}" + "'", str23.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str7 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        defaultedMap5.clear();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation(list_chromosome4, (int) (short) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.util.Set set23 = defaultedMap5.keySet();
        java.util.Set set24 = defaultedMap5.entrySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        java.lang.String str19 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation22.addChromosome(chromosome23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation22);
        int i26 = defaultedMap25.size();
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation32.addChromosome(chromosome33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation32);
        boolean b36 = defaultedMap25.equals((java.lang.Object) defaultedMap35);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome40 = elitisticListPopulation39.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        int i42 = elitisticListPopulation39.getPopulationSize();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) i42);
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) i42);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{-1=1.0}" + "'", str19.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome40);
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        int i11 = elitisticListPopulation8.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation14.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation8.setChromosomes(list_chromosome16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) list_chromosome16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1.0d);
        java.util.Collection collection23 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj31 = defaultedMap25.remove((java.lang.Object) defaultedMap27);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation34.addChromosome(chromosome35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation34);
        defaultedMap37.clear();
        java.util.Set set39 = defaultedMap37.entrySet();
        java.util.Collection collection40 = defaultedMap37.values();
        java.lang.Object obj41 = defaultedMap20.put((java.lang.Object) defaultedMap27, (java.lang.Object) collection40);
        java.util.Set set42 = defaultedMap27.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome46 = elitisticListPopulation45.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation45.getChromosomes();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap27.put((java.lang.Object) elitisticListPopulation45, obj48);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation52.addChromosome(chromosome53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation52);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome56 = elitisticListPopulation52.iterator();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) elitisticListPopulation52);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) map57);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(spliterator_chromosome46);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(iterator_chromosome56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 100 + "'", obj58.equals((short) 100));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1.0d);
        java.util.Collection collection12 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) defaultedMap16);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        defaultedMap26.clear();
        java.util.Set set28 = defaultedMap26.entrySet();
        java.util.Collection collection29 = defaultedMap26.values();
        java.lang.Object obj30 = defaultedMap9.put((java.lang.Object) defaultedMap16, (java.lang.Object) collection29);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome34 = elitisticListPopulation33.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome35 = elitisticListPopulation33.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome39 = elitisticListPopulation38.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome40);
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation33.getChromosomes();
        boolean b43 = defaultedMap16.containsValue((java.lang.Object) list_chromosome42);
        elitisticListPopulation2.setChromosomes(list_chromosome42);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(spliterator_chromosome34);
        org.junit.Assert.assertNotNull(spliterator_chromosome35);
        org.junit.Assert.assertNotNull(spliterator_chromosome39);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.entrySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) map12);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome8.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, (int) (byte) 100, 0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation9.iterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation6.addChromosome(chromosome7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation6);
        int i10 = defaultedMap9.size();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str14 = defaultedMap9.toString();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) (-1));
        boolean b18 = defaultedMap9.containsKey((java.lang.Object) '4');
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{-1=1.0}" + "'", str14.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 100 + "'", obj19.equals((short) 100));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Map map0 = null;
        math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation3.addChromosome(chromosome4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation3);
        defaultedMap6.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) elitisticListPopulation10);
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.lang.String str23 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        boolean b25 = defaultedMap24.isEmpty();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0, -1.0= }" + "'", str23.equals("{-1=1.0, -1.0= }"));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        int i9 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation12.getChromosomes();
        int i15 = elitisticListPopulation12.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation12.getChromosomes();
        double d17 = elitisticListPopulation12.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        math.genetics.Population population25 = elitisticListPopulation20.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation20.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation12.setChromosomes(list_chromosome27);
        elitisticListPopulation2.setChromosomes(list_chromosome27);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(list_chromosome16);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(population25);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome27);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate(map33, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        int i14 = defaultedMap13.size();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str18 = defaultedMap13.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation22.addChromosome(chromosome23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation22);
        int i26 = defaultedMap25.size();
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj30 = defaultedMap13.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.lang.String str31 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) str31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) str31);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{-1=1.0}" + "'", str18.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{-1=1.0, -1.0= }" + "'", str31.equals("{-1=1.0, -1.0= }"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a' + "'", obj33.equals('a'));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.entrySet();
        int i18 = defaultedMap15.size();
        int i19 = defaultedMap15.size();
        java.lang.String str20 = defaultedMap15.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) '#', (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation47.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        math.genetics.Population population52 = elitisticListPopulation47.nextGeneration();
        int i53 = elitisticListPopulation47.getPopulationLimit();
        java.lang.Object obj54 = defaultedMap15.get((java.lang.Object) i53);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation57.addChromosome(chromosome58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation57);
        int i61 = defaultedMap60.size();
        java.lang.Object obj64 = defaultedMap60.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome68 = null;
        elitisticListPopulation67.addChromosome(chromosome68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation67);
        boolean b71 = defaultedMap60.equals((java.lang.Object) defaultedMap70);
        java.util.Set set72 = defaultedMap70.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation75 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome76 = null;
        elitisticListPopulation75.addChromosome(chromosome76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation75);
        int i79 = defaultedMap78.size();
        java.lang.Object obj82 = defaultedMap78.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation85 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome86 = null;
        elitisticListPopulation85.addChromosome(chromosome86);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation85);
        boolean b89 = defaultedMap78.equals((java.lang.Object) defaultedMap88);
        java.util.Set set90 = defaultedMap88.entrySet();
        int i91 = defaultedMap88.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap88);
        boolean b93 = defaultedMap15.containsKey((java.lang.Object) defaultedMap88);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(population52);
        org.junit.Assert.assertTrue(i53 == 10);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        int i16 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str20 = defaultedMap15.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b28 = defaultedMap15.containsKey((java.lang.Object) set27);
        boolean b30 = defaultedMap15.equals((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap15.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation35);
        int i39 = defaultedMap38.size();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate43, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        defaultedMap5.putAll((java.util.Map) defaultedMap48);
        defaultedMap48.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1=1.0}" + "'", str20.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        int i21 = defaultedMap20.size();
        java.lang.Object obj24 = defaultedMap20.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str25 = defaultedMap20.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation28.addChromosome(chromosome29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation28);
        java.util.Set set32 = defaultedMap31.keySet();
        boolean b33 = defaultedMap20.containsKey((java.lang.Object) set32);
        boolean b35 = defaultedMap20.equals((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap20.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation40);
        int i44 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap43.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate48, predicate51);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation55.addChromosome(chromosome56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation55);
        int i59 = defaultedMap58.size();
        java.lang.Object obj62 = defaultedMap58.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str63 = defaultedMap58.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome67 = null;
        elitisticListPopulation66.addChromosome(chromosome67);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation66);
        java.util.Set set70 = defaultedMap69.keySet();
        boolean b71 = defaultedMap58.containsKey((java.lang.Object) set70);
        boolean b73 = defaultedMap58.equals((java.lang.Object) 0.0d);
        boolean b75 = defaultedMap58.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome79 = null;
        elitisticListPopulation78.addChromosome(chromosome79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation78);
        int i82 = defaultedMap81.size();
        java.lang.Object obj85 = defaultedMap81.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate86, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate48, predicate86);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate86, predicate92);
        java.util.Collection collection94 = defaultedMap3.values();
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{-1=1.0}" + "'", str25.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{-1=1.0}" + "'", str63.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(collection94);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.entrySet();
        int i18 = defaultedMap15.size();
        java.util.Set set19 = defaultedMap15.entrySet();
        java.lang.String str20 = defaultedMap15.toString();
        defaultedMap15.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        int i14 = defaultedMap13.size();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str18 = defaultedMap13.toString();
        boolean b19 = defaultedMap13.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        math.genetics.Population population27 = elitisticListPopulation22.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation22.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome32 = elitisticListPopulation31.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation22.setChromosomes(list_chromosome33);
        math.genetics.Population population35 = elitisticListPopulation22.nextGeneration();
        math.genetics.Population population36 = elitisticListPopulation22.nextGeneration();
        java.lang.Object obj37 = defaultedMap13.remove((java.lang.Object) population36);
        java.lang.Object obj38 = defaultedMap1.get(obj37);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{-1=1.0}" + "'", str18.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(population27);
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertNotNull(spliterator_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNotNull(population36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 'a' + "'", obj38.equals('a'));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap13.keySet();
        java.util.Set set19 = defaultedMap13.keySet();
        int i20 = defaultedMap13.size();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        java.util.Set set38 = defaultedMap5.keySet();
        java.util.Collection collection39 = defaultedMap5.values();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome9);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        double d12 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(d12 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
        java.lang.String str23 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{-1=1.0, -1.0= }" + "'", str23.equals("{-1=1.0, -1.0= }"));
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str6 = elitisticListPopulation2.toString();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = arraylist_chromosome8.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (short) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Set set6 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Population population14 = elitisticListPopulation9.nextGeneration();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) population14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = population14.spliterator();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.String str7 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        math.genetics.Population population15 = elitisticListPopulation10.nextGeneration();
        double d16 = elitisticListPopulation10.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation19.spliterator();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) d16, (java.lang.Object) elitisticListPopulation19);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) i22);
        java.util.Collection collection24 = defaultedMap15.values();
        boolean b25 = defaultedMap15.isEmpty();
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        java.lang.String str35 = defaultedMap5.toString();
        int i36 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation40);
        int i44 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap43.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation50.addChromosome(chromosome51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation50);
        boolean b54 = defaultedMap43.equals((java.lang.Object) defaultedMap53);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation57.addChromosome(chromosome58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation57);
        int i61 = defaultedMap60.size();
        java.lang.Object obj64 = defaultedMap60.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation67 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome68 = null;
        elitisticListPopulation67.addChromosome(chromosome68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation67);
        boolean b71 = defaultedMap60.equals((java.lang.Object) defaultedMap70);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome75 = elitisticListPopulation74.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome76 = elitisticListPopulation74.getChromosomes();
        int i77 = elitisticListPopulation74.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome78 = elitisticListPopulation74.getChromosomes();
        java.lang.Object obj80 = defaultedMap70.put((java.lang.Object) elitisticListPopulation74, (java.lang.Object) 10.0f);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 10.0f);
        boolean b82 = defaultedMap5.containsKey((java.lang.Object) map81);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome75);
        org.junit.Assert.assertNotNull(list_chromosome76);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(list_chromosome78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str28 = defaultedMap23.toString();
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1));
        boolean b31 = defaultedMap13.equals((java.lang.Object) b30);
        java.util.Collection collection32 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.util.Set set34 = defaultedMap13.entrySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome9);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation14);
        int i18 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation24);
        boolean b28 = defaultedMap17.equals((java.lang.Object) defaultedMap27);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation31.addChromosome(chromosome32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation31);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation37.addChromosome(chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation37);
        int i41 = defaultedMap40.size();
        java.lang.Object obj44 = defaultedMap40.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        defaultedMap17.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection47 = defaultedMap17.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection47);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        defaultedMap12.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) elitisticListPopulation16);
        double d20 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) elitisticListPopulation16);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation16.addChromosome(chromosome22);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation36.getChromosomes();
        java.lang.Object obj42 = defaultedMap32.put((java.lang.Object) elitisticListPopulation36, (java.lang.Object) 10.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0f);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        int i16 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str20 = defaultedMap15.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b28 = defaultedMap15.containsKey((java.lang.Object) set27);
        boolean b30 = defaultedMap15.equals((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap15.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation35.addChromosome(chromosome36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation35);
        int i39 = defaultedMap38.size();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate43, predicate46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        elitisticListPopulation50.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52);
        math.genetics.Population population55 = elitisticListPopulation50.nextGeneration();
        math.genetics.Population population56 = elitisticListPopulation50.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome57 = elitisticListPopulation50.iterator();
        java.lang.Object obj58 = defaultedMap15.get((java.lang.Object) elitisticListPopulation50);
        java.util.Set set59 = defaultedMap15.keySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome64 = elitisticListPopulation63.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome65 = elitisticListPopulation63.getChromosomes();
        int i66 = elitisticListPopulation63.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome67 = elitisticListPopulation63.spliterator();
        int i68 = elitisticListPopulation63.getPopulationLimit();
        java.lang.String str69 = elitisticListPopulation63.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome70 = elitisticListPopulation63.spliterator();
        int i71 = elitisticListPopulation63.getPopulationSize();
        int i72 = elitisticListPopulation63.getPopulationLimit();
        boolean b73 = defaultedMap5.equals((java.lang.Object) i72);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1=1.0}" + "'", str20.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(population55);
        org.junit.Assert.assertNotNull(population56);
        org.junit.Assert.assertNotNull(iterator_chromosome57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(spliterator_chromosome64);
        org.junit.Assert.assertNotNull(list_chromosome65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome67);
        org.junit.Assert.assertTrue(i68 == 10);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]" + "'", str69.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome70);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(i72 == 10);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.Population population24 = elitisticListPopulation19.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation19.getChromosomes();
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) elitisticListPopulation19);
        int i27 = elitisticListPopulation19.getPopulationSize();
        math.genetics.Population population28 = elitisticListPopulation19.nextGeneration();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(population28);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        math.genetics.Population population32 = elitisticListPopulation27.nextGeneration();
        math.genetics.Population population33 = elitisticListPopulation27.nextGeneration();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap5.put((java.lang.Object) elitisticListPopulation27, obj34);
        defaultedMap5.clear();
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str28 = defaultedMap23.toString();
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1));
        boolean b31 = defaultedMap13.equals((java.lang.Object) b30);
        java.util.Collection collection32 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1.0d);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        boolean b32 = defaultedMap15.equals((java.lang.Object) defaultedMap24);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation19);
        double d23 = elitisticListPopulation19.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome24);
        int i26 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation2.addChromosome(chromosome28);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertTrue(i26 == 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        defaultedMap1.clear();
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 1.0d);
        java.util.Collection collection8 = defaultedMap5.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation11);
        java.util.Set set15 = defaultedMap14.keySet();
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) set15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome20 = elitisticListPopulation19.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) list_chromosome21);
        boolean b23 = defaultedMap1.containsValue(obj22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 100 + "'", obj16.equals((short) 100));
        org.junit.Assert.assertNotNull(spliterator_chromosome20);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str15 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation18.addChromosome(chromosome19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap10.containsKey((java.lang.Object) set22);
        boolean b25 = defaultedMap10.equals((java.lang.Object) 0.0d);
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) 0L);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b29 = defaultedMap1.isEmpty();
        java.util.Collection collection30 = defaultedMap1.values();
        java.util.Set set31 = defaultedMap1.entrySet();
        int i32 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{-1=1.0}" + "'", str15.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap5.containsKey(obj6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.containsValue(obj8);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        int i5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        int i13 = elitisticListPopulation10.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation16.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome20);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        double d8 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation10.addChromosome(chromosome11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        java.util.Set set14 = defaultedMap13.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population22 = elitisticListPopulation17.nextGeneration();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) population22);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) map23);
        java.lang.String str25 = defaultedMap1.toString();
        java.util.Collection collection26 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        double d13 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        defaultedMap20.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) elitisticListPopulation24);
        double d28 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome29);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation9.addChromosome(chromosome31);
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        int i37 = elitisticListPopulation9.getPopulationLimit();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i37 == 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        int i13 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str17 = defaultedMap12.toString();
        java.lang.String str18 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1.0d);
        java.util.Collection collection23 = defaultedMap20.values();
        boolean b24 = defaultedMap12.equals((java.lang.Object) defaultedMap20);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation27);
        int i31 = defaultedMap30.size();
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str35 = defaultedMap30.toString();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) (-1));
        boolean b38 = defaultedMap20.equals((java.lang.Object) b37);
        java.util.Collection collection39 = defaultedMap20.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44);
        math.genetics.Population population47 = elitisticListPopulation42.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation42.getChromosomes();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome48);
        boolean b50 = defaultedMap20.containsValue((java.lang.Object) list_chromosome48);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{-1=1.0}" + "'", str17.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{-1=1.0}" + "'", str18.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj46 = defaultedMap40.remove((java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation49.addChromosome(chromosome50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation49);
        java.util.Set set53 = defaultedMap52.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58);
        math.genetics.Population population61 = elitisticListPopulation56.nextGeneration();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) population61);
        boolean b63 = defaultedMap40.containsKey((java.lang.Object) map62);
        java.lang.String str64 = defaultedMap40.toString();
        java.lang.Object obj65 = defaultedMap38.get((java.lang.Object) str64);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(population61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        int i13 = elitisticListPopulation10.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation16.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        elitisticListPopulation2.setChromosomes(list_chromosome20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        int i30 = elitisticListPopulation26.getPopulationLimit();
        math.genetics.Population population31 = elitisticListPopulation26.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome32);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i30 == 10);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertNotNull(list_chromosome32);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap15.entrySet();
        int i18 = defaultedMap15.size();
        java.lang.String str19 = defaultedMap15.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) 0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation10.getChromosomes();
        int i13 = elitisticListPopulation10.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation16.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        elitisticListPopulation2.setChromosomes(list_chromosome20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation2.addChromosome(chromosome24);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertNotNull(list_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap13.keySet();
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation26.addChromosome(chromosome27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation26);
        int i30 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str34 = defaultedMap29.toString();
        boolean b36 = defaultedMap29.containsValue((java.lang.Object) (-1));
        boolean b38 = defaultedMap29.containsKey((java.lang.Object) '4');
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap29);
        java.util.Set set40 = defaultedMap29.keySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set40);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{-1=1.0}" + "'", str34.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 100 + "'", obj39.equals((short) 100));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        java.util.Set set23 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) spliterator_chromosome8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i12 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap14.remove((java.lang.Object) defaultedMap16);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        java.util.Set set27 = defaultedMap26.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation30.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Population population35 = elitisticListPopulation30.nextGeneration();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) population35);
        boolean b37 = defaultedMap14.containsKey((java.lang.Object) map36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) map36);
        java.lang.Object obj39 = defaultedMap11.get((java.lang.Object) map36);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome43 = null;
        elitisticListPopulation42.addChromosome(chromosome43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation42);
        int i46 = defaultedMap45.size();
        java.lang.Object obj49 = defaultedMap45.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str50 = defaultedMap45.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation53.addChromosome(chromosome54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation53);
        java.util.Set set57 = defaultedMap56.keySet();
        boolean b58 = defaultedMap45.containsKey((java.lang.Object) set57);
        boolean b60 = defaultedMap45.equals((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap45.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome66 = null;
        elitisticListPopulation65.addChromosome(chromosome66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation65);
        int i69 = defaultedMap68.size();
        java.lang.Object obj72 = defaultedMap68.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate73, predicate76);
        boolean b78 = defaultedMap11.containsKey((java.lang.Object) predicate76);
        boolean b79 = defaultedMap9.containsKey((java.lang.Object) predicate76);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(population35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 'a' + "'", obj39.equals('a'));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{-1=1.0}" + "'", str50.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation25.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation30.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation25.getChromosomes();
        boolean b35 = defaultedMap8.containsValue((java.lang.Object) list_chromosome34);
        java.lang.Object obj37 = defaultedMap8.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation22.addChromosome(chromosome23);
        boolean b25 = defaultedMap18.containsValue((java.lang.Object) elitisticListPopulation22);
        math.genetics.Population population26 = elitisticListPopulation22.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        int i33 = defaultedMap32.size();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) population26, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 1.0d);
        java.util.Collection collection42 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap44.remove((java.lang.Object) defaultedMap46);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation53.addChromosome(chromosome54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation53);
        defaultedMap56.clear();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.util.Collection collection59 = defaultedMap56.values();
        java.lang.Object obj60 = defaultedMap39.put((java.lang.Object) defaultedMap46, (java.lang.Object) collection59);
        java.util.Set set61 = defaultedMap46.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome65 = elitisticListPopulation64.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation64.getChromosomes();
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap46.put((java.lang.Object) elitisticListPopulation64, obj67);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation71);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation71.iterator();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) elitisticListPopulation71);
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) elitisticListPopulation71);
        math.genetics.ElitisticListPopulation elitisticListPopulation80 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome81 = null;
        elitisticListPopulation80.addChromosome(chromosome81);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation80);
        int i84 = defaultedMap83.size();
        java.lang.Object obj87 = defaultedMap83.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome91 = null;
        elitisticListPopulation90.addChromosome(chromosome91);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation90);
        boolean b94 = defaultedMap83.equals((java.lang.Object) defaultedMap93);
        java.util.Set set95 = defaultedMap93.keySet();
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set95);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(spliterator_chromosome65);
        org.junit.Assert.assertNotNull(list_chromosome66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 100 + "'", obj77.equals((short) 100));
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation9);
        defaultedMap12.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) elitisticListPopulation16);
        double d20 = elitisticListPopulation16.getElitismRate();
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) elitisticListPopulation16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) defaultedMap23);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation27);
        int i31 = defaultedMap30.size();
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation37.addChromosome(chromosome38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation37);
        boolean b41 = defaultedMap30.equals((java.lang.Object) defaultedMap40);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = elitisticListPopulation44.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation44.getChromosomes();
        int i47 = elitisticListPopulation44.getPopulationSize();
        java.lang.Object obj48 = defaultedMap40.remove((java.lang.Object) i47);
        java.lang.Object obj49 = defaultedMap23.remove((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome23 = null;
        elitisticListPopulation22.addChromosome(chromosome23);
        boolean b25 = defaultedMap18.containsValue((java.lang.Object) elitisticListPopulation22);
        math.genetics.Population population26 = elitisticListPopulation22.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        int i33 = defaultedMap32.size();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) population26, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 1.0d);
        java.util.Collection collection42 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap44.remove((java.lang.Object) defaultedMap46);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation53.addChromosome(chromosome54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation53);
        defaultedMap56.clear();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.util.Collection collection59 = defaultedMap56.values();
        java.lang.Object obj60 = defaultedMap39.put((java.lang.Object) defaultedMap46, (java.lang.Object) collection59);
        java.util.Set set61 = defaultedMap46.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome65 = elitisticListPopulation64.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome66 = elitisticListPopulation64.getChromosomes();
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap46.put((java.lang.Object) elitisticListPopulation64, obj67);
        math.genetics.ElitisticListPopulation elitisticListPopulation71 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome72 = null;
        elitisticListPopulation71.addChromosome(chromosome72);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation71);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation71.iterator();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) elitisticListPopulation71);
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) elitisticListPopulation71);
        boolean b78 = defaultedMap1.isEmpty();
        java.util.Set set79 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 100 + "'", obj12.equals((short) 100));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(population26);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(spliterator_chromosome65);
        org.junit.Assert.assertNotNull(list_chromosome66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 100 + "'", obj77.equals((short) 100));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation8.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        int i11 = elitisticListPopulation8.getPopulationSize();
        java.lang.String str12 = elitisticListPopulation8.toString();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = arraylist_chromosome14.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome14);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str27 = defaultedMap22.toString();
        java.lang.String str28 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 1.0d);
        java.util.Collection collection33 = defaultedMap30.values();
        boolean b34 = defaultedMap22.equals((java.lang.Object) defaultedMap30);
        java.util.Set set35 = defaultedMap30.keySet();
        boolean b36 = defaultedMap15.equals((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{-1=1.0}" + "'", str27.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        java.util.Set set23 = defaultedMap8.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap8.put((java.lang.Object) elitisticListPopulation26, obj29);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation33);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome37 = elitisticListPopulation33.iterator();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) elitisticListPopulation33);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation41.addChromosome(chromosome42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation41);
        defaultedMap44.clear();
        java.util.Collection collection46 = defaultedMap44.values();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection46);
        int i48 = elitisticListPopulation33.getPopulationLimit();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator_chromosome37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(i48 == 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation20);
        int i24 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str28 = defaultedMap23.toString();
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1));
        boolean b31 = defaultedMap13.equals((java.lang.Object) b30);
        java.util.Collection collection32 = defaultedMap13.values();
        java.lang.String str33 = defaultedMap13.toString();
        defaultedMap13.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{-1=1.0}" + "'", str28.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str7 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap5.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate36);
        boolean b38 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        int i7 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int i9 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        int i10 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome26 = elitisticListPopulation25.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation25.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome31 = elitisticListPopulation30.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome34 = elitisticListPopulation25.getChromosomes();
        boolean b35 = defaultedMap8.containsValue((java.lang.Object) list_chromosome34);
        int i36 = defaultedMap8.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(spliterator_chromosome26);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(spliterator_chromosome31);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(list_chromosome34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str5 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12);
        math.genetics.Population population15 = elitisticListPopulation10.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome17);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertNotNull(list_chromosome17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation8);
        int i12 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        int i17 = defaultedMap11.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = elitisticListPopulation20.spliterator();
        int i22 = elitisticListPopulation20.getPopulationSize();
        int i23 = elitisticListPopulation20.getPopulationSize();
        elitisticListPopulation20.setPopulationLimit((int) 'a');
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation28.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome34 = elitisticListPopulation20.iterator();
        boolean b35 = defaultedMap11.containsValue((java.lang.Object) elitisticListPopulation20);
        defaultedMap11.clear();
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        double d8 = elitisticListPopulation2.getElitismRate();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation11.spliterator();
        int i13 = elitisticListPopulation11.getPopulationSize();
        int i14 = elitisticListPopulation11.getPopulationSize();
        elitisticListPopulation11.setPopulationLimit((int) 'a');
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        double d9 = elitisticListPopulation2.getElitismRate();
        int i10 = elitisticListPopulation2.getPopulationLimit();
        double d11 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(d11 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome10 = elitisticListPopulation2.spliterator();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) (-1));
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) '4');
        java.util.Collection collection15 = defaultedMap5.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation18.addChromosome(chromosome19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        int i22 = defaultedMap21.size();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation28.addChromosome(chromosome29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation28);
        boolean b32 = defaultedMap21.equals((java.lang.Object) defaultedMap31);
        java.util.Set set33 = defaultedMap31.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) elitisticListPopulation36);
        boolean b40 = defaultedMap5.containsValue((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) elitisticListPopulation19);
        double d23 = elitisticListPopulation19.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome24);
        int i26 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection32 = defaultedMap29.values();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertTrue(i26 == 100);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str15 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation18.addChromosome(chromosome19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap10.containsKey((java.lang.Object) set22);
        boolean b25 = defaultedMap10.equals((java.lang.Object) 0.0d);
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) 0L);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b29 = defaultedMap1.isEmpty();
        java.util.Collection collection30 = defaultedMap1.values();
        java.util.Set set31 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation34.addChromosome(chromosome35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation34);
        int i38 = defaultedMap37.size();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str42 = defaultedMap37.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation45);
        java.util.Set set49 = defaultedMap48.keySet();
        boolean b50 = defaultedMap37.containsKey((java.lang.Object) set49);
        java.lang.String str51 = defaultedMap37.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap37);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome56 = elitisticListPopulation55.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation55.getChromosomes();
        int i58 = elitisticListPopulation55.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome59 = elitisticListPopulation55.spliterator();
        java.lang.String str60 = elitisticListPopulation55.toString();
        int i61 = elitisticListPopulation55.getPopulationLimit();
        math.genetics.Population population62 = elitisticListPopulation55.nextGeneration();
        java.lang.Object obj63 = defaultedMap37.get((java.lang.Object) elitisticListPopulation55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{-1=1.0}" + "'", str15.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{-1=1.0}" + "'", str42.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{-1=1.0}" + "'", str51.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(spliterator_chromosome56);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]" + "'", str60.equals("[]"));
        org.junit.Assert.assertTrue(i61 == 10);
        org.junit.Assert.assertNotNull(population62);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation15.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation15);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) collection21);
        java.util.Set set23 = defaultedMap8.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap8.put((java.lang.Object) elitisticListPopulation26, obj29);
        math.genetics.Population population31 = elitisticListPopulation26.nextGeneration();
        int i32 = elitisticListPopulation26.getPopulationLimit();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue(i32 == 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation2.iterator();
        int i10 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        int i12 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1.0d);
        java.util.Collection collection16 = defaultedMap13.values();
        boolean b17 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap13.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = elitisticListPopulation21.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation21.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation21.getChromosomes();
        boolean b31 = defaultedMap13.containsValue((java.lang.Object) list_chromosome30);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1=1.0}" + "'", str11.equals("{-1=1.0}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 100, 1.0d);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        java.util.Set set10 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation7.addChromosome(chromosome8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation7);
        int i11 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str15 = defaultedMap10.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation18.addChromosome(chromosome19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation18);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap10.containsKey((java.lang.Object) set22);
        boolean b25 = defaultedMap10.equals((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap10.containsKey((java.lang.Object) 1L);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation30);
        int i34 = defaultedMap33.size();
        java.lang.Object obj37 = defaultedMap33.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate38, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap10);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome48 = elitisticListPopulation47.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation47.getChromosomes();
        int i50 = elitisticListPopulation47.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation47.getChromosomes();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) list_chromosome51);
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation55.addChromosome(chromosome56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation55);
        int i59 = defaultedMap58.size();
        java.lang.String str60 = defaultedMap58.toString();
        java.lang.Object obj61 = defaultedMap10.put((java.lang.Object) list_chromosome51, (java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{-1=1.0}" + "'", str15.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(spliterator_chromosome48);
        org.junit.Assert.assertNotNull(list_chromosome49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(list_chromosome51);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.String str10 = defaultedMap5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation13);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap5.containsKey((java.lang.Object) set17);
        boolean b20 = defaultedMap5.equals((java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation23);
        int i27 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        defaultedMap5.putAll(map33);
        java.lang.String str35 = defaultedMap5.toString();
        boolean b36 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{-1=1.0}" + "'", str10.equals("{-1=1.0}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1=1.0}" + "'", str35.equals("{-1=1.0}"));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        double d13 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation9.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        defaultedMap20.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) elitisticListPopulation24);
        double d28 = elitisticListPopulation24.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome29 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation9.setChromosomes(list_chromosome29);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation9.addChromosome(chromosome31);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation9.addChromosome(chromosome33);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d13 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome29);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        defaultedMap5.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation9.addChromosome(chromosome10);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) elitisticListPopulation9);
        int i13 = defaultedMap5.size();
        java.util.Set set14 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation17.addChromosome(chromosome18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation17);
        int i21 = defaultedMap20.size();
        java.lang.Object obj24 = defaultedMap20.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation27.addChromosome(chromosome28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation27);
        boolean b31 = defaultedMap20.equals((java.lang.Object) defaultedMap30);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome35 = elitisticListPopulation34.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome36 = elitisticListPopulation34.getChromosomes();
        int i37 = elitisticListPopulation34.getPopulationSize();
        java.lang.Object obj38 = defaultedMap30.remove((java.lang.Object) i37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj46 = defaultedMap40.remove((java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome50 = null;
        elitisticListPopulation49.addChromosome(chromosome50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation49);
        java.util.Set set53 = defaultedMap52.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array57 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome58 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58, chromosome_array57);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome58);
        math.genetics.Population population61 = elitisticListPopulation56.nextGeneration();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) population61);
        boolean b63 = defaultedMap40.containsKey((java.lang.Object) map62);
        java.lang.String str64 = defaultedMap40.toString();
        java.lang.Object obj65 = defaultedMap30.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj66 = defaultedMap5.get((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome35);
        org.junit.Assert.assertNotNull(list_chromosome36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(chromosome_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(population61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation2.getChromosomes();
        int i11 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation8.addChromosome(chromosome9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation8);
        int i12 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        int i23 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation29);
        boolean b33 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome37 = elitisticListPopulation36.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome38 = elitisticListPopulation36.getChromosomes();
        int i39 = elitisticListPopulation36.getPopulationSize();
        java.lang.Object obj40 = defaultedMap32.remove((java.lang.Object) i39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj48 = defaultedMap42.remove((java.lang.Object) defaultedMap44);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome52 = null;
        elitisticListPopulation51.addChromosome(chromosome52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation51);
        java.util.Set set55 = defaultedMap54.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60);
        math.genetics.Population population63 = elitisticListPopulation58.nextGeneration();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) population63);
        boolean b65 = defaultedMap42.containsKey((java.lang.Object) map64);
        java.lang.String str66 = defaultedMap42.toString();
        java.lang.Object obj67 = defaultedMap32.get((java.lang.Object) defaultedMap42);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation70.addChromosome(chromosome71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation70);
        java.util.Set set74 = defaultedMap73.keySet();
        java.util.Set set75 = defaultedMap73.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome79 = elitisticListPopulation78.spliterator();
        java.lang.Object obj80 = defaultedMap73.get((java.lang.Object) spliterator_chromosome79);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) spliterator_chromosome79);
        defaultedMap11.putAll(map81);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome37);
        org.junit.Assert.assertNotNull(list_chromosome38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(spliterator_chromosome79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4);
        math.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation7.spliterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(list_chromosome11, (int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        int i6 = defaultedMap5.size();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation12);
        boolean b16 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        int i29 = defaultedMap28.size();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap5.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection35 = defaultedMap5.values();
        java.util.Set set36 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome40 = null;
        elitisticListPopulation39.addChromosome(chromosome40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation39);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 0.0f);
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation45.addChromosome(chromosome46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation45);
        int i49 = defaultedMap48.size();
        java.lang.Object obj52 = defaultedMap48.put((java.lang.Object) ' ', (java.lang.Object) (-1L));
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b54 = defaultedMap5.equals((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
    }
}

