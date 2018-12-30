/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 09:22:13 GMT 2017
 */

package collections.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.comparators.FixedOrderComparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FixedOrderComparator_ESTest extends FixedOrderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare("){h<j*_IIj-ImDvV", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object ){h<j*_IIj-ImDvV
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(1826);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.checkLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(linkedList0, (Object) null);
      boolean boolean0 = fixedOrderComparator0.isLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare((Object) null, (Object) null);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.checkLocked();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Object object0 = new Object();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(object0, linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.add("^8&L;5");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      boolean boolean0 = fixedOrderComparator0.add(objectArray0[0]);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.isLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      int int0 = fixedOrderComparator0.compare(fixedOrderComparator0.UNKNOWN_THROW_EXCEPTION, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      int int0 = fixedOrderComparator0.compare(object0, (Object) null);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      int int0 = fixedOrderComparator0.compare((Object) null, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.compare(objectArray0[0], object0);
      assertTrue(fixedOrderComparator0.isLocked());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(object0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      boolean boolean0 = fixedOrderComparator0.add(object0);
      Object object1 = new Object();
      boolean boolean1 = fixedOrderComparator0.addAsEqual(object0, object1);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(linkedList0, ") 2uBTC)B2A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [] not known to collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      boolean boolean0 = fixedOrderComparator0.add(object0);
      boolean boolean1 = fixedOrderComparator0.addAsEqual(object0, object0);
      assertFalse(boolean1 == boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior((-1034));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(2);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      linkedList0.add((Object) integer0);
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((List) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(linkedList0, (Object) null);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      fixedOrderComparator0.compare(fixedOrderComparator0.UNKNOWN_BEFORE, objectArray0[2]);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(objectArray0[2], "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      Object object0 = new Object();
      fixedOrderComparator0.add(object0);
      int int0 = fixedOrderComparator0.compare(object0, (Object) null);
      assertEquals(0, fixedOrderComparator0.getUnknownObjectBehavior());
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(2, int0);
      assertFalse(fixedOrderComparator0.isLocked());
  }
}
