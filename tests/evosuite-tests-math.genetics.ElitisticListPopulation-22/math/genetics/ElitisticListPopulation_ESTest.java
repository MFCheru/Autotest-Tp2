/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 10:19:43 GMT 2017
 */

package math.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import math.genetics.Chromosome;
import math.genetics.ElitisticListPopulation;
import math.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2243, 0.9);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.add((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 169, 0.0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.nextGeneration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = null;
      try {
        elitisticListPopulation1 = new ElitisticListPopulation(list0, (-1119), (-1119));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1115, 1.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      ElitisticListPopulation elitisticListPopulation1 = null;
      try {
        elitisticListPopulation1 = new ElitisticListPopulation(list0, 1115, (-1437.7881413668345));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1,437.788)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((-1), (-1937.456));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(1300, (-2395.704708839285));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-2,395.705)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.setElitismRate(1);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1882, 0.0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1882, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate(1882);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,882)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1521, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1, 1);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
      assertEquals(1, population0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 169, 0.0);
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
  }
}
