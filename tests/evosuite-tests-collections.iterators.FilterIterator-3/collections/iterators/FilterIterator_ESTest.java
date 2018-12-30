/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 05:18:29 GMT 2017
 */

package collections.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.InstanceofPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.functors.UniquePredicate;
import collections.iterators.FilterIterator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FilterIterator_ESTest extends FilterIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Predicate predicate0 = filterIterator0.getPredicate();
      assertNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Iterator iterator0 = filterIterator0.getIterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.iterator();
      Object object0 = new Object();
      linkedList0.addLast(object0);
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0, instanceofPredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      Iterator<Object> iterator0 = linkedList0.iterator();
      linkedList0.add(object0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.iterator();
      Object object0 = new Object();
      linkedList0.add(object0);
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(iterator0, truePredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("");
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      filterIterator0.forEachRemaining(consumer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.offerFirst("O9#?u2bfG&");
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      filterIterator0.hasNext();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // remove() cannot be called
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.offerFirst("O9#?u2bfG&");
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      filterIterator0.next();
      filterIterator0.remove();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.offerFirst("O9#?u2bfG&");
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      filterIterator0.hasNext();
      boolean boolean0 = filterIterator0.hasNext();
      assertTrue(listIterator0.hasPrevious());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, notNullPredicate0);
      boolean boolean0 = filterIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      filterIterator0.setIterator(filterIterator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      filterIterator0.setPredicate(predicate0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      Iterator iterator0 = filterIterator0.getIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, predicate0);
      Predicate predicate1 = filterIterator0.getPredicate();
      assertSame(predicate1, predicate0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }
}