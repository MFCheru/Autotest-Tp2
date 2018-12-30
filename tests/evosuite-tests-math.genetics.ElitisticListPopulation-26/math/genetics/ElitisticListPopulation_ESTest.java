/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 11:06:37 GMT 2017
 */

package math.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import math.genetics.Chromosome;
import math.genetics.DummyBinaryChromosome;
import math.genetics.ElitisticListPopulation;
import math.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(192, 0.0);
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 0, 3376.49355417);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 236, 236);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (236)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 4, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(2460, (-677.467287718009));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-677.467)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(159, 0.9);
      elitisticListPopulation0.setElitismRate(0.0);
      assertEquals(159, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 236, 0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1449, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate(1449);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,449)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      try { 
        elitisticListPopulation0.setElitismRate((-129.67918));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-129.679)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(linkedList0);
      elitisticListPopulation0.addChromosome(dummyBinaryChromosome0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
      assertEquals(1, population0.getPopulationSize());
  }
}