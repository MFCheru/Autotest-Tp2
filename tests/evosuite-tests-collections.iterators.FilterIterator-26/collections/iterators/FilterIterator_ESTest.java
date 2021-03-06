/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 11:00:44 GMT 2017
 */

package collections.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.NotNullPredicate;
import collections.functors.UniquePredicate;
import collections.iterators.FilterIterator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      linkedList0.add("X:");
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator(iterator0, notNullPredicate0);
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
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      FilterIterator filterIterator0 = new FilterIterator((Iterator) null, notNullPredicate0);
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
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      linkedList0.add((Object) null);
      FilterIterator filterIterator0 = new FilterIterator(listIterator0);
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
      FilterIterator filterIterator0 = new FilterIterator();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.iterator();
      filterIterator0.setIterator(iterator0);
      linkedList0.add("");
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      linkedList0.addLast(integer0);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      Object object0 = filterIterator0.next();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
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
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, (Predicate) null);
      boolean boolean0 = filterIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      filterIterator0.setPredicate(predicate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0, (Predicate) null);
      Iterator iterator0 = filterIterator0.getIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0);
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
  public void test13()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      Predicate predicate1 = filterIterator0.getPredicate();
      assertSame(predicate0, predicate1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
