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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 1, (double) 0.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.lang.String str21 = elitisticListPopulation19.toString();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        try {
            elitisticListPopulation5.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = arraylist_chromosome9.spliterator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        defaultedMap7.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        double d9 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation5.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) '4', (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation(list_chromosome9, (int) (short) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        boolean b9 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (byte) 1, (double) 0.0f);
        boolean b43 = defaultedMap18.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 1, (double) 0.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.lang.String str21 = elitisticListPopulation19.toString();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = null;
        try {
            elitisticListPopulation5.setChromosomes(list_chromosome8);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        double d9 = elitisticListPopulation5.getElitismRate();
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        java.util.Collection<math.genetics.Chromosome> collection_chromosome12 = null;
        try {
            elitisticListPopulation5.addChromosomes(collection_chromosome12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.lang.String str19 = elitisticListPopulation17.toString();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation17);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b33 = defaultedMap31.isEmpty();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        try {
            java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate27, predicate38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        double d14 = elitisticListPopulation5.getElitismRate();
        double d15 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        java.lang.String str18 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[null]" + "'", str18.equals("[null]"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap1.toString();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=10}" + "'", str9.equals("{hi!=10}"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population23 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) ' ');
        elitisticListPopulation5.setElitismRate((double) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population23);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        double d14 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(d14 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(population14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation5.addChromosome(chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        int i63 = elitisticListPopulation60.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation60.iterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation60);
        try {
            math.genetics.Chromosome chromosome70 = elitisticListPopulation60.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        elitisticListPopulation5.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        int i63 = elitisticListPopulation60.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation60.iterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation60);
        try {
            elitisticListPopulation60.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        double d9 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) 1L);
        try {
            math.genetics.Chromosome chromosome16 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population23 = elitisticListPopulation5.nextGeneration();
        double d24 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue(d24 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) d7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        int i10 = elitisticListPopulation5.getPopulationSize();
        int i11 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection24 = defaultedMap18.values();
        int i25 = defaultedMap18.size();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap8.get((java.lang.Object) predicate26);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.lang.String str11 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]" + "'", str11.equals("[null]"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (byte) 1, (double) 0.0f);
        double d28 = elitisticListPopulation27.getElitismRate();
        java.lang.String str29 = elitisticListPopulation27.toString();
        int i30 = elitisticListPopulation27.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation27.iterator();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        boolean b46 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap44.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome57 = arraylist_chromosome52.spliterator();
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome52);
        java.util.Collection collection59 = defaultedMap44.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str62 = defaultedMap61.toString();
        boolean b63 = defaultedMap61.isEmpty();
        java.lang.Object obj66 = defaultedMap61.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set67 = defaultedMap61.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str70 = defaultedMap69.toString();
        java.util.Set set71 = defaultedMap69.entrySet();
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) false);
        defaultedMap61.putAll((java.util.Map) defaultedMap69);
        java.util.Set set75 = defaultedMap61.entrySet();
        java.lang.Object obj77 = defaultedMap44.put((java.lang.Object) defaultedMap61, (java.lang.Object) false);
        java.lang.Object obj78 = defaultedMap4.put((java.lang.Object) arraylist_chromosome37, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        java.lang.String str40 = defaultedMap24.toString();
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{hi!=10}" + "'", str40.equals("{hi!=10}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap1.toString();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{hi!=10}" + "'", str9.equals("{hi!=10}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str58 = elitisticListPopulation57.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome59 = elitisticListPopulation57.getChromosomes();
        java.lang.Object obj61 = defaultedMap53.put((java.lang.Object) elitisticListPopulation57, (java.lang.Object) 0L);
        try {
            elitisticListPopulation57.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]" + "'", str58.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome59);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj19 = null;
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, obj19);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        math.genetics.Chromosome[] chromosome_array11 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome12 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome12, chromosome_array11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome12, (int) (byte) 1, (double) 0.0f);
        double d17 = elitisticListPopulation16.getElitismRate();
        java.lang.String str18 = elitisticListPopulation16.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation16.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(d17 == 0.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        int i12 = elitisticListPopulation5.getPopulationLimit();
        int i13 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        double d14 = elitisticListPopulation5.getElitismRate();
        int i15 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str8 = defaultedMap7.toString();
        boolean b9 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) false);
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        defaultedMap4.putAll((java.util.Map) defaultedMap7);
        int i22 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        boolean b29 = defaultedMap27.isEmpty();
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set33 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Set set37 = defaultedMap35.entrySet();
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) false);
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        defaultedMap7.putAll((java.util.Map) defaultedMap27);
        java.lang.String str43 = defaultedMap7.toString();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (byte) 1, (double) 0.0f);
        double d50 = elitisticListPopulation49.getElitismRate();
        java.lang.String str51 = elitisticListPopulation49.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome52 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) (byte) 1, (double) 0.0f);
        double d59 = elitisticListPopulation58.getElitismRate();
        java.lang.String str60 = elitisticListPopulation58.toString();
        java.lang.String str61 = elitisticListPopulation58.toString();
        math.genetics.Chromosome[] chromosome_array62 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome63 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63, chromosome_array62);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome63);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome63);
        math.genetics.Population population67 = elitisticListPopulation49.nextGeneration();
        java.lang.Object obj68 = defaultedMap1.put((java.lang.Object) str43, (java.lang.Object) population67);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{hi!=10}" + "'", str43.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome52);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(d59 == 0.0d);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]" + "'", str60.equals("[]"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[]" + "'", str61.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(population67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int i5 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        java.util.Collection collection23 = defaultedMap4.values();
        boolean b24 = defaultedMap4.isEmpty();
        java.util.Set set25 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str8 = defaultedMap7.toString();
        boolean b9 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap7.entrySet();
        boolean b15 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b19 = defaultedMap17.isEmpty();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set23 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Set set27 = defaultedMap25.entrySet();
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) false);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap25);
        java.util.Set set32 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome28);
        defaultedMap20.clear();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set40 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 1, (double) 0.0f);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.lang.String str11 = elitisticListPopulation9.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation9.addChromosome(chromosome13);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation9.getChromosomes();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) list_chromosome15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 1, (double) 0.0f);
        double d23 = elitisticListPopulation22.getElitismRate();
        java.lang.String str24 = elitisticListPopulation22.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation22.iterator();
        double d26 = elitisticListPopulation22.getElitismRate();
        double d27 = elitisticListPopulation22.getElitismRate();
        math.genetics.Population population28 = elitisticListPopulation22.nextGeneration();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        int i33 = elitisticListPopulation31.getPopulationSize();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) population28, (java.lang.Object) i33);
        java.util.Set set35 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertNotNull(population28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        int i63 = elitisticListPopulation60.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation60.iterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation60);
        math.genetics.Chromosome chromosome70 = null;
        elitisticListPopulation60.addChromosome(chromosome70);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        int i10 = elitisticListPopulation5.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str8 = defaultedMap7.toString();
        boolean b9 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set13 = defaultedMap7.entrySet();
        boolean b15 = defaultedMap7.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b19 = defaultedMap17.isEmpty();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set23 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Set set27 = defaultedMap25.entrySet();
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) false);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap25);
        java.lang.String str32 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{{hi!=10}={}}" + "'", str32.equals("{{hi!=10}={}}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        int i63 = elitisticListPopulation60.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation60.iterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation60);
        try {
            elitisticListPopulation60.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        double d14 = elitisticListPopulation5.getElitismRate();
        double d15 = elitisticListPopulation5.getElitismRate();
        java.lang.String str16 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b29 = defaultedMap22.equals((java.lang.Object) (short) 10);
        java.lang.String str30 = defaultedMap22.toString();
        boolean b32 = defaultedMap22.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b36 = defaultedMap34.isEmpty();
        math.genetics.Chromosome[] chromosome_array37 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome38 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome38, chromosome_array37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome38, (int) (byte) 1, (double) 0.0f);
        double d43 = elitisticListPopulation42.getElitismRate();
        java.lang.String str44 = elitisticListPopulation42.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome45 = elitisticListPopulation42.iterator();
        math.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation42.addChromosome(chromosome46);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation42.getChromosomes();
        boolean b49 = defaultedMap34.containsValue((java.lang.Object) list_chromosome48);
        boolean b50 = defaultedMap22.containsKey((java.lang.Object) list_chromosome48);
        defaultedMap4.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{hi!=10}" + "'", str30.equals("{hi!=10}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(chromosome_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]" + "'", str44.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome45);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Set set9 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 1, (double) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Set set47 = defaultedMap27.entrySet();
        java.lang.Object obj49 = defaultedMap27.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        try {
            elitisticListPopulation5.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (byte) 1, (double) 0.0f);
        double d14 = elitisticListPopulation13.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation13.iterator();
        java.lang.String str16 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation13.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome18 = elitisticListPopulation13.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(iterator_chromosome18);
        org.junit.Assert.assertNotNull(list_chromosome19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (byte) 1, (double) 0.0f);
        double d22 = elitisticListPopulation21.getElitismRate();
        java.lang.String str23 = elitisticListPopulation21.toString();
        int i24 = elitisticListPopulation21.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation21.iterator();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        java.lang.String str40 = defaultedMap24.toString();
        java.util.Set set41 = defaultedMap24.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{hi!=10}" + "'", str40.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome28);
        defaultedMap20.clear();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str40 = elitisticListPopulation39.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        boolean b42 = defaultedMap20.containsValue((java.lang.Object) elitisticListPopulation39);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]" + "'", str40.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        boolean b17 = defaultedMap9.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) false);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i35 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        boolean b42 = defaultedMap40.isEmpty();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        java.util.Set set50 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) false);
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        java.lang.String str56 = defaultedMap40.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) (byte) 1, (double) 0.0f);
        double d64 = elitisticListPopulation63.getElitismRate();
        java.lang.String str65 = elitisticListPopulation63.toString();
        int i66 = elitisticListPopulation63.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome67 = elitisticListPopulation63.iterator();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str70 = defaultedMap69.toString();
        int i71 = defaultedMap69.size();
        java.lang.Object obj72 = defaultedMap40.put((java.lang.Object) elitisticListPopulation63, (java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=10}" + "'", str56.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(d64 == 0.0d);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b19 = defaultedMap4.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation5.getChromosomes();
        double d10 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) 1L);
        int i16 = elitisticListPopulation5.getPopulationSize();
        double d17 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(d17 == 1.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        int i4 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        defaultedMap24.clear();
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (byte) 1, (double) 0.0f);
        double d47 = elitisticListPopulation46.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation46.iterator();
        java.lang.String str49 = elitisticListPopulation46.toString();
        double d50 = elitisticListPopulation46.getElitismRate();
        java.lang.Object obj51 = defaultedMap24.remove((java.lang.Object) d50);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(d47 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) false);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i35 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        boolean b42 = defaultedMap40.isEmpty();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        java.util.Set set50 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) false);
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        java.lang.String str56 = defaultedMap40.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        java.util.Set set58 = defaultedMap1.keySet();
        boolean b59 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=10}" + "'", str56.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b10 = defaultedMap8.isEmpty();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome21 = arraylist_chromosome16.spliterator();
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome16);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        math.genetics.Chromosome[] chromosome_array16 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome17 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome17, chromosome_array16);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome17, (int) (byte) 1, (double) 0.0f);
        double d22 = elitisticListPopulation21.getElitismRate();
        java.lang.String str23 = elitisticListPopulation21.toString();
        int i24 = elitisticListPopulation21.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation21.iterator();
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27);
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation21.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        math.genetics.Population population39 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d22 == 0.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(population39);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation10.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome16 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome16);
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertNotNull(list_chromosome16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.lang.String str19 = elitisticListPopulation17.toString();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation17);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation17.getChromosomes();
        java.lang.String str22 = elitisticListPopulation17.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        int i23 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        int i16 = defaultedMap9.size();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        java.lang.String str20 = defaultedMap9.toString();
        java.lang.String str21 = defaultedMap9.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set44 = defaultedMap38.entrySet();
        boolean b45 = defaultedMap38.isEmpty();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) (byte) 1, (double) 0.0f);
        double d52 = elitisticListPopulation51.getElitismRate();
        java.lang.String str53 = elitisticListPopulation51.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation51.iterator();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        java.lang.String str63 = elitisticListPopulation60.toString();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str71 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str74 = defaultedMap73.toString();
        boolean b75 = defaultedMap73.isEmpty();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set79 = defaultedMap73.entrySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str82 = defaultedMap81.toString();
        java.util.Set set83 = defaultedMap81.entrySet();
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) false);
        defaultedMap73.putAll((java.util.Map) defaultedMap81);
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        int i88 = defaultedMap73.size();
        int i89 = defaultedMap73.size();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap73);
        java.lang.Object obj91 = defaultedMap38.put((java.lang.Object) arraylist_chromosome65, (java.lang.Object) defaultedMap90);
        defaultedMap18.putAll((java.util.Map) defaultedMap90);
        java.lang.String str93 = defaultedMap90.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(d52 == 0.0d);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]" + "'", str63.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i88 == 1);
        org.junit.Assert.assertTrue(i89 == 1);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        int i16 = defaultedMap9.size();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        java.lang.String str20 = defaultedMap9.toString();
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setPopulationLimit((int) (short) 10);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) (byte) 1, (double) 0.0f);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.lang.String str10 = elitisticListPopulation8.toString();
        int i11 = elitisticListPopulation8.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation8.iterator();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 1, (double) 0.0f);
        double d23 = elitisticListPopulation22.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation22.iterator();
        java.lang.String str25 = elitisticListPopulation22.toString();
        double d26 = elitisticListPopulation22.getElitismRate();
        elitisticListPopulation22.setPopulationLimit((int) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap30.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) (byte) 1, (double) 0.0f);
        double d40 = elitisticListPopulation39.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation39.iterator();
        java.lang.String str42 = elitisticListPopulation39.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation39.getChromosomes();
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) list_chromosome43);
        elitisticListPopulation22.setChromosomes(list_chromosome43);
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) arraylist_chromosome14, (java.lang.Object) elitisticListPopulation22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue(d26 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(d40 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[]" + "'", str42.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str26 = elitisticListPopulation25.toString();
        int i27 = elitisticListPopulation25.getPopulationSize();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        boolean b29 = defaultedMap4.containsValue((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b36 = defaultedMap34.isEmpty();
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set40 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        java.util.Set set44 = defaultedMap42.entrySet();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) false);
        defaultedMap34.putAll((java.util.Map) defaultedMap42);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        int i49 = defaultedMap34.size();
        int i50 = defaultedMap34.size();
        java.util.Set set51 = defaultedMap34.keySet();
        java.util.Set set52 = defaultedMap34.entrySet();
        java.util.Collection collection53 = defaultedMap34.values();
        java.util.Set set54 = defaultedMap34.keySet();
        boolean b55 = defaultedMap28.equals((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome28);
        defaultedMap20.clear();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) false);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i35 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        boolean b42 = defaultedMap40.isEmpty();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        java.util.Set set50 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) false);
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        java.lang.String str56 = defaultedMap40.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) (byte) 1, (double) 0.0f);
        double d64 = elitisticListPopulation63.getElitismRate();
        java.lang.String str65 = elitisticListPopulation63.toString();
        int i66 = elitisticListPopulation63.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome67 = elitisticListPopulation63.iterator();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str70 = defaultedMap69.toString();
        int i71 = defaultedMap69.size();
        java.lang.Object obj72 = defaultedMap40.put((java.lang.Object) elitisticListPopulation63, (java.lang.Object) defaultedMap69);
        java.util.List<math.genetics.Chromosome> list_chromosome73 = elitisticListPopulation63.getChromosomes();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=10}" + "'", str56.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(d64 == 0.0d);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(list_chromosome73);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        java.util.Collection collection20 = defaultedMap4.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        java.lang.String str13 = elitisticListPopulation5.toString();
        double d14 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome15 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome15);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertTrue(d14 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 1L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        elitisticListPopulation5.setElitismRate((double) 1L);
        int i16 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection47 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        java.util.Collection collection37 = defaultedMap18.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        int i7 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (byte) 1, (double) 0.0f);
        double d14 = elitisticListPopulation13.getElitismRate();
        java.lang.String str15 = elitisticListPopulation13.toString();
        int i16 = elitisticListPopulation13.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation13.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) (byte) 1, (double) 0.0f);
        double d28 = elitisticListPopulation27.getElitismRate();
        java.lang.String str29 = elitisticListPopulation27.toString();
        int i30 = elitisticListPopulation27.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation27.iterator();
        math.genetics.Chromosome[] chromosome_array32 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome33 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33, chromosome_array32);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome33);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation27.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation13.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) '4', (double) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertNotNull(chromosome_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        int i9 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Set set22 = defaultedMap20.entrySet();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b31 = defaultedMap29.isEmpty();
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set35 = defaultedMap29.entrySet();
        boolean b37 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        math.genetics.ElitisticListPopulation elitisticListPopulation44 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40, (int) (byte) 1, (double) 0.0f);
        double d45 = elitisticListPopulation44.getElitismRate();
        java.lang.String str46 = elitisticListPopulation44.toString();
        int i47 = elitisticListPopulation44.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome48 = elitisticListPopulation44.iterator();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation44.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        math.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation44.addChromosome(chromosome53);
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        int i63 = elitisticListPopulation60.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome64 = elitisticListPopulation60.iterator();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        math.genetics.ElitisticListPopulation elitisticListPopulation74 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation60.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70);
        elitisticListPopulation44.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome70);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj78 = defaultedMap26.get((java.lang.Object) elitisticListPopulation44);
        java.lang.Object obj79 = defaultedMap1.get((java.lang.Object) elitisticListPopulation44);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(d45 == 0.0d);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome48);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome64);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + false + "'", obj78.equals(false));
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + false + "'", obj79.equals(false));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        int i13 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome14 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome14);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = arraylist_chromosome1.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = arraylist_chromosome1.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation14.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome20);
        int i22 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertNotNull(list_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = arraylist_chromosome1.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.lang.String str19 = elitisticListPopulation17.toString();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation17);
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 1, (double) 0.0f);
        double d27 = elitisticListPopulation26.getElitismRate();
        double d28 = elitisticListPopulation26.getElitismRate();
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) elitisticListPopulation26);
        try {
            math.genetics.Chromosome chromosome30 = elitisticListPopulation26.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation14.iterator();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19, (int) (byte) 1, (double) 0.0f);
        double d24 = elitisticListPopulation23.getElitismRate();
        java.lang.String str25 = elitisticListPopulation23.toString();
        java.lang.String str26 = elitisticListPopulation23.toString();
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        elitisticListPopulation23.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28);
        elitisticListPopulation14.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set42 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) false);
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        defaultedMap33.putAll((java.util.Map) defaultedMap36);
        int i51 = defaultedMap36.size();
        int i52 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) arraylist_chromosome28, (java.lang.Object) defaultedMap53);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(d24 == 0.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome9);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b20 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate24);
        int i28 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i28 == 2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.lang.String str12 = elitisticListPopulation10.toString();
        int i13 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation10.iterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation10.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) list_chromosome21);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Set set47 = defaultedMap27.entrySet();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population54 = elitisticListPopulation53.nextGeneration();
        int i55 = elitisticListPopulation53.getPopulationLimit();
        elitisticListPopulation53.setPopulationLimit((int) (short) 10);
        boolean b58 = defaultedMap27.containsKey((java.lang.Object) elitisticListPopulation53);
        boolean b59 = defaultedMap27.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(population54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population6 = elitisticListPopulation5.nextGeneration();
        int i7 = elitisticListPopulation5.getPopulationSize();
        try {
            elitisticListPopulation5.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.lang.String str19 = elitisticListPopulation17.toString();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation17);
        try {
            math.genetics.Chromosome chromosome21 = elitisticListPopulation17.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) false);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.util.Collection collection25 = defaultedMap19.values();
        int i26 = defaultedMap19.size();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate28);
        java.lang.String str30 = defaultedMap19.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str24 = defaultedMap23.toString();
        boolean b25 = defaultedMap23.isEmpty();
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b30 = defaultedMap23.isEmpty();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome32, (int) (byte) 1, (double) 0.0f);
        double d37 = elitisticListPopulation36.getElitismRate();
        java.lang.String str38 = elitisticListPopulation36.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation36.iterator();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome41, (int) (byte) 1, (double) 0.0f);
        double d46 = elitisticListPopulation45.getElitismRate();
        java.lang.String str47 = elitisticListPopulation45.toString();
        java.lang.String str48 = elitisticListPopulation45.toString();
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        elitisticListPopulation45.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50);
        elitisticListPopulation36.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str56 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str59 = defaultedMap58.toString();
        boolean b60 = defaultedMap58.isEmpty();
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str67 = defaultedMap66.toString();
        java.util.Set set68 = defaultedMap66.entrySet();
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) false);
        defaultedMap58.putAll((java.util.Map) defaultedMap66);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        int i73 = defaultedMap58.size();
        int i74 = defaultedMap58.size();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap58);
        java.lang.Object obj76 = defaultedMap23.put((java.lang.Object) arraylist_chromosome50, (java.lang.Object) defaultedMap75);
        defaultedMap23.clear();
        math.genetics.Chromosome[] chromosome_array78 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome79 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome79, chromosome_array78);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome79, (int) (byte) 1, (double) 0.0f);
        double d84 = elitisticListPopulation83.getElitismRate();
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation83.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome86);
        java.lang.Object obj92 = defaultedMap4.put((java.lang.Object) defaultedMap23, (java.lang.Object) arraylist_chromosome86);
        java.util.Set set93 = defaultedMap23.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(d37 == 0.0d);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(d46 == 0.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]" + "'", str47.equals("[]"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]" + "'", str48.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i73 == 1);
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(chromosome_array78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(d84 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set44 = defaultedMap38.entrySet();
        boolean b45 = defaultedMap38.isEmpty();
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) (byte) 1, (double) 0.0f);
        double d52 = elitisticListPopulation51.getElitismRate();
        java.lang.String str53 = elitisticListPopulation51.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome54 = elitisticListPopulation51.iterator();
        math.genetics.Chromosome[] chromosome_array55 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome56 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome56, chromosome_array55);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome56, (int) (byte) 1, (double) 0.0f);
        double d61 = elitisticListPopulation60.getElitismRate();
        java.lang.String str62 = elitisticListPopulation60.toString();
        java.lang.String str63 = elitisticListPopulation60.toString();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation60.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str71 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str74 = defaultedMap73.toString();
        boolean b75 = defaultedMap73.isEmpty();
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set79 = defaultedMap73.entrySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str82 = defaultedMap81.toString();
        java.util.Set set83 = defaultedMap81.entrySet();
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) false);
        defaultedMap73.putAll((java.util.Map) defaultedMap81);
        defaultedMap70.putAll((java.util.Map) defaultedMap73);
        int i88 = defaultedMap73.size();
        int i89 = defaultedMap73.size();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap73);
        java.lang.Object obj91 = defaultedMap38.put((java.lang.Object) arraylist_chromosome65, (java.lang.Object) defaultedMap90);
        defaultedMap18.putAll((java.util.Map) defaultedMap90);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str95 = defaultedMap94.toString();
        java.util.Set set96 = defaultedMap94.entrySet();
        boolean b97 = defaultedMap90.containsKey((java.lang.Object) set96);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(d52 == 0.0d);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]" + "'", str53.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome54);
        org.junit.Assert.assertNotNull(chromosome_array55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]" + "'", str62.equals("[]"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]" + "'", str63.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i88 == 1);
        org.junit.Assert.assertTrue(i89 == 1);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "{}" + "'", str95.equals("{}"));
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        double d9 = elitisticListPopulation5.getElitismRate();
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        int i13 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 1, (double) 0.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.lang.String str21 = elitisticListPopulation19.toString();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        int i36 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(list_chromosome11, (int) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Set set7 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Set set12 = defaultedMap9.keySet();
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b20 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set24 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Set set28 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) false);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        int i33 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str36 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set44 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str47 = defaultedMap46.toString();
        java.util.Set set48 = defaultedMap46.entrySet();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) false);
        defaultedMap38.putAll((java.util.Map) defaultedMap46);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap38);
        java.lang.String str54 = defaultedMap38.toString();
        java.lang.Object obj55 = defaultedMap5.get((java.lang.Object) str54);
        java.lang.String str56 = defaultedMap5.toString();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) '4');
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{hi!=10}" + "'", str54.equals("{hi!=10}"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        int i4 = elitisticListPopulation2.getPopulationSize();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation2);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        math.genetics.Population population23 = elitisticListPopulation5.nextGeneration();
        try {
            elitisticListPopulation5.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(population23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome9);
        java.util.Collection collection16 = defaultedMap1.values();
        java.util.Collection collection17 = defaultedMap1.values();
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        int i51 = elitisticListPopulation50.getPopulationLimit();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation50);
        boolean b53 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str56 = defaultedMap55.toString();
        java.util.Set set57 = defaultedMap55.entrySet();
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) (byte) 1, (double) 0.0f);
        double d65 = elitisticListPopulation64.getElitismRate();
        java.lang.String str66 = elitisticListPopulation64.toString();
        int i67 = elitisticListPopulation64.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome68 = elitisticListPopulation64.iterator();
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70);
        math.genetics.Chromosome chromosome73 = null;
        elitisticListPopulation64.addChromosome(chromosome73);
        java.util.List<math.genetics.Chromosome> list_chromosome75 = elitisticListPopulation64.getChromosomes();
        java.lang.Object obj76 = defaultedMap55.put((java.lang.Object) 10, (java.lang.Object) list_chromosome75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str79 = defaultedMap78.toString();
        boolean b80 = defaultedMap78.isEmpty();
        java.lang.Object obj81 = defaultedMap55.get((java.lang.Object) defaultedMap78);
        math.genetics.ElitisticListPopulation elitisticListPopulation84 = new math.genetics.ElitisticListPopulation((int) '#', (double) 1L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome85 = elitisticListPopulation84.iterator();
        java.lang.Object obj86 = defaultedMap78.remove((java.lang.Object) elitisticListPopulation84);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str89 = defaultedMap88.toString();
        boolean b90 = defaultedMap88.isEmpty();
        java.lang.Object obj93 = defaultedMap88.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.lang.Object obj94 = defaultedMap1.put(obj86, obj93);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i51 == 10);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome68);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(list_chromosome75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + false + "'", obj81.equals(false));
        org.junit.Assert.assertNotNull(iterator_chromosome85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        double d9 = elitisticListPopulation5.getElitismRate();
        double d10 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population11 = elitisticListPopulation5.nextGeneration();
        math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation5.addChromosome(chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(population12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Set set47 = defaultedMap27.entrySet();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population54 = elitisticListPopulation53.nextGeneration();
        int i55 = elitisticListPopulation53.getPopulationLimit();
        elitisticListPopulation53.setPopulationLimit((int) (short) 10);
        boolean b58 = defaultedMap27.containsKey((java.lang.Object) elitisticListPopulation53);
        try {
            math.genetics.Chromosome chromosome59 = elitisticListPopulation53.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(population54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        double d12 = elitisticListPopulation5.getElitismRate();
        java.lang.String str13 = elitisticListPopulation5.toString();
        double d14 = elitisticListPopulation5.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{hi!=10}" + "'", str10.equals("{hi!=10}"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        java.util.Set set17 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 1, (double) 0.0f);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.lang.String str11 = elitisticListPopulation9.toString();
        int i12 = elitisticListPopulation9.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation9);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation9.addChromosome(chromosome19);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        java.util.Collection collection23 = defaultedMap4.values();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap25);
        java.util.Collection collection27 = defaultedMap4.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        java.lang.String str40 = defaultedMap24.toString();
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap24.equals(obj41);
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome44, (int) (byte) 1, (double) 0.0f);
        double d49 = elitisticListPopulation48.getElitismRate();
        int i50 = elitisticListPopulation48.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array51 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome52 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome52, chromosome_array51);
        math.genetics.ElitisticListPopulation elitisticListPopulation56 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome52, (int) (byte) 1, (double) 0.0f);
        double d57 = elitisticListPopulation56.getElitismRate();
        int i58 = elitisticListPopulation56.getPopulationSize();
        math.genetics.Chromosome[] chromosome_array59 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome60 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome60, chromosome_array59);
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome60, (int) (byte) 1, (double) 0.0f);
        double d65 = elitisticListPopulation64.getElitismRate();
        java.lang.String str66 = elitisticListPopulation64.toString();
        int i67 = elitisticListPopulation64.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome68 = elitisticListPopulation64.iterator();
        math.genetics.Chromosome[] chromosome_array69 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome70 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b71 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70, chromosome_array69);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome70);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74, (int) (byte) 1, (double) 0.0f);
        double d79 = elitisticListPopulation78.getElitismRate();
        java.lang.String str80 = elitisticListPopulation78.toString();
        int i81 = elitisticListPopulation78.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome82 = elitisticListPopulation78.iterator();
        math.genetics.Chromosome[] chromosome_array83 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome84 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome84, chromosome_array83);
        elitisticListPopulation78.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome84);
        math.genetics.Chromosome[] chromosome_array87 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome88 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88, chromosome_array87);
        math.genetics.ElitisticListPopulation elitisticListPopulation92 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation78.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation64.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation56.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome88);
        elitisticListPopulation48.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome88);
        java.lang.Object obj97 = defaultedMap24.get((java.lang.Object) arraylist_chromosome88);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{hi!=10}" + "'", str40.equals("{hi!=10}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(d49 == 0.0d);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(chromosome_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(d57 == 0.0d);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(chromosome_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(d65 == 0.0d);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]" + "'", str66.equals("[]"));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome68);
        org.junit.Assert.assertNotNull(chromosome_array69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(d79 == 0.0d);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "[]" + "'", str80.equals("[]"));
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome82);
        org.junit.Assert.assertNotNull(chromosome_array83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(chromosome_array87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + false + "'", obj97.equals(false));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        double d14 = elitisticListPopulation5.getElitismRate();
        double d15 = elitisticListPopulation5.getElitismRate();
        double d16 = elitisticListPopulation5.getElitismRate();
        int i17 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        java.util.Set set37 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str15 = defaultedMap14.toString();
        boolean b16 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set20 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Set set24 = defaultedMap22.entrySet();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) false);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        int i29 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b36 = defaultedMap34.isEmpty();
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set40 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        java.util.Set set44 = defaultedMap42.entrySet();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) false);
        defaultedMap34.putAll((java.util.Map) defaultedMap42);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        defaultedMap14.putAll((java.util.Map) defaultedMap34);
        java.lang.String str50 = defaultedMap34.toString();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) str50);
        java.lang.String str52 = defaultedMap1.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Factory factory55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{hi!=10}" + "'", str50.equals("{hi!=10}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        defaultedMap4.putAll((java.util.Map) defaultedMap24);
        java.util.Set set40 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection20 = defaultedMap10.values();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 1, (double) 0.0f);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.lang.String str28 = elitisticListPopulation26.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation26.iterator();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (byte) 1, (double) 0.0f);
        double d36 = elitisticListPopulation35.getElitismRate();
        java.lang.String str37 = elitisticListPopulation35.toString();
        java.lang.String str38 = elitisticListPopulation35.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.Population population44 = elitisticListPopulation26.nextGeneration();
        elitisticListPopulation26.setPopulationLimit((int) ' ');
        java.lang.Object obj47 = defaultedMap10.get((java.lang.Object) elitisticListPopulation26);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (byte) 1, (double) 0.0f);
        double d54 = elitisticListPopulation53.getElitismRate();
        double d55 = elitisticListPopulation53.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome56);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome58 = elitisticListPopulation26.spliterator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + false + "'", obj47.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertNotNull(spliterator_chromosome58);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation5.spliterator();
        try {
            elitisticListPopulation5.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.lang.String str12 = elitisticListPopulation10.toString();
        int i13 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation10.iterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation10.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) list_chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) elitisticListPopulation25);
        int i29 = elitisticListPopulation25.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + false + "'", obj28.equals(false));
        org.junit.Assert.assertTrue(i29 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str26 = elitisticListPopulation25.toString();
        int i27 = elitisticListPopulation25.getPopulationSize();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation25);
        boolean b29 = defaultedMap4.containsValue((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b33 = defaultedMap31.isEmpty();
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome44 = arraylist_chromosome39.spliterator();
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome39);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        boolean b50 = defaultedMap48.isEmpty();
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate46, predicate54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap59.clear();
        java.util.Collection collection61 = defaultedMap59.values();
        java.lang.Object obj62 = defaultedMap28.put((java.lang.Object) predicate54, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str65 = defaultedMap64.toString();
        boolean b66 = defaultedMap64.isEmpty();
        java.lang.Object obj69 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b71 = defaultedMap64.equals((java.lang.Object) (short) 10);
        java.lang.String str72 = defaultedMap64.toString();
        java.lang.Object obj73 = defaultedMap59.remove((java.lang.Object) str72);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{hi!=10}" + "'", str72.equals("{hi!=10}"));
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b17 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set21 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Set set25 = defaultedMap23.entrySet();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) false);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        int i30 = defaultedMap15.size();
        int i31 = defaultedMap15.size();
        java.util.Set set32 = defaultedMap15.keySet();
        java.util.Set set33 = defaultedMap15.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str37 = elitisticListPopulation36.toString();
        int i38 = elitisticListPopulation36.getPopulationSize();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation36);
        boolean b40 = defaultedMap15.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = arraylist_chromosome50.spliterator();
        java.lang.Object obj56 = defaultedMap42.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome50);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str60 = defaultedMap59.toString();
        boolean b61 = defaultedMap59.isEmpty();
        java.lang.Object obj64 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate57, predicate65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap39.put((java.lang.Object) predicate65, (java.lang.Object) defaultedMap70);
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) defaultedMap39);
        int i75 = defaultedMap39.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection20 = defaultedMap10.values();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 1, (double) 0.0f);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.lang.String str28 = elitisticListPopulation26.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome29 = elitisticListPopulation26.iterator();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (byte) 1, (double) 0.0f);
        double d36 = elitisticListPopulation35.getElitismRate();
        java.lang.String str37 = elitisticListPopulation35.toString();
        java.lang.String str38 = elitisticListPopulation35.toString();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        elitisticListPopulation26.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome40);
        math.genetics.Population population44 = elitisticListPopulation26.nextGeneration();
        elitisticListPopulation26.setPopulationLimit((int) ' ');
        java.lang.Object obj47 = defaultedMap10.get((java.lang.Object) elitisticListPopulation26);
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome49, (int) (byte) 1, (double) 0.0f);
        double d54 = elitisticListPopulation53.getElitismRate();
        double d55 = elitisticListPopulation53.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation53.getChromosomes();
        elitisticListPopulation26.setChromosomes(list_chromosome56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(list_chromosome56, (int) '#', 0.0d);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome29);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(population44);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + false + "'", obj47.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(d54 == 0.0d);
        org.junit.Assert.assertTrue(d55 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome56);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.lang.String str19 = elitisticListPopulation17.toString();
        boolean b20 = defaultedMap9.equals((java.lang.Object) elitisticListPopulation17);
        java.util.Set set21 = defaultedMap9.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set17 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) false);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.util.Collection collection25 = defaultedMap19.values();
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) (byte) 1, (double) 0.0f);
        double d25 = elitisticListPopulation24.getElitismRate();
        java.lang.String str26 = elitisticListPopulation24.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation24.iterator();
        double d28 = elitisticListPopulation24.getElitismRate();
        double d29 = elitisticListPopulation24.getElitismRate();
        math.genetics.Chromosome[] chromosome_array30 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome31 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome31, chromosome_array30);
        math.genetics.ElitisticListPopulation elitisticListPopulation35 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome31, (int) (byte) 1, (double) 0.0f);
        double d36 = elitisticListPopulation35.getElitismRate();
        java.lang.String str37 = elitisticListPopulation35.toString();
        int i38 = elitisticListPopulation35.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome39 = elitisticListPopulation35.iterator();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation35.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome45, (int) (byte) 1, (double) 0.0f);
        double d50 = elitisticListPopulation49.getElitismRate();
        java.lang.String str51 = elitisticListPopulation49.toString();
        int i52 = elitisticListPopulation49.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation49.iterator();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        elitisticListPopulation49.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation49.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59);
        elitisticListPopulation35.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59);
        elitisticListPopulation24.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59);
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) arraylist_chromosome59);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome39);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(d50 == 0.0d);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]" + "'", str51.equals("[]"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + false + "'", obj67.equals(false));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        double d9 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        java.lang.String str12 = elitisticListPopulation5.toString();
        try {
            math.genetics.Chromosome chromosome13 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) (byte) 1, (double) 0.0f);
        double d25 = elitisticListPopulation24.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome26 = elitisticListPopulation24.iterator();
        java.lang.String str27 = elitisticListPopulation24.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation24.getChromosomes();
        boolean b29 = defaultedMap4.containsKey((java.lang.Object) elitisticListPopulation24);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation19.iterator();
        boolean b21 = defaultedMap9.containsValue((java.lang.Object) elitisticListPopulation19);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        java.util.Collection collection23 = defaultedMap4.values();
        java.util.Set set24 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str27 = defaultedMap26.toString();
        boolean b28 = defaultedMap26.isEmpty();
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set32 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str35 = defaultedMap34.toString();
        java.util.Set set36 = defaultedMap34.entrySet();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) false);
        defaultedMap26.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj40 = defaultedMap4.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str53 = defaultedMap52.toString();
        boolean b54 = defaultedMap52.isEmpty();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate59);
        try {
            java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate48, predicate58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap11.clear();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) (byte) 1, (double) 0.0f);
        double d21 = elitisticListPopulation20.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation20.iterator();
        java.lang.String str23 = elitisticListPopulation20.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation20.getChromosomes();
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) list_chromosome24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        int i45 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str51 = defaultedMap50.toString();
        boolean b52 = defaultedMap50.isEmpty();
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set56 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str59 = defaultedMap58.toString();
        java.util.Set set60 = defaultedMap58.entrySet();
        boolean b62 = defaultedMap58.containsValue((java.lang.Object) false);
        defaultedMap50.putAll((java.util.Map) defaultedMap58);
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap50);
        java.lang.String str66 = defaultedMap50.toString();
        defaultedMap11.putAll((java.util.Map) defaultedMap50);
        boolean b69 = defaultedMap11.equals((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        math.genetics.Chromosome[] chromosome_array71 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome72 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome72, chromosome_array71);
        math.genetics.ElitisticListPopulation elitisticListPopulation76 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome72, (int) (byte) 1, (double) 0.0f);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) elitisticListPopulation76);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(d21 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{hi!=10}" + "'", str66.equals("{hi!=10}"));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(chromosome_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) false);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome8);
        double d14 = elitisticListPopulation5.getElitismRate();
        double d15 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation5.addChromosome(chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome18 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome18);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "");
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 1, (double) 2);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b5 = defaultedMap3.isEmpty();
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set9 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Set set13 = defaultedMap11.entrySet();
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) false);
        defaultedMap3.putAll((java.util.Map) defaultedMap11);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.lang.String str21 = elitisticListPopulation19.toString();
        boolean b22 = defaultedMap11.equals((java.lang.Object) elitisticListPopulation19);
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome24, (int) (byte) 1, (double) 0.0f);
        double d29 = elitisticListPopulation28.getElitismRate();
        double d30 = elitisticListPopulation28.getElitismRate();
        java.lang.Object obj31 = defaultedMap11.get((java.lang.Object) elitisticListPopulation28);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertTrue(d30 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 1, (double) 0.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.lang.String str21 = elitisticListPopulation19.toString();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        int i36 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str7 = defaultedMap6.toString();
        boolean b8 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set12 = defaultedMap6.entrySet();
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) 10.0d);
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) false);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i35 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        boolean b42 = defaultedMap40.isEmpty();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        java.util.Set set50 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) false);
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        java.lang.String str56 = defaultedMap40.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        defaultedMap40.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=10}" + "'", str56.equals("{hi!=10}"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b19 = defaultedMap17.isEmpty();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set23 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str27 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (byte) 1, (double) 0.0f);
        double d35 = elitisticListPopulation34.getElitismRate();
        java.lang.String str36 = elitisticListPopulation34.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome37 = elitisticListPopulation34.iterator();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 1, (double) 0.0f);
        double d44 = elitisticListPopulation43.getElitismRate();
        java.lang.String str45 = elitisticListPopulation43.toString();
        java.lang.String str46 = elitisticListPopulation43.toString();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation34.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        java.lang.Object obj52 = defaultedMap17.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) elitisticListPopulation34);
        elitisticListPopulation34.setElitismRate((double) (byte) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) elitisticListPopulation34);
        java.util.Collection collection56 = defaultedMap9.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        int i14 = elitisticListPopulation5.getPopulationSize();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) i14);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str15 = defaultedMap14.toString();
        boolean b16 = defaultedMap14.isEmpty();
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set20 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Set set24 = defaultedMap22.entrySet();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) false);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        defaultedMap11.putAll((java.util.Map) defaultedMap14);
        int i29 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str35 = defaultedMap34.toString();
        boolean b36 = defaultedMap34.isEmpty();
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set40 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        java.util.Set set44 = defaultedMap42.entrySet();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) false);
        defaultedMap34.putAll((java.util.Map) defaultedMap42);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        defaultedMap14.putAll((java.util.Map) defaultedMap34);
        java.lang.String str50 = defaultedMap34.toString();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) str50);
        java.lang.String str52 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation55 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str56 = elitisticListPopulation55.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation55.getChromosomes();
        math.genetics.Population population58 = elitisticListPopulation55.nextGeneration();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) population58);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{hi!=10}" + "'", str50.equals("{hi!=10}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]" + "'", str56.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNotNull(population58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str14 = defaultedMap13.toString();
        boolean b15 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set19 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.entrySet();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) false);
        defaultedMap13.putAll((java.util.Map) defaultedMap21);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        boolean b31 = defaultedMap29.isEmpty();
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array36 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome37 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome37, chromosome_array36);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome37, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome42 = arraylist_chromosome37.spliterator();
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome37);
        defaultedMap29.clear();
        boolean b45 = defaultedMap10.containsKey((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str48 = defaultedMap47.toString();
        java.util.Set set49 = defaultedMap47.entrySet();
        boolean b50 = defaultedMap10.containsKey((java.lang.Object) defaultedMap47);
        java.lang.Object obj51 = defaultedMap8.get((java.lang.Object) defaultedMap10);
        boolean b52 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(chromosome_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Set set5 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b10 = defaultedMap3.containsKey((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap13.clear();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 1, (double) 0.0f);
        double d23 = elitisticListPopulation22.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation22.iterator();
        java.lang.String str25 = elitisticListPopulation22.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation22.getChromosomes();
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) list_chromosome26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        boolean b34 = defaultedMap32.isEmpty();
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set38 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        java.util.Set set42 = defaultedMap40.entrySet();
        boolean b44 = defaultedMap40.containsValue((java.lang.Object) false);
        defaultedMap32.putAll((java.util.Map) defaultedMap40);
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        int i47 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str50 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str53 = defaultedMap52.toString();
        boolean b54 = defaultedMap52.isEmpty();
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set58 = defaultedMap52.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str61 = defaultedMap60.toString();
        java.util.Set set62 = defaultedMap60.entrySet();
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) false);
        defaultedMap52.putAll((java.util.Map) defaultedMap60);
        defaultedMap49.putAll((java.util.Map) defaultedMap52);
        defaultedMap32.putAll((java.util.Map) defaultedMap52);
        java.lang.String str68 = defaultedMap52.toString();
        defaultedMap13.putAll((java.util.Map) defaultedMap52);
        boolean b71 = defaultedMap13.equals((java.lang.Object) 1);
        defaultedMap3.putAll((java.util.Map) defaultedMap13);
        math.genetics.Chromosome[] chromosome_array73 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome74 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome74, chromosome_array73);
        math.genetics.ElitisticListPopulation elitisticListPopulation78 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome74, (int) (byte) 1, (double) 0.0f);
        double d79 = elitisticListPopulation78.getElitismRate();
        java.lang.String str80 = elitisticListPopulation78.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome81 = elitisticListPopulation78.iterator();
        double d82 = elitisticListPopulation78.getElitismRate();
        double d83 = elitisticListPopulation78.getElitismRate();
        math.genetics.Population population84 = elitisticListPopulation78.nextGeneration();
        java.lang.Object obj85 = defaultedMap13.get((java.lang.Object) elitisticListPopulation78);
        boolean b86 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation78);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{hi!=10}" + "'", str68.equals("{hi!=10}"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(chromosome_array73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(d79 == 0.0d);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "[]" + "'", str80.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome81);
        org.junit.Assert.assertTrue(d82 == 0.0d);
        org.junit.Assert.assertTrue(d83 == 0.0d);
        org.junit.Assert.assertNotNull(population84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.lang.String str12 = elitisticListPopulation10.toString();
        int i13 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation10.iterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation10.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) list_chromosome21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Collection collection25 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        int i16 = defaultedMap9.size();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap9.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = arraylist_chromosome9.spliterator();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome9);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b20 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set24 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Set set28 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) false);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        java.util.Set set32 = defaultedMap18.entrySet();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) false);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str38 = elitisticListPopulation37.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation37.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation37.iterator();
        java.lang.Object obj41 = defaultedMap18.remove((java.lang.Object) iterator_chromosome40);
        defaultedMap18.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str23 = defaultedMap22.toString();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set28 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str34 = defaultedMap33.toString();
        boolean b35 = defaultedMap33.isEmpty();
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set39 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str42 = defaultedMap41.toString();
        java.util.Set set43 = defaultedMap41.entrySet();
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) false);
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        defaultedMap30.putAll((java.util.Map) defaultedMap33);
        int i48 = defaultedMap33.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str51 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str54 = defaultedMap53.toString();
        boolean b55 = defaultedMap53.isEmpty();
        java.lang.Object obj58 = defaultedMap53.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set59 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str62 = defaultedMap61.toString();
        java.util.Set set63 = defaultedMap61.entrySet();
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) false);
        defaultedMap53.putAll((java.util.Map) defaultedMap61);
        defaultedMap50.putAll((java.util.Map) defaultedMap53);
        defaultedMap33.putAll((java.util.Map) defaultedMap53);
        boolean b69 = defaultedMap22.containsValue((java.lang.Object) defaultedMap53);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i48 == 1);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        boolean b23 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set27 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Set set31 = defaultedMap29.entrySet();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) false);
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        boolean b36 = defaultedMap9.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str42 = defaultedMap41.toString();
        boolean b43 = defaultedMap41.isEmpty();
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set47 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Set set51 = defaultedMap49.entrySet();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) false);
        defaultedMap41.putAll((java.util.Map) defaultedMap49);
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        int i56 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str62 = defaultedMap61.toString();
        boolean b63 = defaultedMap61.isEmpty();
        java.lang.Object obj66 = defaultedMap61.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set67 = defaultedMap61.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str70 = defaultedMap69.toString();
        java.util.Set set71 = defaultedMap69.entrySet();
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) false);
        defaultedMap61.putAll((java.util.Map) defaultedMap69);
        defaultedMap58.putAll((java.util.Map) defaultedMap61);
        defaultedMap41.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str79 = defaultedMap78.toString();
        int i80 = defaultedMap78.size();
        boolean b81 = defaultedMap41.equals((java.lang.Object) i80);
        java.util.Set set82 = defaultedMap41.keySet();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) set82);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 1);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Set set47 = defaultedMap27.entrySet();
        defaultedMap27.clear();
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome28);
        defaultedMap20.clear();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) 0.0d);
        int i40 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        int i44 = elitisticListPopulation43.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array45 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome46 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome46, chromosome_array45);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome46, (int) (byte) 1, (double) 0.0f);
        double d51 = elitisticListPopulation50.getElitismRate();
        java.lang.String str52 = elitisticListPopulation50.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome53 = elitisticListPopulation50.iterator();
        math.genetics.Chromosome chromosome54 = null;
        elitisticListPopulation50.addChromosome(chromosome54);
        java.util.List<math.genetics.Chromosome> list_chromosome56 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome56);
        elitisticListPopulation43.setPopulationLimit((int) (byte) 100);
        java.lang.Object obj60 = defaultedMap1.get((java.lang.Object) elitisticListPopulation43);
        int i61 = elitisticListPopulation43.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(i44 == 10);
        org.junit.Assert.assertNotNull(chromosome_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(d51 == 0.0d);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[]" + "'", str52.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome53);
        org.junit.Assert.assertNotNull(list_chromosome56);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + false + "'", obj60.equals(false));
        org.junit.Assert.assertTrue(i61 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str16 = defaultedMap15.toString();
        boolean b17 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set21 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Set set25 = defaultedMap23.entrySet();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) false);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        int i30 = defaultedMap15.size();
        int i31 = defaultedMap15.size();
        java.util.Set set32 = defaultedMap15.keySet();
        java.util.Set set33 = defaultedMap15.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str37 = elitisticListPopulation36.toString();
        int i38 = elitisticListPopulation36.getPopulationSize();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation36);
        boolean b40 = defaultedMap15.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array49 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome50 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome50, chromosome_array49);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome50, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome55 = arraylist_chromosome50.spliterator();
        java.lang.Object obj56 = defaultedMap42.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome50);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str60 = defaultedMap59.toString();
        boolean b61 = defaultedMap59.isEmpty();
        java.lang.Object obj64 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate57, predicate65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap39.put((java.lang.Object) predicate65, (java.lang.Object) defaultedMap70);
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) defaultedMap39);
        collections.Factory factory75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(chromosome_array49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) (-1.0d));
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome22, (int) (byte) 1, (double) 0.0f);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.lang.String str28 = elitisticListPopulation26.toString();
        int i29 = elitisticListPopulation26.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome30 = elitisticListPopulation26.iterator();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation26.addChromosome(chromosome35);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation26.getChromosomes();
        boolean b38 = defaultedMap4.containsKey((java.lang.Object) list_chromosome37);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]" + "'", str28.equals("[]"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome30);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        double d7 = elitisticListPopulation5.getElitismRate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) d7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) d7);
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) (byte) 1, (double) 0.0f);
        double d16 = elitisticListPopulation15.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome17 = elitisticListPopulation15.iterator();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) elitisticListPopulation15);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d16 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b8 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.lang.String str12 = elitisticListPopulation10.toString();
        int i13 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome14 = elitisticListPopulation10.iterator();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation10.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        math.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation10.addChromosome(chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) list_chromosome21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap24);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (byte) 1, (double) 0.0f);
        double d34 = elitisticListPopulation33.getElitismRate();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation33.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome36);
        double d42 = elitisticListPopulation33.getElitismRate();
        double d43 = elitisticListPopulation33.getElitismRate();
        double d44 = elitisticListPopulation33.getElitismRate();
        java.lang.Object obj45 = defaultedMap24.get((java.lang.Object) d44);
        math.genetics.Chromosome[] chromosome_array46 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome47 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome47, chromosome_array46);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome47, (int) (byte) 1, (double) 0.0f);
        double d52 = elitisticListPopulation51.getElitismRate();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54, (int) (byte) 1, (double) 0.0f);
        elitisticListPopulation51.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome54);
        double d60 = elitisticListPopulation51.getElitismRate();
        double d61 = elitisticListPopulation51.getElitismRate();
        boolean b62 = defaultedMap24.equals((java.lang.Object) d61);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(d34 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(d42 == 0.0d);
        org.junit.Assert.assertTrue(d43 == 0.0d);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + false + "'", obj45.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(d52 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(d60 == 0.0d);
        org.junit.Assert.assertTrue(d61 == 0.0d);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        int i51 = elitisticListPopulation50.getPopulationLimit();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation50);
        math.genetics.Population population53 = elitisticListPopulation50.nextGeneration();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i51 == 10);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(population53);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        java.util.Collection collection23 = defaultedMap4.values();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap25);
        java.util.Set set27 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i19 = defaultedMap4.size();
        int i20 = defaultedMap4.size();
        java.util.Set set21 = defaultedMap4.keySet();
        java.util.Set set22 = defaultedMap4.entrySet();
        java.util.Collection collection23 = defaultedMap4.values();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap25);
        boolean b27 = defaultedMap25.isEmpty();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        boolean b9 = defaultedMap1.isEmpty();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        int i11 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome12 = null;
        try {
            elitisticListPopulation5.addChromosome(chromosome12);
            org.junit.Assert.fail("Expected exception of type math.exception.NumberIsTooLargeException");
        } catch (math.exception.NumberIsTooLargeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        int i14 = elitisticListPopulation5.getPopulationSize();
        double d15 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        boolean b19 = defaultedMap4.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate(map21, predicate22, predicate23);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) (byte) 1, (double) 0.0f);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.lang.String str11 = elitisticListPopulation9.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation9.iterator();
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation9.addChromosome(chromosome13);
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation9.getChromosomes();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) list_chromosome15);
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome18, (int) (byte) 1, (double) 0.0f);
        double d23 = elitisticListPopulation22.getElitismRate();
        java.lang.String str24 = elitisticListPopulation22.toString();
        int i25 = elitisticListPopulation22.getPopulationSize();
        boolean b26 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation22);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(d23 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj40 = defaultedMap24.get((java.lang.Object) (-1.0d));
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population47 = elitisticListPopulation46.nextGeneration();
        int i48 = elitisticListPopulation46.getPopulationSize();
        java.lang.Object obj49 = defaultedMap7.put(obj40, (java.lang.Object) elitisticListPopulation46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj40);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        math.genetics.Chromosome[] chromosome_array27 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome28 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome28, chromosome_array27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome28, (int) (short) 1, (double) (short) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome33 = arraylist_chromosome28.spliterator();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) arraylist_chromosome28);
        defaultedMap20.clear();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) 0.0d);
        int i40 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str43 = defaultedMap42.toString();
        boolean b44 = defaultedMap42.isEmpty();
        java.util.Set set45 = defaultedMap42.keySet();
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        boolean b50 = defaultedMap48.isEmpty();
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set54 = defaultedMap48.entrySet();
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str59 = defaultedMap58.toString();
        boolean b60 = defaultedMap58.isEmpty();
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set64 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str67 = defaultedMap66.toString();
        java.util.Set set68 = defaultedMap66.entrySet();
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) false);
        defaultedMap58.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj72 = defaultedMap42.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap66);
        java.lang.Object obj73 = defaultedMap1.remove(obj72);
        math.genetics.Chromosome[] chromosome_array74 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome75 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b76 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome75, chromosome_array74);
        math.genetics.ElitisticListPopulation elitisticListPopulation79 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome75, (int) (byte) 1, (double) 0.0f);
        double d80 = elitisticListPopulation79.getElitismRate();
        java.lang.String str81 = elitisticListPopulation79.toString();
        int i82 = elitisticListPopulation79.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome83 = elitisticListPopulation79.iterator();
        math.genetics.Chromosome[] chromosome_array84 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome85 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85, chromosome_array84);
        elitisticListPopulation79.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome85);
        math.genetics.Chromosome chromosome88 = null;
        elitisticListPopulation79.addChromosome(chromosome88);
        java.util.List<math.genetics.Chromosome> list_chromosome90 = elitisticListPopulation79.getChromosomes();
        boolean b91 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation79);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(chromosome_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(chromosome_array74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(d80 == 0.0d);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "[]" + "'", str81.equals("[]"));
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome83);
        org.junit.Assert.assertNotNull(chromosome_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(list_chromosome90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b10 = defaultedMap8.isEmpty();
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set14 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str17 = defaultedMap16.toString();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) false);
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        boolean b23 = defaultedMap8.isEmpty();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set30 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) false);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj40 = defaultedMap24.get((java.lang.Object) (-1.0d));
        math.genetics.Chromosome[] chromosome_array41 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome42 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome42, chromosome_array41);
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome42, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population47 = elitisticListPopulation46.nextGeneration();
        int i48 = elitisticListPopulation46.getPopulationSize();
        java.lang.Object obj49 = defaultedMap7.put(obj40, (java.lang.Object) elitisticListPopulation46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Set set53 = defaultedMap51.entrySet();
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) defaultedMap57);
        java.util.Collection collection59 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str62 = defaultedMap61.toString();
        java.util.Set set63 = defaultedMap61.entrySet();
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b68 = defaultedMap61.containsKey((java.lang.Object) defaultedMap67);
        java.util.Collection collection69 = defaultedMap61.values();
        boolean b70 = defaultedMap51.containsValue((java.lang.Object) defaultedMap61);
        java.util.Collection collection71 = defaultedMap61.values();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap61);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation5.iterator();
        java.lang.String str8 = elitisticListPopulation5.toString();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (short) 1, (double) (short) 0);
        math.genetics.Population population15 = elitisticListPopulation14.nextGeneration();
        int i16 = elitisticListPopulation14.getPopulationLimit();
        elitisticListPopulation14.setPopulationLimit((int) (short) 10);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(list_chromosome19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "{}");
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6, (int) (byte) 1, (double) 0.0f);
        double d11 = elitisticListPopulation10.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation10.iterator();
        java.lang.String str13 = elitisticListPopulation10.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation10.getChromosomes();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) list_chromosome14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) false);
        defaultedMap20.putAll((java.util.Map) defaultedMap28);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        int i35 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str41 = defaultedMap40.toString();
        boolean b42 = defaultedMap40.isEmpty();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set46 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str49 = defaultedMap48.toString();
        java.util.Set set50 = defaultedMap48.entrySet();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) false);
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        java.lang.String str56 = defaultedMap40.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap40);
        math.genetics.Chromosome[] chromosome_array58 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome59 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome59, chromosome_array58);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome59, (int) (byte) 1, (double) 0.0f);
        double d64 = elitisticListPopulation63.getElitismRate();
        java.lang.String str65 = elitisticListPopulation63.toString();
        int i66 = elitisticListPopulation63.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome67 = elitisticListPopulation63.iterator();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.String str70 = defaultedMap69.toString();
        int i71 = defaultedMap69.size();
        java.lang.Object obj72 = defaultedMap40.put((java.lang.Object) elitisticListPopulation63, (java.lang.Object) defaultedMap69);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap69.putAll((java.util.Map) defaultedMap74);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false + "'", obj4.equals(false));
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(d11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]" + "'", str13.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{hi!=10}" + "'", str56.equals("{hi!=10}"));
        org.junit.Assert.assertNotNull(chromosome_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(d64 == 0.0d);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]" + "'", str65.equals("[]"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str11 = defaultedMap10.toString();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) false);
        defaultedMap10.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str31 = defaultedMap30.toString();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set36 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str39 = defaultedMap38.toString();
        java.util.Set set40 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) false);
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        boolean b45 = defaultedMap18.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        int i51 = elitisticListPopulation50.getPopulationLimit();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) elitisticListPopulation50);
        boolean b53 = defaultedMap1.isEmpty();
        math.genetics.Chromosome[] chromosome_array54 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome55 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome55, chromosome_array54);
        math.genetics.ElitisticListPopulation elitisticListPopulation59 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome55, (int) (byte) 1, (double) 0.0f);
        double d60 = elitisticListPopulation59.getElitismRate();
        java.lang.String str61 = elitisticListPopulation59.toString();
        int i62 = elitisticListPopulation59.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome63 = elitisticListPopulation59.iterator();
        math.genetics.Chromosome[] chromosome_array64 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome65 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65, chromosome_array64);
        elitisticListPopulation59.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome65);
        math.genetics.Chromosome[] chromosome_array68 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome69 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome69, chromosome_array68);
        math.genetics.ElitisticListPopulation elitisticListPopulation73 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation59.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome69);
        math.genetics.Chromosome chromosome75 = null;
        elitisticListPopulation59.addChromosome(chromosome75);
        boolean b77 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation59);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i51 == 10);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(chromosome_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(d60 == 0.0d);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[]" + "'", str61.equals("[]"));
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome63);
        org.junit.Assert.assertNotNull(chromosome_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(chromosome_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str18 = defaultedMap17.toString();
        boolean b19 = defaultedMap17.isEmpty();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set23 = defaultedMap17.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str27 = elitisticListPopulation26.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30, (int) (byte) 1, (double) 0.0f);
        double d35 = elitisticListPopulation34.getElitismRate();
        java.lang.String str36 = elitisticListPopulation34.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome37 = elitisticListPopulation34.iterator();
        math.genetics.Chromosome[] chromosome_array38 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome39 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome39, chromosome_array38);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome39, (int) (byte) 1, (double) 0.0f);
        double d44 = elitisticListPopulation43.getElitismRate();
        java.lang.String str45 = elitisticListPopulation43.toString();
        java.lang.String str46 = elitisticListPopulation43.toString();
        math.genetics.Chromosome[] chromosome_array47 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome48 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48, chromosome_array47);
        elitisticListPopulation43.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome48);
        elitisticListPopulation34.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome48);
        java.lang.Object obj52 = defaultedMap17.put((java.lang.Object) elitisticListPopulation26, (java.lang.Object) elitisticListPopulation34);
        elitisticListPopulation34.setElitismRate((double) (byte) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) elitisticListPopulation34);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome56 = elitisticListPopulation34.spliterator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(d35 == 0.0d);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome37);
        org.junit.Assert.assertNotNull(chromosome_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(d44 == 0.0d);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]" + "'", str45.equals("[]"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]" + "'", str46.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(spliterator_chromosome56);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) (byte) 1, (double) 0.0f);
        double d15 = elitisticListPopulation14.getElitismRate();
        java.lang.String str16 = elitisticListPopulation14.toString();
        java.lang.String str17 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array18 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome19 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19, chromosome_array18);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome19);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome19);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation5.spliterator();
        java.lang.String str24 = elitisticListPopulation5.toString();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]" + "'", str16.equals("[]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(chromosome_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        math.genetics.Chromosome[] chromosome_array2 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome3 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome3, chromosome_array2);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome3, (int) (byte) 1, (double) 0.0f);
        double d8 = elitisticListPopulation7.getElitismRate();
        boolean b9 = defaultedMap1.equals((java.lang.Object) d8);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(chromosome_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set10 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) false);
        defaultedMap4.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(10, (double) 0L);
        java.lang.String str22 = elitisticListPopulation21.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation21.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation21.iterator();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) elitisticListPopulation21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str28 = defaultedMap27.toString();
        boolean b29 = defaultedMap27.isEmpty();
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        boolean b34 = defaultedMap27.equals((java.lang.Object) (short) 10);
        java.lang.String str35 = defaultedMap27.toString();
        boolean b37 = defaultedMap27.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str40 = defaultedMap39.toString();
        boolean b41 = defaultedMap39.isEmpty();
        math.genetics.Chromosome[] chromosome_array42 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome43 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome43, chromosome_array42);
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome43, (int) (byte) 1, (double) 0.0f);
        double d48 = elitisticListPopulation47.getElitismRate();
        java.lang.String str49 = elitisticListPopulation47.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome50 = elitisticListPopulation47.iterator();
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation47.addChromosome(chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome53 = elitisticListPopulation47.getChromosomes();
        boolean b54 = defaultedMap39.containsValue((java.lang.Object) list_chromosome53);
        boolean b55 = defaultedMap27.containsKey((java.lang.Object) list_chromosome53);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome23);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{hi!=10}" + "'", str35.equals("{hi!=10}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(chromosome_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(d48 == 0.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[]" + "'", str49.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome50);
        org.junit.Assert.assertNotNull(list_chromosome53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) false);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection15 = defaultedMap9.values();
        int i16 = defaultedMap9.size();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        defaultedMap9.clear();
        java.lang.String str21 = defaultedMap9.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 1, (double) 0.0f);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int i8 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) (byte) 1, (double) 0.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.lang.String str21 = elitisticListPopulation19.toString();
        int i22 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome23 = elitisticListPopulation19.iterator();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29, (int) (short) 1, (double) (short) 0);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome29);
        int i36 = elitisticListPopulation5.getPopulationLimit();
        int i37 = elitisticListPopulation5.getPopulationLimit();
        math.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation5.addChromosome(chromosome38);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(i37 == 1);
    }
}

