/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 07:51:23 GMT 2017
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
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(objectArray0[1], object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(object1, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object@2485e8ec not known to collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(128);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.checkLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(object0, fixedOrderComparator0.UNKNOWN_THROW_EXCEPTION);
      boolean boolean0 = fixedOrderComparator0.isLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      Object object0 = new Object();
      fixedOrderComparator0.compare("&?#6M&", object0);
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
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      boolean boolean0 = fixedOrderComparator0.add(object0);
      assertFalse(boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.isLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(objectArray0[0], fixedOrderComparator0.UNKNOWN_BEFORE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object 0
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      Object object1 = new Object();
      objectArray0[1] = object1;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      int int0 = fixedOrderComparator0.compare(object0, object1);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      int int0 = fixedOrderComparator0.compare(objectArray0[1], fixedOrderComparator0.UNKNOWN_THROW_EXCEPTION);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.compare(fixedOrderComparator0.UNKNOWN_BEFORE, object0);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      Object object0 = new Object();
      fixedOrderComparator0.compare(object0, object0);
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
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.compare(object0, object0);
      assertTrue(fixedOrderComparator0.isLocked());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      boolean boolean0 = fixedOrderComparator0.add(object1);
      boolean boolean1 = fixedOrderComparator0.addAsEqual(object1, object0);
      assertTrue(boolean1 == boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      boolean boolean0 = fixedOrderComparator0.addAsEqual(object0, object0);
      assertFalse(boolean0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      assertFalse(fixedOrderComparator0.isLocked());
      
      fixedOrderComparator0.setUnknownObjectBehavior(2);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(objectArray0[0], fixedOrderComparator0.UNKNOWN_AFTER);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(fixedOrderComparator0.UNKNOWN_BEFORE, objectArray0[1]);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      Object object0 = new Object();
      fixedOrderComparator0.compare("U?jq+^:l{_r;vn", object0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.add((Object) null);
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
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(2, int0);
  }
}
