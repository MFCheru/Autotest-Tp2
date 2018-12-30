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
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        try {
            math.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        try {
            elitisticListPopulation6.setPopulationLimit((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i7 = elitisticListPopulation6.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome12);
        try {
            math.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = arraylist_chromosome5.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, 97, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0d);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        double d6 = elitisticListPopulation2.getElitismRate();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.lang.String str8 = elitisticListPopulation2.toString();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        int i9 = elitisticListPopulation6.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap25.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        java.lang.String str32 = elitisticListPopulation29.toString();
        java.lang.String str33 = elitisticListPopulation29.toString();
        boolean b34 = defaultedMap25.equals((java.lang.Object) elitisticListPopulation29);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation37.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation(list_chromosome43, (int) '#', (double) 0L);
        elitisticListPopulation29.setChromosomes(list_chromosome43);
        elitisticListPopulation6.setChromosomes(list_chromosome43);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation(list_chromosome43, 97, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]" + "'", str32.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation13.addChromosome(chromosome14);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation13.iterator();
        int i17 = elitisticListPopulation13.getPopulationSize();
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map10, (java.lang.Object) i17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate(1.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 97);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 10L);
        int i22 = defaultedMap16.size();
        java.lang.String str23 = defaultedMap16.toString();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = null;
        try {
            elitisticListPopulation2.setChromosomes(list_chromosome9);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap18.get(obj25);
        java.util.Collection collection27 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) collection27);
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) defaultedMap28);
        java.lang.String str30 = defaultedMap28.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate(map27, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i8 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome17, (int) 'a', (double) 0L);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation21);
        elitisticListPopulation21.setElitismRate((double) 0L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i7 = elitisticListPopulation6.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome12);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome14 = list_chromosome12.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation(list_chromosome12, (int) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_chromosome12);
        org.junit.Assert.assertNotNull(spliterator_chromosome14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 97);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.String str17 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap21.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.lang.String str28 = elitisticListPopulation25.toString();
        java.lang.String str29 = elitisticListPopulation25.toString();
        boolean b30 = defaultedMap21.equals((java.lang.Object) elitisticListPopulation25);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i34 = elitisticListPopulation33.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation33.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(list_chromosome39, (int) '#', (double) 0L);
        elitisticListPopulation25.setChromosomes(list_chromosome39);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) list_chromosome39);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(list_chromosome39, (int) (byte) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[null]" + "'", str28.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[null]" + "'", str29.equals("[null]"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.String str19 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate(map21, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        double d6 = elitisticListPopulation2.getElitismRate();
        double d7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap18.get(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) "hi!");
        java.util.Set set31 = defaultedMap28.entrySet();
        java.lang.String str32 = defaultedMap28.toString();
        java.util.Collection collection33 = defaultedMap28.values();
        int i34 = defaultedMap28.size();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) "hi!");
        java.util.Set set42 = defaultedMap39.entrySet();
        java.lang.String str43 = defaultedMap39.toString();
        java.util.Collection collection44 = defaultedMap39.values();
        int i45 = defaultedMap39.size();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate35, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) "hi!");
        java.util.Set set54 = defaultedMap51.entrySet();
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) "");
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) (short) 1);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i64 = elitisticListPopulation63.getPopulationLimit();
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map60, (java.lang.Object) i64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b70 = defaultedMap68.containsValue((java.lang.Object) "hi!");
        boolean b71 = defaultedMap68.isEmpty();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map60, predicate66, predicate72);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate46, predicate66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0 + "'", obj58.equals(0));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i64 == 97);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        java.util.Set set9 = defaultedMap1.keySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.containsValue((java.lang.Object) 10L);
        int i18 = defaultedMap12.size();
        java.lang.Object obj19 = defaultedMap1.put(obj10, (java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) -1);
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.containsValue((java.lang.Object) 10L);
        int i37 = defaultedMap31.size();
        java.lang.String str38 = defaultedMap31.toString();
        boolean b39 = defaultedMap16.containsKey((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i44 = elitisticListPopulation43.getPopulationSize();
        int i45 = elitisticListPopulation43.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap47.get((java.lang.Object) (short) 1);
        boolean b55 = defaultedMap47.isEmpty();
        java.util.Set set56 = defaultedMap47.entrySet();
        java.lang.Object obj57 = defaultedMap31.put((java.lang.Object) elitisticListPopulation43, (java.lang.Object) set56);
        math.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation43.addChromosome(chromosome58);
        try {
            elitisticListPopulation43.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 97 + "'", obj28.equals(97));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 97);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = population3.spliterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        boolean b20 = defaultedMap9.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap6.containsValue((java.lang.Object) collection18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) "hi!");
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap23.get((java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (short) -1);
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) (short) -1);
        java.util.Set set34 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) "hi!");
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) 10L);
        int i42 = defaultedMap36.size();
        java.lang.String str43 = defaultedMap36.toString();
        boolean b44 = defaultedMap21.containsKey((java.lang.Object) defaultedMap36);
        boolean b45 = defaultedMap6.equals((java.lang.Object) defaultedMap36);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i49 = elitisticListPopulation48.getPopulationSize();
        int i50 = elitisticListPopulation48.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) "hi!");
        java.util.Set set55 = defaultedMap52.entrySet();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) "");
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) (short) 1);
        boolean b60 = defaultedMap52.isEmpty();
        java.util.Set set61 = defaultedMap52.entrySet();
        java.lang.Object obj62 = defaultedMap36.put((java.lang.Object) elitisticListPopulation48, (java.lang.Object) set61);
        int i63 = elitisticListPopulation48.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b67 = defaultedMap65.containsValue((java.lang.Object) "hi!");
        java.util.Set set68 = defaultedMap65.entrySet();
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set73 = defaultedMap72.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap75.clear();
        java.lang.Object obj77 = null;
        boolean b78 = defaultedMap75.equals(obj77);
        java.lang.Object obj79 = defaultedMap65.put((java.lang.Object) set73, (java.lang.Object) defaultedMap75);
        int i80 = defaultedMap65.size();
        java.lang.Object obj81 = defaultedMap1.put((java.lang.Object) i63, (java.lang.Object) defaultedMap65);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 97 + "'", obj33.equals(97));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i50 == 97);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 97);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(i80 == 1);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set9 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) predicate7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        double d7 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, (int) '#', (double) 0L);
        try {
            math.genetics.Chromosome chromosome12 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation6.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str15 = elitisticListPopulation14.toString();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) elitisticListPopulation14);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation14.spliterator();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) spliterator_chromosome17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]" + "'", str15.equals("[]"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) elitisticListPopulation17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        elitisticListPopulation17.setChromosomes(list_chromosome32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap36.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        java.lang.String str43 = elitisticListPopulation40.toString();
        java.lang.String str44 = elitisticListPopulation40.toString();
        boolean b45 = defaultedMap36.equals((java.lang.Object) elitisticListPopulation40);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i49 = elitisticListPopulation48.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation48.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation(list_chromosome54, (int) '#', (double) 0L);
        elitisticListPopulation40.setChromosomes(list_chromosome54);
        elitisticListPopulation17.setChromosomes(list_chromosome54);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome54);
        double d61 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i27 == 97);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[null]" + "'", str43.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[null]" + "'", str44.equals("[null]"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertTrue(d61 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set9, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) "hi!");
        java.util.Set set20 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        defaultedMap22.clear();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap22);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b9 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str31 = elitisticListPopulation30.toString();
        math.genetics.Population population32 = elitisticListPopulation30.nextGeneration();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) population32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(population32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        int i19 = defaultedMap9.size();
        boolean b20 = defaultedMap9.isEmpty();
        boolean b21 = defaultedMap9.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) "");
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        java.util.Map map39 = collections.map.DefaultedMap.decorate(map34, (java.lang.Object) i38);
        defaultedMap16.putAll(map39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) "hi!");
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) "hi!");
        boolean b55 = defaultedMap52.isEmpty();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 10.0d);
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) 0.0d);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 0.0d);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) "");
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        java.util.Map map39 = collections.map.DefaultedMap.decorate(map34, (java.lang.Object) i38);
        defaultedMap16.putAll(map39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set9, (java.lang.Object) defaultedMap11);
        int i16 = defaultedMap1.size();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        int i7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) -1);
        java.lang.Object obj22 = defaultedMap10.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) "hi!");
        java.util.Set set27 = defaultedMap24.entrySet();
        java.lang.String str28 = defaultedMap24.toString();
        defaultedMap24.clear();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap34.entrySet();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) "");
        java.lang.Object obj41 = defaultedMap34.get((java.lang.Object) (short) 1);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (short) -1);
        java.lang.Object obj44 = defaultedMap32.get((java.lang.Object) (short) -1);
        java.util.Set set45 = defaultedMap32.entrySet();
        int i46 = defaultedMap32.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b51 = defaultedMap49.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) "hi!");
        boolean b56 = defaultedMap53.isEmpty();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b63 = defaultedMap61.containsValue((java.lang.Object) "hi!");
        boolean b64 = defaultedMap61.isEmpty();
        java.lang.Object obj66 = defaultedMap61.get((java.lang.Object) 10.0d);
        int i67 = defaultedMap61.size();
        boolean b68 = defaultedMap53.equals((java.lang.Object) defaultedMap61);
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap53);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 97 + "'", obj22.equals(97));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 97 + "'", obj44.equals(97));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate(map24, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationSize();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d10 = elitisticListPopulation9.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome11);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation(list_chromosome11, (int) (short) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(d10 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 10L);
        int i22 = defaultedMap16.size();
        java.lang.String str23 = defaultedMap16.toString();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        java.util.Collection collection25 = defaultedMap1.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) "hi!");
        java.lang.String str32 = defaultedMap29.toString();
        boolean b34 = defaultedMap29.containsValue((java.lang.Object) 10L);
        int i35 = defaultedMap29.size();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap29.get(obj36);
        java.util.Collection collection38 = defaultedMap29.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) collection38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) "hi!");
        boolean b44 = defaultedMap41.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.lang.Object obj49 = defaultedMap39.remove((java.lang.Object) defaultedMap48);
        defaultedMap1.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) "hi!");
        java.util.Set set55 = defaultedMap52.entrySet();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) "");
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) (short) 1);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (short) -1);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) "hi!");
        java.lang.String str69 = defaultedMap66.toString();
        boolean b71 = defaultedMap66.containsValue((java.lang.Object) 10L);
        int i72 = defaultedMap66.size();
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = defaultedMap66.get(obj73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b78 = defaultedMap76.containsValue((java.lang.Object) "hi!");
        java.util.Set set79 = defaultedMap76.entrySet();
        java.lang.String str80 = defaultedMap76.toString();
        java.util.Collection collection81 = defaultedMap76.values();
        int i82 = defaultedMap76.size();
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate83, predicate84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b89 = defaultedMap87.containsValue((java.lang.Object) "hi!");
        java.util.Set set90 = defaultedMap87.entrySet();
        java.lang.String str91 = defaultedMap87.toString();
        java.util.Collection collection92 = defaultedMap87.values();
        int i93 = defaultedMap87.size();
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate83, predicate94);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate63, predicate94);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0 + "'", obj74.equals(0));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap20);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        int i24 = elitisticListPopulation6.getPopulationSize();
        java.lang.String str25 = elitisticListPopulation6.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(10);
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        elitisticListPopulation6.setPopulationLimit((int) '#');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        java.util.Collection collection20 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        defaultedMap22.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap30.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation34 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation34.addChromosome(chromosome35);
        java.lang.String str37 = elitisticListPopulation34.toString();
        java.lang.String str38 = elitisticListPopulation34.toString();
        boolean b39 = defaultedMap30.equals((java.lang.Object) elitisticListPopulation34);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i43 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array44 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome45 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45, chromosome_array44);
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome45);
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation42.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation(list_chromosome48, (int) '#', (double) 0L);
        elitisticListPopulation34.setChromosomes(list_chromosome48);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) list_chromosome48);
        elitisticListPopulation6.setChromosomes(list_chromosome48);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) list_chromosome48, (java.lang.Object) '4');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[null]" + "'", str37.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[null]" + "'", str38.equals("[null]"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertNotNull(chromosome_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome5, (int) 'a', (double) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) elitisticListPopulation10);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Collection collection16 = defaultedMap11.values();
        int i17 = defaultedMap11.size();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        int i28 = defaultedMap22.size();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate29);
        java.util.Set set33 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome9 = elitisticListPopulation6.spliterator();
        int i10 = elitisticListPopulation6.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.lang.String str6 = elitisticListPopulation2.toString();
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]" + "'", str6.equals("[null]"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set9, (java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        int i24 = elitisticListPopulation6.getPopulationSize();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.String str30 = defaultedMap26.toString();
        java.util.Collection collection31 = defaultedMap26.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) "hi!");
        java.lang.String str37 = defaultedMap34.toString();
        boolean b39 = defaultedMap34.containsValue((java.lang.Object) 10L);
        int i40 = defaultedMap34.size();
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap34.get(obj41);
        java.util.Collection collection43 = defaultedMap34.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap20);
        java.util.Set set22 = defaultedMap20.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap13.put((java.lang.Object) 10, (java.lang.Object) b24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation30.iterator();
        int i34 = elitisticListPopulation30.getPopulationSize();
        int i35 = elitisticListPopulation30.getPopulationLimit();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) i35);
        java.util.Collection collection37 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d41 = elitisticListPopulation40.getElitismRate();
        elitisticListPopulation40.setElitismRate((double) 0.0f);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 97);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.String str19 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) (short) -1);
        java.util.Set set36 = defaultedMap23.entrySet();
        int i37 = defaultedMap23.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) "hi!");
        boolean b47 = defaultedMap44.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) "hi!");
        boolean b55 = defaultedMap52.isEmpty();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 10.0d);
        int i58 = defaultedMap52.size();
        boolean b59 = defaultedMap44.equals((java.lang.Object) defaultedMap52);
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap44);
        defaultedMap23.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 97 + "'", obj35.equals(97));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.String str19 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) (short) -1);
        java.util.Set set36 = defaultedMap23.entrySet();
        int i37 = defaultedMap23.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation41.addChromosome(chromosome42);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome44 = elitisticListPopulation41.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome45 = elitisticListPopulation41.spliterator();
        java.lang.Object obj46 = defaultedMap15.get((java.lang.Object) elitisticListPopulation41);
        int i47 = elitisticListPopulation41.getPopulationLimit();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 97 + "'", obj35.equals(97));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(iterator_chromosome44);
        org.junit.Assert.assertNotNull(spliterator_chromosome45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertTrue(i47 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i8 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome17, (int) 'a', (double) 0L);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation21);
        java.lang.String str23 = elitisticListPopulation21.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap5.containsValue((java.lang.Object) collection17);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) collection17);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) "");
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) (short) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.String str29 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) "hi!");
        java.util.Set set38 = defaultedMap35.entrySet();
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) "");
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (short) 1);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) -1);
        java.lang.Object obj45 = defaultedMap33.get((java.lang.Object) (short) -1);
        java.util.Set set46 = defaultedMap33.entrySet();
        int i47 = defaultedMap33.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) "hi!");
        boolean b57 = defaultedMap54.isEmpty();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b64 = defaultedMap62.containsValue((java.lang.Object) "hi!");
        boolean b65 = defaultedMap62.isEmpty();
        java.lang.Object obj67 = defaultedMap62.get((java.lang.Object) 10.0d);
        int i68 = defaultedMap62.size();
        boolean b69 = defaultedMap54.equals((java.lang.Object) defaultedMap62);
        defaultedMap50.putAll((java.util.Map) defaultedMap54);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b75 = defaultedMap73.containsValue((java.lang.Object) "hi!");
        java.util.Set set76 = defaultedMap73.entrySet();
        java.lang.Object obj78 = defaultedMap73.get((java.lang.Object) "");
        java.lang.Object obj79 = defaultedMap1.put((java.lang.Object) defaultedMap33, obj78);
        java.util.Collection collection80 = defaultedMap33.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 97 + "'", obj23.equals(97));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 97 + "'", obj45.equals(97));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0 + "'", obj78.equals(0));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 97);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap8.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        defaultedMap22.clear();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) "hi!");
        java.util.Set set35 = defaultedMap32.entrySet();
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) (short) -1);
        java.util.Set set43 = defaultedMap30.entrySet();
        int i44 = defaultedMap30.size();
        defaultedMap22.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) "hi!");
        boolean b54 = defaultedMap51.isEmpty();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) "hi!");
        boolean b62 = defaultedMap59.isEmpty();
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 10.0d);
        int i65 = defaultedMap59.size();
        boolean b66 = defaultedMap51.equals((java.lang.Object) defaultedMap59);
        defaultedMap47.putAll((java.util.Map) defaultedMap51);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap51);
        java.lang.Object obj69 = defaultedMap1.get((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 97 + "'", obj20.equals(97));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 97 + "'", obj42.equals(97));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) b12);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) "");
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        java.util.Map map39 = collections.map.DefaultedMap.decorate(map34, (java.lang.Object) i38);
        defaultedMap16.putAll(map39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.util.Set set44 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap18.get(obj25);
        java.util.Collection collection27 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) collection27);
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) defaultedMap28);
        boolean b31 = defaultedMap9.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) "hi!");
        java.util.Set set39 = defaultedMap36.entrySet();
        java.lang.Object obj41 = defaultedMap36.get((java.lang.Object) "");
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) (short) 1);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i49 = elitisticListPopulation48.getPopulationLimit();
        java.util.Map map50 = collections.map.DefaultedMap.decorate(map45, (java.lang.Object) i49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) "hi!");
        boolean b56 = defaultedMap53.isEmpty();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map45, predicate51, predicate57);
        defaultedMap33.putAll(map60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) "hi!");
        java.util.Set set66 = defaultedMap63.entrySet();
        java.lang.Object obj68 = defaultedMap63.get((java.lang.Object) "");
        java.lang.Object obj70 = defaultedMap63.get((java.lang.Object) (short) 1);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (short) -1);
        java.util.Collection collection73 = defaultedMap63.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b77 = defaultedMap75.containsValue((java.lang.Object) "hi!");
        java.util.Set set78 = defaultedMap75.entrySet();
        java.lang.String str79 = defaultedMap75.toString();
        defaultedMap75.clear();
        defaultedMap63.putAll((java.util.Map) defaultedMap75);
        java.lang.Object obj82 = defaultedMap9.put((java.lang.Object) map60, (java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b86 = defaultedMap84.containsValue((java.lang.Object) "hi!");
        java.util.Set set87 = defaultedMap84.entrySet();
        java.lang.String str88 = defaultedMap84.toString();
        java.util.Collection collection89 = defaultedMap84.values();
        int i90 = defaultedMap84.size();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate92);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate91, predicate94);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0 + "'", obj68.equals(0));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "{}" + "'", str88.equals("{}"));
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) set6);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) '#', (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome24 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome25 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome24);
        org.junit.Assert.assertNotNull(iterator_chromosome25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        java.util.Set set9 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i13 = elitisticListPopulation12.getPopulationSize();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation12.iterator();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) iterator_chromosome15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) "hi!");
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.String str27 = defaultedMap23.toString();
        defaultedMap23.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.containsValue((java.lang.Object) 10L);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) "");
        java.util.Set set39 = defaultedMap31.keySet();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap31.get(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) "hi!");
        boolean b46 = defaultedMap43.isEmpty();
        java.lang.Object obj47 = defaultedMap23.put(obj40, (java.lang.Object) b46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation50.iterator();
        elitisticListPopulation50.setPopulationLimit(10);
        java.lang.Object obj54 = defaultedMap1.put(obj47, (java.lang.Object) elitisticListPopulation50);
        int i55 = elitisticListPopulation50.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = null;
        try {
            elitisticListPopulation2.setChromosomes(list_chromosome9);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]" + "'", str6.equals("[null]"));
        org.junit.Assert.assertTrue(i7 == 97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        double d6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.String str22 = defaultedMap18.toString();
        java.util.Collection collection23 = defaultedMap18.values();
        int i24 = defaultedMap18.size();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i43 = elitisticListPopulation42.getPopulationLimit();
        java.util.Map map44 = collections.map.DefaultedMap.decorate(map39, (java.lang.Object) i43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        boolean b50 = defaultedMap47.isEmpty();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map39, predicate45, predicate51);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap18.get(obj25);
        java.util.Collection collection27 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) collection27);
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) defaultedMap28);
        int i30 = defaultedMap9.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) population4);
        java.util.Collection collection6 = defaultedMap5.values();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) -1);
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.containsValue((java.lang.Object) 10L);
        int i37 = defaultedMap31.size();
        java.lang.String str38 = defaultedMap31.toString();
        boolean b39 = defaultedMap16.containsKey((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i44 = elitisticListPopulation43.getPopulationSize();
        int i45 = elitisticListPopulation43.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap47.get((java.lang.Object) (short) 1);
        boolean b55 = defaultedMap47.isEmpty();
        java.util.Set set56 = defaultedMap47.entrySet();
        java.lang.Object obj57 = defaultedMap31.put((java.lang.Object) elitisticListPopulation43, (java.lang.Object) set56);
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation60.addChromosome(chromosome61);
        java.lang.String str63 = elitisticListPopulation60.toString();
        java.lang.Object obj64 = defaultedMap31.remove((java.lang.Object) elitisticListPopulation60);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 97 + "'", obj28.equals(97));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 97);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[null]" + "'", str63.equals("[null]"));
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        int i12 = defaultedMap6.size();
        java.lang.String str13 = defaultedMap6.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str13);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.remove(obj8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate(1.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i9 = elitisticListPopulation8.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) 'a', (double) (byte) 0);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11, (int) '#', (double) (short) 0);
        try {
            math.genetics.Chromosome chromosome21 = elitisticListPopulation20.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) "");
        java.util.Set set14 = defaultedMap6.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i18 = elitisticListPopulation17.getPopulationSize();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation17.iterator();
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) iterator_chromosome20);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b23 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        double d29 = elitisticListPopulation26.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome30 = elitisticListPopulation26.spliterator();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) spliterator_chromosome30);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(d27 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertTrue(d29 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        int i6 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(d5 == 0.0d);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) "hi!");
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) "");
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.String str46 = defaultedMap42.toString();
        defaultedMap42.clear();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap42);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) map26, (java.lang.Object) defaultedMap28);
        java.util.Set set50 = defaultedMap1.entrySet();
        boolean b51 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 97 + "'", obj40.equals(97));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        int i6 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome7 = elitisticListPopulation2.iterator();
        int i8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome7);
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) "hi!");
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) "");
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.String str46 = defaultedMap42.toString();
        defaultedMap42.clear();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap42);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) map26, (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) "hi!");
        boolean b54 = defaultedMap51.isEmpty();
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) "hi!");
        boolean b61 = defaultedMap58.isEmpty();
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 10.0d);
        java.lang.Object obj65 = defaultedMap58.get((java.lang.Object) 0.0d);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation69 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome70 = null;
        elitisticListPopulation69.addChromosome(chromosome70);
        java.lang.String str72 = elitisticListPopulation69.toString();
        double d73 = elitisticListPopulation69.getElitismRate();
        math.genetics.Chromosome chromosome74 = null;
        elitisticListPopulation69.addChromosome(chromosome74);
        java.util.Map map76 = collections.map.DefaultedMap.decorate(map66, (java.lang.Object) chromosome74);
        defaultedMap1.putAll(map76);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 97 + "'", obj40.equals(97));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0 + "'", obj63.equals(0));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0 + "'", obj65.equals(0));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[null]" + "'", str72.equals("[null]"));
        org.junit.Assert.assertTrue(d73 == 0.0d);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) "hi!");
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) "");
        java.lang.Object obj36 = defaultedMap29.get((java.lang.Object) (short) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (short) -1);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) "hi!");
        java.util.Set set47 = defaultedMap44.entrySet();
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap54.clear();
        java.lang.Object obj56 = null;
        boolean b57 = defaultedMap54.equals(obj56);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) set52, (java.lang.Object) defaultedMap54);
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) defaultedMap44);
        java.util.Collection collection60 = defaultedMap44.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.String str17 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str23 = elitisticListPopulation22.toString();
        elitisticListPopulation22.setElitismRate((double) 0);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation22.addChromosome(chromosome26);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome28 = elitisticListPopulation22.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str32 = elitisticListPopulation31.toString();
        math.genetics.Population population33 = elitisticListPopulation31.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome34 = elitisticListPopulation31.iterator();
        java.lang.Object obj35 = defaultedMap13.put((java.lang.Object) elitisticListPopulation22, (java.lang.Object) iterator_chromosome34);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]" + "'", str23.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertNotNull(iterator_chromosome34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap4.entrySet();
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) "");
        java.lang.Object obj11 = defaultedMap4.get((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap4.isEmpty();
        java.lang.Object obj14 = defaultedMap4.remove((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        int i24 = elitisticListPopulation6.getPopulationSize();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.String str30 = defaultedMap26.toString();
        java.util.Collection collection31 = defaultedMap26.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        elitisticListPopulation6.setElitismRate((double) 1L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        boolean b9 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) "hi!");
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) b17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i8 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome17, (int) 'a', (double) 0L);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation21);
        math.genetics.Population population23 = elitisticListPopulation21.nextGeneration();
        java.lang.String str24 = elitisticListPopulation21.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]" + "'", str24.equals("[]"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 1);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str10 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population14 = elitisticListPopulation13.nextGeneration();
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        int i17 = elitisticListPopulation13.getPopulationLimit();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) elitisticListPopulation13);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome19 = elitisticListPopulation13.iterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNotNull(iterator_chromosome19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set18 = defaultedMap15.entrySet();
        java.lang.String str19 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) (short) -1);
        java.util.Set set36 = defaultedMap23.entrySet();
        int i37 = defaultedMap23.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) "hi!");
        boolean b47 = defaultedMap44.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) "hi!");
        boolean b55 = defaultedMap52.isEmpty();
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 10.0d);
        int i58 = defaultedMap52.size();
        boolean b59 = defaultedMap44.equals((java.lang.Object) defaultedMap52);
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) "hi!");
        boolean b66 = defaultedMap63.isEmpty();
        java.lang.Object obj68 = defaultedMap63.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) "hi!");
        boolean b73 = defaultedMap70.isEmpty();
        java.lang.Object obj75 = defaultedMap70.get((java.lang.Object) 10.0d);
        java.lang.Object obj77 = defaultedMap70.get((java.lang.Object) 0.0d);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 0.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation81 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome82 = null;
        elitisticListPopulation81.addChromosome(chromosome82);
        java.lang.String str84 = elitisticListPopulation81.toString();
        double d85 = elitisticListPopulation81.getElitismRate();
        math.genetics.Chromosome chromosome86 = null;
        elitisticListPopulation81.addChromosome(chromosome86);
        java.util.Map map88 = collections.map.DefaultedMap.decorate(map78, (java.lang.Object) chromosome86);
        boolean b89 = defaultedMap23.containsValue((java.lang.Object) map78);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 97 + "'", obj35.equals(97));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0 + "'", obj68.equals(0));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0 + "'", obj75.equals(0));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0 + "'", obj77.equals(0));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "[null]" + "'", str84.equals("[null]"));
        org.junit.Assert.assertTrue(d85 == 0.0d);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        int i24 = elitisticListPopulation6.getPopulationSize();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap26.entrySet();
        java.lang.String str30 = defaultedMap26.toString();
        java.util.Collection collection31 = defaultedMap26.values();
        elitisticListPopulation6.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection31);
        elitisticListPopulation6.setPopulationLimit(10);
        int i35 = elitisticListPopulation6.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.String str17 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str27 = elitisticListPopulation26.toString();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) elitisticListPopulation26);
        boolean b29 = defaultedMap13.equals((java.lang.Object) b28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]" + "'", str27.equals("[]"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i8 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10);
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation7.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation(list_chromosome13, (int) '#', (double) 0L);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome13);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population21 = elitisticListPopulation20.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome22);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) "");
        java.lang.Object obj13 = defaultedMap6.get((java.lang.Object) (short) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) -1);
        java.util.Collection collection16 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.String str22 = defaultedMap18.toString();
        defaultedMap18.clear();
        defaultedMap6.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap26.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        java.lang.String str33 = elitisticListPopulation30.toString();
        java.lang.String str34 = elitisticListPopulation30.toString();
        boolean b35 = defaultedMap26.equals((java.lang.Object) elitisticListPopulation30);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i39 = elitisticListPopulation38.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array40 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome41 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41, chromosome_array40);
        elitisticListPopulation38.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome41);
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation38.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation47 = new math.genetics.ElitisticListPopulation(list_chromosome44, (int) '#', (double) 0L);
        elitisticListPopulation30.setChromosomes(list_chromosome44);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) list_chromosome44);
        elitisticListPopulation2.setChromosomes(list_chromosome44);
        java.util.List<math.genetics.Chromosome> list_chromosome51 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[null]" + "'", str34.equals("[null]"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i39 == 97);
        org.junit.Assert.assertNotNull(chromosome_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(list_chromosome51);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) "");
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) (short) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) (short) -1);
        java.util.Set set18 = defaultedMap5.entrySet();
        int i19 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap21.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.lang.String str28 = elitisticListPopulation25.toString();
        java.lang.String str29 = elitisticListPopulation25.toString();
        boolean b30 = defaultedMap21.equals((java.lang.Object) elitisticListPopulation25);
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i34 = elitisticListPopulation33.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array35 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome36 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36, chromosome_array35);
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome36);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation33.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation(list_chromosome39, (int) '#', (double) 0L);
        elitisticListPopulation25.setChromosomes(list_chromosome39);
        boolean b44 = defaultedMap5.containsValue((java.lang.Object) list_chromosome39);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome39);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 97 + "'", obj17.equals(97));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[null]" + "'", str28.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[null]" + "'", str29.equals("[null]"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertNotNull(chromosome_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        java.util.Set set9 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i13 = elitisticListPopulation12.getPopulationSize();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation12.iterator();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) iterator_chromosome15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) "hi!");
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.String str27 = defaultedMap23.toString();
        defaultedMap23.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.containsValue((java.lang.Object) 10L);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) "");
        java.util.Set set39 = defaultedMap31.keySet();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap31.get(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) "hi!");
        boolean b46 = defaultedMap43.isEmpty();
        java.lang.Object obj47 = defaultedMap23.put(obj40, (java.lang.Object) b46);
        math.genetics.ElitisticListPopulation elitisticListPopulation50 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome51 = elitisticListPopulation50.iterator();
        elitisticListPopulation50.setPopulationLimit(10);
        java.lang.Object obj54 = defaultedMap1.put(obj47, (java.lang.Object) elitisticListPopulation50);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(iterator_chromosome51);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) "");
        boolean b14 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.String str34 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) "hi!");
        java.util.Set set43 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.get((java.lang.Object) "");
        java.lang.Object obj47 = defaultedMap40.get((java.lang.Object) (short) 1);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) (short) -1);
        java.util.Set set51 = defaultedMap38.entrySet();
        int i52 = defaultedMap38.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b57 = defaultedMap55.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) "hi!");
        boolean b62 = defaultedMap59.isEmpty();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b69 = defaultedMap67.containsValue((java.lang.Object) "hi!");
        boolean b70 = defaultedMap67.isEmpty();
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) 10.0d);
        int i73 = defaultedMap67.size();
        boolean b74 = defaultedMap59.equals((java.lang.Object) defaultedMap67);
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b80 = defaultedMap78.containsValue((java.lang.Object) "hi!");
        java.util.Set set81 = defaultedMap78.entrySet();
        java.lang.Object obj83 = defaultedMap78.get((java.lang.Object) "");
        java.lang.Object obj84 = defaultedMap6.put((java.lang.Object) defaultedMap38, obj83);
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 97 + "'", obj28.equals(97));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 97 + "'", obj50.equals(97));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0 + "'", obj72.equals(0));
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0 + "'", obj83.equals(0));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0 + "'", obj85.equals(0));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set21 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) "hi!");
        java.lang.String str26 = defaultedMap23.toString();
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 10L);
        int i29 = defaultedMap23.size();
        java.lang.String str30 = defaultedMap23.toString();
        boolean b31 = defaultedMap8.containsKey((java.lang.Object) defaultedMap23);
        java.util.Collection collection32 = defaultedMap8.values();
        boolean b34 = defaultedMap8.equals((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) "hi!");
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) 10L);
        int i42 = defaultedMap36.size();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap36.get(obj43);
        java.util.Collection collection45 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) collection45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) "hi!");
        boolean b51 = defaultedMap48.isEmpty();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap48);
        java.lang.Object obj56 = defaultedMap46.remove((java.lang.Object) defaultedMap55);
        defaultedMap8.putAll((java.util.Map) defaultedMap55);
        defaultedMap1.putAll((java.util.Map) defaultedMap55);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 97 + "'", obj20.equals(97));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        double d6 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        try {
            math.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100);
        boolean b8 = defaultedMap1.equals(obj7);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection19 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap21.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.lang.String str28 = elitisticListPopulation25.toString();
        java.lang.String str29 = elitisticListPopulation25.toString();
        boolean b30 = defaultedMap21.equals((java.lang.Object) elitisticListPopulation25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str38 = elitisticListPopulation37.toString();
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) elitisticListPopulation37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i43 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i47 = elitisticListPopulation46.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome52);
        elitisticListPopulation37.setChromosomes(list_chromosome52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap56.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation60.addChromosome(chromosome61);
        java.lang.String str63 = elitisticListPopulation60.toString();
        java.lang.String str64 = elitisticListPopulation60.toString();
        boolean b65 = defaultedMap56.equals((java.lang.Object) elitisticListPopulation60);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i69 = elitisticListPopulation68.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation68.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71);
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation68.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation(list_chromosome74, (int) '#', (double) 0L);
        elitisticListPopulation60.setChromosomes(list_chromosome74);
        elitisticListPopulation37.setChromosomes(list_chromosome74);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome74);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i84 = elitisticListPopulation83.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        elitisticListPopulation83.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        java.util.List<math.genetics.Chromosome> list_chromosome89 = elitisticListPopulation83.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation92 = new math.genetics.ElitisticListPopulation(list_chromosome89, (int) '#', (double) 0L);
        elitisticListPopulation25.setChromosomes(list_chromosome89);
        boolean b94 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation25);
        java.util.Set set95 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[null]" + "'", str28.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[null]" + "'", str29.equals("[null]"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertTrue(i47 == 97);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[null]" + "'", str63.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[null]" + "'", str64.equals("[null]"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i69 == 97);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertTrue(i84 == 97);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(list_chromosome89);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        try {
            math.genetics.Chromosome chromosome24 = elitisticListPopulation6.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) "");
        java.util.Set set14 = defaultedMap6.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i18 = elitisticListPopulation17.getPopulationSize();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation17.iterator();
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) iterator_chromosome20);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (short) 1);
        boolean b33 = defaultedMap25.isEmpty();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) b33);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        boolean b10 = defaultedMap7.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        boolean b18 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        int i21 = defaultedMap15.size();
        boolean b22 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) "hi!");
        java.lang.String str27 = defaultedMap24.toString();
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) 10L);
        int i30 = defaultedMap24.size();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap24.get(obj31);
        java.util.Collection collection33 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap15.get((java.lang.Object) defaultedMap34);
        boolean b37 = defaultedMap15.containsKey((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.Object obj47 = defaultedMap42.get((java.lang.Object) "");
        java.lang.Object obj49 = defaultedMap42.get((java.lang.Object) (short) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation54 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i55 = elitisticListPopulation54.getPopulationLimit();
        java.util.Map map56 = collections.map.DefaultedMap.decorate(map51, (java.lang.Object) i55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) "hi!");
        boolean b62 = defaultedMap59.isEmpty();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map51, predicate57, predicate63);
        defaultedMap39.putAll(map66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b71 = defaultedMap69.containsValue((java.lang.Object) "hi!");
        java.util.Set set72 = defaultedMap69.entrySet();
        java.lang.Object obj74 = defaultedMap69.get((java.lang.Object) "");
        java.lang.Object obj76 = defaultedMap69.get((java.lang.Object) (short) 1);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (short) -1);
        java.util.Collection collection79 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b83 = defaultedMap81.containsValue((java.lang.Object) "hi!");
        java.util.Set set84 = defaultedMap81.entrySet();
        java.lang.String str85 = defaultedMap81.toString();
        defaultedMap81.clear();
        defaultedMap69.putAll((java.util.Map) defaultedMap81);
        java.lang.Object obj88 = defaultedMap15.put((java.lang.Object) map66, (java.lang.Object) defaultedMap69);
        defaultedMap1.putAll((java.util.Map) defaultedMap69);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i55 == 97);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0 + "'", obj74.equals(0));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0 + "'", obj76.equals(0));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) '#', (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        int i24 = elitisticListPopulation5.getPopulationLimit();
        int i25 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap13.put((java.lang.Object) 10, (java.lang.Object) b24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap8.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        java.lang.String str15 = elitisticListPopulation12.toString();
        java.lang.String str16 = elitisticListPopulation12.toString();
        boolean b17 = defaultedMap8.equals((java.lang.Object) elitisticListPopulation12);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i21 = elitisticListPopulation20.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        elitisticListPopulation20.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23);
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation20.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation(list_chromosome26, (int) '#', (double) 0L);
        elitisticListPopulation12.setChromosomes(list_chromosome26);
        java.util.List<math.genetics.Chromosome> list_chromosome31 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome31);
        math.genetics.Population population33 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]" + "'", str15.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[null]" + "'", str16.equals("[null]"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_chromosome26);
        org.junit.Assert.assertNotNull(list_chromosome31);
        org.junit.Assert.assertNotNull(population33);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        boolean b13 = defaultedMap10.isEmpty();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 10.0d);
        int i16 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.String str25 = defaultedMap18.toString();
        defaultedMap18.clear();
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        math.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap8.clear();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 10L);
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection13);
        double d15 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array4 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome5 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5, chromosome_array4);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome5);
        java.util.List<math.genetics.Chromosome> list_chromosome8 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation(list_chromosome8, 1, 0.0d);
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(chromosome_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(list_chromosome8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) 10L);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) "");
        java.util.Set set15 = defaultedMap7.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i19 = elitisticListPopulation18.getPopulationSize();
        int i20 = elitisticListPopulation18.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation18.iterator();
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) iterator_chromosome21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) iterator_chromosome21);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population28 = elitisticListPopulation27.nextGeneration();
        elitisticListPopulation27.setPopulationLimit((int) (short) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome31 = elitisticListPopulation27.iterator();
        elitisticListPopulation27.setPopulationLimit(1);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(population28);
        org.junit.Assert.assertNotNull(iterator_chromosome31);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        java.lang.String str24 = elitisticListPopulation21.toString();
        double d25 = elitisticListPopulation21.getElitismRate();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation21.addChromosome(chromosome26);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation21);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[null]" + "'", str24.equals("[null]"));
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 10L);
        int i22 = defaultedMap16.size();
        java.lang.String str23 = defaultedMap16.toString();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        java.util.Collection collection25 = defaultedMap1.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) "hi!");
        java.lang.String str32 = defaultedMap29.toString();
        boolean b34 = defaultedMap29.containsValue((java.lang.Object) 10L);
        int i35 = defaultedMap29.size();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap29.get(obj36);
        java.util.Collection collection38 = defaultedMap29.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) collection38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) "hi!");
        boolean b44 = defaultedMap41.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.lang.Object obj49 = defaultedMap39.remove((java.lang.Object) defaultedMap48);
        defaultedMap1.putAll((java.util.Map) defaultedMap48);
        java.util.Set set51 = defaultedMap1.keySet();
        boolean b52 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i8 = elitisticListPopulation7.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array13 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome14 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14, chromosome_array13);
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome14);
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation7.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation(list_chromosome17, (int) 'a', (double) 0L);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) elitisticListPopulation21);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation21.spliterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertNotNull(chromosome_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Collection collection16 = defaultedMap11.values();
        int i17 = defaultedMap11.size();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        int i28 = defaultedMap22.size();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) "hi!");
        java.lang.String str37 = defaultedMap34.toString();
        boolean b39 = defaultedMap34.containsValue((java.lang.Object) 10L);
        int i40 = defaultedMap34.size();
        java.lang.String str41 = defaultedMap34.toString();
        defaultedMap34.clear();
        java.lang.String str43 = defaultedMap34.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i47 = elitisticListPopulation46.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome48 = elitisticListPopulation46.getChromosomes();
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) str43, (java.lang.Object) elitisticListPopulation46);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i53 = elitisticListPopulation52.getPopulationSize();
        int i54 = elitisticListPopulation52.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome55 = elitisticListPopulation52.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i59 = elitisticListPopulation58.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array60 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome61 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61, chromosome_array60);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) 'a', (double) (byte) 0);
        elitisticListPopulation52.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome61);
        math.genetics.ElitisticListPopulation elitisticListPopulation70 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61, (int) '#', (double) (short) 0);
        elitisticListPopulation46.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(list_chromosome48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i54 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome55);
        org.junit.Assert.assertTrue(i59 == 97);
        org.junit.Assert.assertNotNull(chromosome_array60);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 1);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.util.Set set12 = defaultedMap9.entrySet();
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Collection collection14 = defaultedMap9.values();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 97);
        boolean b17 = defaultedMap1.equals((java.lang.Object) 97);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome6 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(iterator_chromosome6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit(10);
        java.lang.String str6 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i10 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        elitisticListPopulation2.setChromosomes(list_chromosome19);
        java.util.List<math.genetics.Chromosome> list_chromosome22 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(list_chromosome22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        java.util.Set set11 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) 10L);
        int i24 = defaultedMap18.size();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap18.get(obj25);
        java.util.Collection collection27 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) collection27);
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) defaultedMap28);
        defaultedMap28.clear();
        java.lang.String str31 = defaultedMap28.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.lang.String str13 = defaultedMap1.toString();
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) '#', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap13.put((java.lang.Object) 10, (java.lang.Object) b24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation30.addChromosome(chromosome31);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome33 = elitisticListPopulation30.iterator();
        int i34 = elitisticListPopulation30.getPopulationSize();
        int i35 = elitisticListPopulation30.getPopulationLimit();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) i35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.get(obj37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(iterator_chromosome33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 97);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        java.lang.String str24 = elitisticListPopulation21.toString();
        double d25 = elitisticListPopulation21.getElitismRate();
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation21.addChromosome(chromosome26);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation21);
        java.lang.String str29 = elitisticListPopulation21.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[null]" + "'", str24.equals("[null]"));
        org.junit.Assert.assertTrue(d25 == 0.0d);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[null, null]" + "'", str29.equals("[null, null]"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str10 = defaultedMap1.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population14 = elitisticListPopulation13.nextGeneration();
        elitisticListPopulation13.setPopulationLimit((int) (short) 1);
        int i17 = elitisticListPopulation13.getPopulationLimit();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) elitisticListPopulation13);
        int i19 = elitisticListPopulation13.getPopulationSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.String str17 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) (short) -1);
        boolean b23 = defaultedMap1.equals((java.lang.Object) (short) 100);
        int i24 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate(1.0d);
        int i13 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        elitisticListPopulation2.setPopulationLimit(100);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(list_chromosome11, (int) (short) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap13.put((java.lang.Object) 10, (java.lang.Object) b24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.String str28 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.lang.String str33 = defaultedMap30.toString();
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) "hi!");
        java.util.Set set40 = defaultedMap37.entrySet();
        java.lang.String str41 = defaultedMap37.toString();
        java.util.Collection collection42 = defaultedMap37.values();
        boolean b43 = defaultedMap30.containsValue((java.lang.Object) collection42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap47.get((java.lang.Object) (short) 1);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (short) -1);
        java.lang.Object obj57 = defaultedMap45.get((java.lang.Object) (short) -1);
        java.util.Set set58 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) "hi!");
        java.lang.String str63 = defaultedMap60.toString();
        boolean b65 = defaultedMap60.containsValue((java.lang.Object) 10L);
        int i66 = defaultedMap60.size();
        java.lang.String str67 = defaultedMap60.toString();
        boolean b68 = defaultedMap45.containsKey((java.lang.Object) defaultedMap60);
        boolean b69 = defaultedMap30.equals((java.lang.Object) defaultedMap60);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i73 = elitisticListPopulation72.getPopulationSize();
        int i74 = elitisticListPopulation72.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b78 = defaultedMap76.containsValue((java.lang.Object) "hi!");
        java.util.Set set79 = defaultedMap76.entrySet();
        java.lang.Object obj81 = defaultedMap76.get((java.lang.Object) "");
        java.lang.Object obj83 = defaultedMap76.get((java.lang.Object) (short) 1);
        boolean b84 = defaultedMap76.isEmpty();
        java.util.Set set85 = defaultedMap76.entrySet();
        java.lang.Object obj86 = defaultedMap60.put((java.lang.Object) elitisticListPopulation72, (java.lang.Object) set85);
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) elitisticListPopulation72);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{10=true}" + "'", str28.equals("{10=true}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 97 + "'", obj57.equals(97));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(i74 == 97);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0 + "'", obj81.equals(0));
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0 + "'", obj83.equals(0));
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0 + "'", obj87.equals(0));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) '#', (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        int i24 = elitisticListPopulation5.getPopulationLimit();
        java.lang.String str25 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]" + "'", str25.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap25.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        java.lang.String str32 = elitisticListPopulation29.toString();
        java.lang.String str33 = elitisticListPopulation29.toString();
        boolean b34 = defaultedMap25.equals((java.lang.Object) elitisticListPopulation29);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation37.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation(list_chromosome43, (int) '#', (double) 0L);
        elitisticListPopulation29.setChromosomes(list_chromosome43);
        elitisticListPopulation6.setChromosomes(list_chromosome43);
        elitisticListPopulation6.setPopulationLimit((int) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]" + "'", str32.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationSize();
        int i7 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate(1.0d);
        int i13 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        try {
            math.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i10 = elitisticListPopulation9.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation9.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome19);
        elitisticListPopulation2.setChromosomes(list_chromosome19);
        java.lang.String str22 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]" + "'", str22.equals("[]"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        int i15 = defaultedMap1.size();
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap25.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        java.lang.String str32 = elitisticListPopulation29.toString();
        java.lang.String str33 = elitisticListPopulation29.toString();
        boolean b34 = defaultedMap25.equals((java.lang.Object) elitisticListPopulation29);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation37.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation(list_chromosome43, (int) '#', (double) 0L);
        elitisticListPopulation29.setChromosomes(list_chromosome43);
        elitisticListPopulation6.setChromosomes(list_chromosome43);
        math.genetics.Chromosome chromosome49 = null;
        elitisticListPopulation6.addChromosome(chromosome49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]" + "'", str32.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 10L);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) "");
        java.util.Set set13 = defaultedMap5.keySet();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.get(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) "hi!");
        java.util.Set set20 = defaultedMap17.entrySet();
        java.lang.String str21 = defaultedMap17.toString();
        java.util.Collection collection22 = defaultedMap17.values();
        int i23 = defaultedMap17.size();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap28.clear();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 10L);
        java.lang.String str32 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) "hi!");
        boolean b37 = defaultedMap34.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate24, predicate41);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) predicate24);
        java.util.Collection collection45 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 97 + "'", obj44.equals(97));
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Collection collection11 = defaultedMap1.values();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        elitisticListPopulation14.setPopulationLimit((int) '#');
        java.lang.String str17 = elitisticListPopulation14.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) "hi!");
        java.lang.String str22 = defaultedMap19.toString();
        boolean b24 = defaultedMap19.containsValue((java.lang.Object) 10L);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) "");
        java.util.Set set27 = defaultedMap19.keySet();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) str17, (java.lang.Object) set27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i43 = elitisticListPopulation42.getPopulationLimit();
        java.util.Map map44 = collections.map.DefaultedMap.decorate(map39, (java.lang.Object) i43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        boolean b50 = defaultedMap47.isEmpty();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map39, predicate45, predicate51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b58 = defaultedMap56.containsValue((java.lang.Object) "hi!");
        java.util.Set set59 = defaultedMap56.entrySet();
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) "");
        java.lang.Object obj63 = defaultedMap56.get((java.lang.Object) (short) 1);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i69 = elitisticListPopulation68.getPopulationLimit();
        java.util.Map map70 = collections.map.DefaultedMap.decorate(map65, (java.lang.Object) i69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b75 = defaultedMap73.containsValue((java.lang.Object) "hi!");
        boolean b76 = defaultedMap73.isEmpty();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate(map65, predicate71, predicate77);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate45, predicate71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0 + "'", obj63.equals(0));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i69 == 97);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i6 = elitisticListPopulation5.getPopulationSize();
        int i7 = elitisticListPopulation5.getPopulationLimit();
        double d8 = elitisticListPopulation5.getElitismRate();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) d8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 97);
        org.junit.Assert.assertTrue(d8 == 0.0d);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        boolean b9 = defaultedMap1.isEmpty();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i13 = elitisticListPopulation12.getPopulationSize();
        int i14 = elitisticListPopulation12.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome15 = elitisticListPopulation12.iterator();
        math.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation12.addChromosome(chromosome16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap19.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation23 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation23.addChromosome(chromosome24);
        java.lang.String str26 = elitisticListPopulation23.toString();
        java.lang.String str27 = elitisticListPopulation23.toString();
        boolean b28 = defaultedMap19.equals((java.lang.Object) elitisticListPopulation23);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i32 = elitisticListPopulation31.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        elitisticListPopulation31.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34);
        java.util.List<math.genetics.Chromosome> list_chromosome37 = elitisticListPopulation31.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation(list_chromosome37, (int) '#', (double) 0L);
        elitisticListPopulation23.setChromosomes(list_chromosome37);
        elitisticListPopulation12.setChromosomes(list_chromosome37);
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation(list_chromosome37, (int) (short) 100, (double) (byte) 0);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome15);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[null]" + "'", str26.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[null]" + "'", str27.equals("[null]"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 97);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(list_chromosome37);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) -1);
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) "hi!");
        java.util.Set set38 = defaultedMap35.entrySet();
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) "");
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) "hi!");
        java.util.Set set48 = defaultedMap45.entrySet();
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) "");
        java.lang.Object obj52 = defaultedMap45.get((java.lang.Object) (short) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (short) -1);
        java.lang.Object obj55 = defaultedMap43.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b59 = defaultedMap57.containsValue((java.lang.Object) "hi!");
        java.util.Set set60 = defaultedMap57.entrySet();
        java.lang.String str61 = defaultedMap57.toString();
        defaultedMap57.clear();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) defaultedMap57);
        java.lang.Object obj64 = defaultedMap16.put((java.lang.Object) map41, (java.lang.Object) defaultedMap43);
        boolean b65 = defaultedMap1.containsKey((java.lang.Object) map41);
        java.util.Set set66 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 97 + "'", obj28.equals(97));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 97 + "'", obj55.equals(97));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) 10L);
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) "");
        java.util.Set set14 = defaultedMap6.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i18 = elitisticListPopulation17.getPopulationSize();
        int i19 = elitisticListPopulation17.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome20 = elitisticListPopulation17.iterator();
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) iterator_chromosome20);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap6.entrySet();
        java.lang.String str10 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) map24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        elitisticListPopulation5.setElitismRate(1.0d);
        java.lang.String str13 = elitisticListPopulation5.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation16 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation16.addChromosome(chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i22 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation21.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation(list_chromosome27, (int) '#', (double) 0L);
        elitisticListPopulation16.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]" + "'", str13.equals("[null]"));
        org.junit.Assert.assertTrue(i22 == 97);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap5.containsValue((java.lang.Object) collection17);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection17);
        double d20 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d20 == 0.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        int i6 = elitisticListPopulation2.getPopulationLimit();
        double d7 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome8 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        java.lang.String str17 = elitisticListPopulation14.toString();
        java.lang.String str18 = elitisticListPopulation14.toString();
        boolean b19 = defaultedMap10.equals((java.lang.Object) elitisticListPopulation14);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array24 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome25 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25, chromosome_array24);
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation22.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation(list_chromosome28, (int) '#', (double) 0L);
        elitisticListPopulation14.setChromosomes(list_chromosome28);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome33);
        org.junit.Assert.assertNotNull(population3);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
        org.junit.Assert.assertNotNull(spliterator_chromosome8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[null]" + "'", str17.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[null]" + "'", str18.equals("[null]"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(chromosome_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(list_chromosome28);
        org.junit.Assert.assertNotNull(list_chromosome33);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population11 = elitisticListPopulation10.nextGeneration();
        elitisticListPopulation10.setPopulationLimit((int) (short) 1);
        int i14 = elitisticListPopulation10.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i18 = elitisticListPopulation17.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i22 = elitisticListPopulation21.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array23 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome24 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24, chromosome_array23);
        elitisticListPopulation21.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome24);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation17.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome27);
        elitisticListPopulation10.setChromosomes(list_chromosome27);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i33 = elitisticListPopulation32.getPopulationSize();
        int i34 = elitisticListPopulation32.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome35 = elitisticListPopulation32.iterator();
        math.genetics.Chromosome chromosome36 = null;
        elitisticListPopulation32.addChromosome(chromosome36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap39.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome44 = null;
        elitisticListPopulation43.addChromosome(chromosome44);
        java.lang.String str46 = elitisticListPopulation43.toString();
        java.lang.String str47 = elitisticListPopulation43.toString();
        boolean b48 = defaultedMap39.equals((java.lang.Object) elitisticListPopulation43);
        math.genetics.ElitisticListPopulation elitisticListPopulation51 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i52 = elitisticListPopulation51.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array53 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome54 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54, chromosome_array53);
        elitisticListPopulation51.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome54);
        java.util.List<math.genetics.Chromosome> list_chromosome57 = elitisticListPopulation51.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation(list_chromosome57, (int) '#', (double) 0L);
        elitisticListPopulation43.setChromosomes(list_chromosome57);
        elitisticListPopulation32.setChromosomes(list_chromosome57);
        math.genetics.ElitisticListPopulation elitisticListPopulation65 = new math.genetics.ElitisticListPopulation(list_chromosome57, (int) (short) 100, (double) (byte) 0);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) elitisticListPopulation10, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i22 == 97);
        org.junit.Assert.assertNotNull(chromosome_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome35);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[null]" + "'", str46.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[null]" + "'", str47.equals("[null]"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i52 == 97);
        org.junit.Assert.assertNotNull(chromosome_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(list_chromosome57);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) "");
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        java.util.Map map24 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) i23);
        defaultedMap1.putAll(map24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) "hi!");
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) "");
        java.lang.Object obj36 = defaultedMap29.get((java.lang.Object) (short) 1);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (short) -1);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) "hi!");
        java.util.Set set47 = defaultedMap44.entrySet();
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap54.clear();
        java.lang.Object obj56 = null;
        boolean b57 = defaultedMap54.equals(obj56);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) set52, (java.lang.Object) defaultedMap54);
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) defaultedMap44);
        java.lang.String str60 = defaultedMap44.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{[]={}}" + "'", str60.equals("{[]={}}"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) 10L);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) "");
        java.util.Set set15 = defaultedMap7.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i19 = elitisticListPopulation18.getPopulationSize();
        int i20 = elitisticListPopulation18.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome21 = elitisticListPopulation18.iterator();
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) iterator_chromosome21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) iterator_chromosome21);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set9, (java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        int i15 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap17.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation21.addChromosome(chromosome22);
        java.lang.String str24 = elitisticListPopulation21.toString();
        java.lang.String str25 = elitisticListPopulation21.toString();
        boolean b26 = defaultedMap17.equals((java.lang.Object) elitisticListPopulation21);
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i30 = elitisticListPopulation29.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array31 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome32 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32, chromosome_array31);
        elitisticListPopulation29.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome32);
        java.util.List<math.genetics.Chromosome> list_chromosome35 = elitisticListPopulation29.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation(list_chromosome35, (int) '#', (double) 0L);
        elitisticListPopulation21.setChromosomes(list_chromosome35);
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) list_chromosome35);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[null]" + "'", str24.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[null]" + "'", str25.equals("[null]"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i30 == 97);
        org.junit.Assert.assertNotNull(chromosome_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_chromosome35);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.String str16 = defaultedMap12.toString();
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap5.containsValue((java.lang.Object) collection17);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection17);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = null;
        try {
            elitisticListPopulation2.setChromosomes(list_chromosome20);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        int i5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue(i5 == 97);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        boolean b9 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) "hi!");
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) b17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        boolean b24 = defaultedMap21.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        int i30 = defaultedMap28.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) "hi!");
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) "");
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (short) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.String str46 = defaultedMap42.toString();
        defaultedMap42.clear();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap42);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) map26, (java.lang.Object) defaultedMap28);
        math.genetics.ElitisticListPopulation elitisticListPopulation52 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        elitisticListPopulation52.setPopulationLimit((int) '#');
        java.lang.String str55 = elitisticListPopulation52.toString();
        math.genetics.Population population56 = elitisticListPopulation52.nextGeneration();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) population56);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 97 + "'", obj40.equals(97));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[]" + "'", str55.equals("[]"));
        org.junit.Assert.assertNotNull(population56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population10 = elitisticListPopulation9.nextGeneration();
        boolean b11 = defaultedMap1.equals((java.lang.Object) population10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation6 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str7 = elitisticListPopulation6.toString();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i12 = elitisticListPopulation11.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i16 = elitisticListPopulation15.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array17 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome18 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18, chromosome_array17);
        elitisticListPopulation15.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        elitisticListPopulation6.setChromosomes(list_chromosome21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap25.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation29 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation29.addChromosome(chromosome30);
        java.lang.String str32 = elitisticListPopulation29.toString();
        java.lang.String str33 = elitisticListPopulation29.toString();
        boolean b34 = defaultedMap25.equals((java.lang.Object) elitisticListPopulation29);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array39 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome40 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40, chromosome_array39);
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome40);
        java.util.List<math.genetics.Chromosome> list_chromosome43 = elitisticListPopulation37.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation(list_chromosome43, (int) '#', (double) 0L);
        elitisticListPopulation29.setChromosomes(list_chromosome43);
        elitisticListPopulation6.setChromosomes(list_chromosome43);
        try {
            math.genetics.Chromosome chromosome49 = elitisticListPopulation6.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNotNull(chromosome_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]" + "'", str32.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]" + "'", str33.equals("[null]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertNotNull(chromosome_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(list_chromosome43);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate22, predicate23);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str33 = elitisticListPopulation32.toString();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) elitisticListPopulation32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i42 = elitisticListPopulation41.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome47);
        elitisticListPopulation32.setChromosomes(list_chromosome47);
        boolean b50 = defaultedMap12.containsKey((java.lang.Object) elitisticListPopulation32);
        math.genetics.ElitisticListPopulation elitisticListPopulation53 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str54 = elitisticListPopulation53.toString();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome55 = elitisticListPopulation53.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation58 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i59 = elitisticListPopulation58.getPopulationSize();
        int i60 = elitisticListPopulation58.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome61 = elitisticListPopulation58.iterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation64 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i65 = elitisticListPopulation64.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array66 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome67 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67, chromosome_array66);
        elitisticListPopulation64.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67);
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome67, (int) 'a', (double) (byte) 0);
        elitisticListPopulation58.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67);
        elitisticListPopulation53.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome67);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome75 = elitisticListPopulation53.iterator();
        boolean b76 = defaultedMap12.containsKey((java.lang.Object) iterator_chromosome75);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]" + "'", str54.equals("[]"));
        org.junit.Assert.assertNotNull(iterator_chromosome55);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome61);
        org.junit.Assert.assertTrue(i65 == 97);
        org.junit.Assert.assertNotNull(chromosome_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation9 = new math.genetics.ElitisticListPopulation(list_chromosome6, 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.containsValue((java.lang.Object) 10L);
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Collection collection19 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap21.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation25.addChromosome(chromosome26);
        java.lang.String str28 = elitisticListPopulation25.toString();
        java.lang.String str29 = elitisticListPopulation25.toString();
        boolean b30 = defaultedMap21.equals((java.lang.Object) elitisticListPopulation25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str38 = elitisticListPopulation37.toString();
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) elitisticListPopulation37);
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i43 = elitisticListPopulation42.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation46 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i47 = elitisticListPopulation46.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array48 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome49 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49, chromosome_array48);
        elitisticListPopulation46.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome49);
        java.util.List<math.genetics.Chromosome> list_chromosome52 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation42.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome52);
        elitisticListPopulation37.setChromosomes(list_chromosome52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap56.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation60 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome61 = null;
        elitisticListPopulation60.addChromosome(chromosome61);
        java.lang.String str63 = elitisticListPopulation60.toString();
        java.lang.String str64 = elitisticListPopulation60.toString();
        boolean b65 = defaultedMap56.equals((java.lang.Object) elitisticListPopulation60);
        math.genetics.ElitisticListPopulation elitisticListPopulation68 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i69 = elitisticListPopulation68.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array70 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome71 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71, chromosome_array70);
        elitisticListPopulation68.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome71);
        java.util.List<math.genetics.Chromosome> list_chromosome74 = elitisticListPopulation68.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation77 = new math.genetics.ElitisticListPopulation(list_chromosome74, (int) '#', (double) 0L);
        elitisticListPopulation60.setChromosomes(list_chromosome74);
        elitisticListPopulation37.setChromosomes(list_chromosome74);
        elitisticListPopulation25.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome74);
        math.genetics.ElitisticListPopulation elitisticListPopulation83 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i84 = elitisticListPopulation83.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array85 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome86 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86, chromosome_array85);
        elitisticListPopulation83.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome86);
        java.util.List<math.genetics.Chromosome> list_chromosome89 = elitisticListPopulation83.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation92 = new math.genetics.ElitisticListPopulation(list_chromosome89, (int) '#', (double) 0L);
        elitisticListPopulation25.setChromosomes(list_chromosome89);
        boolean b94 = defaultedMap1.containsValue((java.lang.Object) elitisticListPopulation25);
        math.genetics.Population population95 = elitisticListPopulation25.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome96 = elitisticListPopulation25.iterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[null]" + "'", str28.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[null]" + "'", str29.equals("[null]"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertTrue(i47 == 97);
        org.junit.Assert.assertNotNull(chromosome_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(list_chromosome52);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[null]" + "'", str63.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[null]" + "'", str64.equals("[null]"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i69 == 97);
        org.junit.Assert.assertNotNull(chromosome_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(list_chromosome74);
        org.junit.Assert.assertTrue(i84 == 97);
        org.junit.Assert.assertNotNull(chromosome_array85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(list_chromosome89);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(population95);
        org.junit.Assert.assertNotNull(iterator_chromosome96);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) "");
        java.lang.String str9 = defaultedMap1.toString();
        java.util.Map map10 = null;
        try {
            defaultedMap1.putAll(map10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        int i15 = defaultedMap1.size();
        math.genetics.ElitisticListPopulation elitisticListPopulation18 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i19 = elitisticListPopulation18.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        elitisticListPopulation18.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21);
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) 'a', (double) (byte) 0);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome27 = elitisticListPopulation26.spliterator();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) elitisticListPopulation26);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) (short) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (short) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate22, predicate23);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str33 = elitisticListPopulation32.toString();
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) elitisticListPopulation32);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i38 = elitisticListPopulation37.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation41 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i42 = elitisticListPopulation41.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array43 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome44 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44, chromosome_array43);
        elitisticListPopulation41.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome44);
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation37.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome47);
        elitisticListPopulation32.setChromosomes(list_chromosome47);
        boolean b50 = defaultedMap12.containsKey((java.lang.Object) elitisticListPopulation32);
        math.genetics.Chromosome chromosome51 = null;
        elitisticListPopulation32.addChromosome(chromosome51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]" + "'", str33.equals("[]"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertNotNull(chromosome_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) population4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) "hi!");
        java.util.Set set17 = defaultedMap14.entrySet();
        java.lang.String str18 = defaultedMap14.toString();
        java.util.Collection collection19 = defaultedMap14.values();
        boolean b20 = defaultedMap7.containsValue((java.lang.Object) collection19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) "hi!");
        java.util.Set set27 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) (short) 1);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (short) -1);
        java.lang.Object obj34 = defaultedMap22.get((java.lang.Object) (short) -1);
        java.util.Set set35 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) "hi!");
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.containsValue((java.lang.Object) 10L);
        int i43 = defaultedMap37.size();
        java.lang.String str44 = defaultedMap37.toString();
        boolean b45 = defaultedMap22.containsKey((java.lang.Object) defaultedMap37);
        boolean b46 = defaultedMap7.equals((java.lang.Object) defaultedMap37);
        math.genetics.ElitisticListPopulation elitisticListPopulation49 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i50 = elitisticListPopulation49.getPopulationSize();
        int i51 = elitisticListPopulation49.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) "hi!");
        java.util.Set set56 = defaultedMap53.entrySet();
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) "");
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) (short) 1);
        boolean b61 = defaultedMap53.isEmpty();
        java.util.Set set62 = defaultedMap53.entrySet();
        java.lang.Object obj63 = defaultedMap37.put((java.lang.Object) elitisticListPopulation49, (java.lang.Object) set62);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome64 = elitisticListPopulation49.spliterator();
        boolean b65 = defaultedMap5.equals((java.lang.Object) elitisticListPopulation49);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 97 + "'", obj34.equals(97));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == 97);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0 + "'", obj58.equals(0));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(spliterator_chromosome64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) (short) -1);
        java.util.Set set22 = defaultedMap9.entrySet();
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) "hi!");
        java.lang.String str28 = defaultedMap25.toString();
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 10L);
        boolean b32 = defaultedMap25.containsKey((java.lang.Object) "");
        java.util.Set set33 = defaultedMap25.keySet();
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap25);
        math.genetics.ElitisticListPopulation elitisticListPopulation37 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d38 = elitisticListPopulation37.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation37.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation42 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population43 = elitisticListPopulation42.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome44 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation37.setChromosomes(list_chromosome44);
        java.util.List<math.genetics.Chromosome> list_chromosome46 = elitisticListPopulation37.getChromosomes();
        java.lang.Object obj47 = defaultedMap25.get((java.lang.Object) elitisticListPopulation37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 97 + "'", obj21.equals(97));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue(d38 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome39);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNotNull(list_chromosome44);
        org.junit.Assert.assertNotNull(list_chromosome46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) population4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        try {
            elitisticListPopulation2.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        boolean b9 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) "hi!");
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap6.put((java.lang.Object) 10, (java.lang.Object) b17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.containsValue((java.lang.Object) 10L);
        int i27 = defaultedMap21.size();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap21.get(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.util.Set set34 = defaultedMap31.entrySet();
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Collection collection36 = defaultedMap31.values();
        int i37 = defaultedMap31.size();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap42.entrySet();
        java.lang.String str46 = defaultedMap42.toString();
        java.util.Collection collection47 = defaultedMap42.values();
        int i48 = defaultedMap42.size();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate38, predicate49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) "hi!");
        java.lang.String str57 = defaultedMap54.toString();
        boolean b59 = defaultedMap54.containsValue((java.lang.Object) 10L);
        int i60 = defaultedMap54.size();
        java.lang.String str61 = defaultedMap54.toString();
        defaultedMap54.clear();
        java.lang.String str63 = defaultedMap54.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation66 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i67 = elitisticListPopulation66.getPopulationSize();
        java.util.List<math.genetics.Chromosome> list_chromosome68 = elitisticListPopulation66.getChromosomes();
        java.lang.Object obj69 = defaultedMap21.put((java.lang.Object) str63, (java.lang.Object) elitisticListPopulation66);
        boolean b70 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        java.util.Set set71 = defaultedMap21.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(list_chromosome68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.String str15 = defaultedMap11.toString();
        java.util.Collection collection16 = defaultedMap11.values();
        int i17 = defaultedMap11.size();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.String str26 = defaultedMap22.toString();
        java.util.Collection collection27 = defaultedMap22.values();
        int i28 = defaultedMap22.size();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate29);
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
        java.lang.String str5 = elitisticListPopulation2.toString();
        int i6 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]" + "'", str5.equals("[null]"));
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.clear();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set9, (java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i31 = elitisticListPopulation30.getPopulationLimit();
        java.util.Map map32 = collections.map.DefaultedMap.decorate(map27, (java.lang.Object) i31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) "hi!");
        boolean b38 = defaultedMap35.isEmpty();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map27, predicate33, predicate39);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) predicate39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i31 == 97);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        int i4 = elitisticListPopulation2.getPopulationLimit();
        double d5 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation11.addChromosome(chromosome12);
        java.lang.String str14 = elitisticListPopulation11.toString();
        java.lang.String str15 = elitisticListPopulation11.toString();
        boolean b16 = defaultedMap7.equals((java.lang.Object) elitisticListPopulation11);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i20 = elitisticListPopulation19.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array21 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome22 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22, chromosome_array21);
        elitisticListPopulation19.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome22);
        java.util.List<math.genetics.Chromosome> list_chromosome25 = elitisticListPopulation19.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation28 = new math.genetics.ElitisticListPopulation(list_chromosome25, (int) '#', (double) 0L);
        elitisticListPopulation11.setChromosomes(list_chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome30 = elitisticListPopulation11.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation33 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation33.addChromosome(chromosome34);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome36 = elitisticListPopulation33.iterator();
        java.lang.String str37 = elitisticListPopulation33.toString();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d41 = elitisticListPopulation40.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome42 = elitisticListPopulation40.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation45 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population46 = elitisticListPopulation45.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome47 = elitisticListPopulation45.getChromosomes();
        elitisticListPopulation40.setChromosomes(list_chromosome47);
        java.util.List<math.genetics.Chromosome> list_chromosome49 = elitisticListPopulation40.getChromosomes();
        elitisticListPopulation33.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome49);
        elitisticListPopulation11.setChromosomes(list_chromosome49);
        elitisticListPopulation2.setChromosomes(list_chromosome49);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 97);
        org.junit.Assert.assertTrue(d5 == 0.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[null]" + "'", str14.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]" + "'", str15.equals("[null]"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertNotNull(chromosome_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(list_chromosome25);
        org.junit.Assert.assertNotNull(list_chromosome30);
        org.junit.Assert.assertNotNull(iterator_chromosome36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[null]" + "'", str37.equals("[null]"));
        org.junit.Assert.assertTrue(d41 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome42);
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertNotNull(list_chromosome47);
        org.junit.Assert.assertNotNull(list_chromosome49);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.String str14 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.String str16 = defaultedMap10.toString();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]" + "'", str7.equals("[null]"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.containsValue((java.lang.Object) 10L);
        int i22 = defaultedMap16.size();
        java.lang.String str23 = defaultedMap16.toString();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        java.util.Collection collection25 = defaultedMap1.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) '4');
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Population population8 = elitisticListPopulation7.nextGeneration();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome9, 97, (double) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap15.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        java.lang.String str22 = elitisticListPopulation19.toString();
        java.lang.String str23 = elitisticListPopulation19.toString();
        boolean b24 = defaultedMap15.equals((java.lang.Object) elitisticListPopulation19);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i28 = elitisticListPopulation27.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation27.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation36 = new math.genetics.ElitisticListPopulation(list_chromosome33, (int) '#', (double) 0L);
        elitisticListPopulation19.setChromosomes(list_chromosome33);
        elitisticListPopulation13.setChromosomes(list_chromosome33);
        java.util.List<math.genetics.Chromosome> list_chromosome39 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation13.setPopulationLimit((int) (byte) 100);
        org.junit.Assert.assertTrue(d3 == 0.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[null]" + "'", str22.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[null]" + "'", str23.equals("[null]"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 97);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(list_chromosome39);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        int i15 = defaultedMap9.size();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        boolean b15 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 10.0d);
        int i18 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) "hi!");
        java.lang.String str23 = defaultedMap20.toString();
        boolean b25 = defaultedMap20.containsValue((java.lang.Object) 10L);
        int i26 = defaultedMap20.size();
        java.lang.String str27 = defaultedMap20.toString();
        defaultedMap20.clear();
        java.lang.Object obj29 = defaultedMap12.get((java.lang.Object) defaultedMap20);
        math.genetics.ElitisticListPopulation elitisticListPopulation32 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation32.addChromosome(chromosome33);
        java.lang.String str35 = elitisticListPopulation32.toString();
        double d36 = elitisticListPopulation32.getElitismRate();
        math.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation32.addChromosome(chromosome37);
        boolean b39 = defaultedMap12.containsKey((java.lang.Object) elitisticListPopulation32);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) elitisticListPopulation32);
        java.lang.String str41 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[null]" + "'", str35.equals("[null]"));
        org.junit.Assert.assertTrue(d36 == 0.0d);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        boolean b18 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) "hi!");
        java.lang.String str30 = defaultedMap27.toString();
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) 10L);
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) "");
        java.util.Set set35 = defaultedMap27.entrySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i39 = elitisticListPopulation38.getPopulationSize();
        int i40 = elitisticListPopulation38.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome41 = elitisticListPopulation38.iterator();
        java.lang.Object obj42 = defaultedMap27.get((java.lang.Object) iterator_chromosome41);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        boolean b44 = defaultedMap22.isEmpty();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) b44);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97 + "'", obj13.equals(97));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 97);
        org.junit.Assert.assertNotNull(iterator_chromosome41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        boolean b8 = defaultedMap5.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) "hi!");
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        int i19 = defaultedMap13.size();
        boolean b20 = defaultedMap5.equals((java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome27 = elitisticListPopulation24.iterator();
        int i28 = elitisticListPopulation24.getPopulationSize();
        int i29 = elitisticListPopulation24.getPopulationLimit();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i29);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) 100);
        java.util.Set set33 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(iterator_chromosome27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 97);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 97);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) "hi!");
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        java.lang.String str18 = elitisticListPopulation17.toString();
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) elitisticListPopulation17);
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i23 = elitisticListPopulation22.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i27 = elitisticListPopulation26.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array28 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome29 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29, chromosome_array28);
        elitisticListPopulation26.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome29);
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation22.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome32);
        elitisticListPopulation17.setChromosomes(list_chromosome32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap36.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation40 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation40.addChromosome(chromosome41);
        java.lang.String str43 = elitisticListPopulation40.toString();
        java.lang.String str44 = elitisticListPopulation40.toString();
        boolean b45 = defaultedMap36.equals((java.lang.Object) elitisticListPopulation40);
        math.genetics.ElitisticListPopulation elitisticListPopulation48 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i49 = elitisticListPopulation48.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array50 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome51 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51, chromosome_array50);
        elitisticListPopulation48.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome51);
        java.util.List<math.genetics.Chromosome> list_chromosome54 = elitisticListPopulation48.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation57 = new math.genetics.ElitisticListPopulation(list_chromosome54, (int) '#', (double) 0L);
        elitisticListPopulation40.setChromosomes(list_chromosome54);
        elitisticListPopulation17.setChromosomes(list_chromosome54);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome54);
        math.genetics.ElitisticListPopulation elitisticListPopulation63 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i64 = elitisticListPopulation63.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array65 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome66 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66, chromosome_array65);
        elitisticListPopulation63.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome66);
        java.util.List<math.genetics.Chromosome> list_chromosome69 = elitisticListPopulation63.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation72 = new math.genetics.ElitisticListPopulation(list_chromosome69, (int) '#', (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome69);
        math.genetics.Population population74 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i23 == 97);
        org.junit.Assert.assertTrue(i27 == 97);
        org.junit.Assert.assertNotNull(chromosome_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[null]" + "'", str43.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[null]" + "'", str44.equals("[null]"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i49 == 97);
        org.junit.Assert.assertNotNull(chromosome_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(list_chromosome54);
        org.junit.Assert.assertTrue(i64 == 97);
        org.junit.Assert.assertNotNull(chromosome_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(list_chromosome69);
        org.junit.Assert.assertNotNull(population74);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        double d3 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 0.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        java.util.Map map15 = collections.map.DefaultedMap.decorate(map10, (java.lang.Object) i14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate(map10, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.clear();
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        java.lang.String str8 = elitisticListPopulation5.toString();
        java.lang.String str9 = elitisticListPopulation5.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) elitisticListPopulation5);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i14 = elitisticListPopulation13.getPopulationLimit();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation13.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation22 = new math.genetics.ElitisticListPopulation(list_chromosome19, (int) '#', (double) 0L);
        elitisticListPopulation5.setChromosomes(list_chromosome19);
        elitisticListPopulation5.setElitismRate((double) (byte) 1);
        java.lang.String str26 = elitisticListPopulation5.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]" + "'", str8.equals("[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[null]" + "'", str9.equals("[null]"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue(i3 == 97);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i3 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        int i6 = elitisticListPopulation2.getPopulationSize();
        double d7 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(d7 == 0.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Set set11 = defaultedMap8.entrySet();
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Collection collection13 = defaultedMap8.values();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) collection13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 97);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) "hi!");
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) "");
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) -1);
        java.util.Set set29 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.containsValue((java.lang.Object) 10L);
        int i37 = defaultedMap31.size();
        java.lang.String str38 = defaultedMap31.toString();
        boolean b39 = defaultedMap16.containsKey((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        math.genetics.ElitisticListPopulation elitisticListPopulation43 = new math.genetics.ElitisticListPopulation((int) 'a', (double) 0L);
        int i44 = elitisticListPopulation43.getPopulationSize();
        int i45 = elitisticListPopulation43.getPopulationLimit();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap47.get((java.lang.Object) (short) 1);
        boolean b55 = defaultedMap47.isEmpty();
        java.util.Set set56 = defaultedMap47.entrySet();
        java.lang.Object obj57 = defaultedMap31.put((java.lang.Object) elitisticListPopulation43, (java.lang.Object) set56);
        int i58 = elitisticListPopulation43.getPopulationLimit();
        math.genetics.Population population59 = elitisticListPopulation43.nextGeneration();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 97 + "'", obj28.equals(97));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 97);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 97);
        org.junit.Assert.assertNotNull(population59);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) 0.0d);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0d);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
    }
}

