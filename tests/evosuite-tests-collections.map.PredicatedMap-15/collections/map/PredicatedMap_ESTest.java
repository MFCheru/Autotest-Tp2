/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 08:50:43 GMT 2017
 */

package collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.AllPredicate;
import collections.functors.InstanceofPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.functors.UniquePredicate;
import collections.map.PredicatedMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate predicate0 = AllPredicate.getInstance((Collection) linkedList0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, predicate0);
      Object object0 = predicatedMap0.checkSetValue("Cannot add value - Predicate rejected it");
      assertEquals("Cannot add value - Predicate rejected it", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(1322);
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.put(integer0, integer0);
      predicatedMap0.put(integer0, predicatedMap0);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate((Class) null);
      Map map0 = PredicatedMap.decorate(hashMap0, instanceofPredicate0, instanceofPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, instanceofPredicate0, instanceofPredicate0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(integer0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.InstanceofPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, instanceofPredicate0, instanceofPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, instanceofPredicate0, instanceofPredicate0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(integer0, predicatedMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      Predicate[] predicateArray0 = new Predicate[5];
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      predicateArray0[4] = predicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, allPredicate0);
      Object object0 = new Object();
      predicatedMap0.put(predicatedMap0, object0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(predicatedMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      Map map0 = PredicatedMap.decorate(hashMap0, allPredicate0, allPredicate0);
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, allPredicate0, predicate0);
      hashMap0.put(map0, "59z[M/gwt*Txu<");
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Object object0 = new Object();
      hashMap0.put("~'CGAMZ", ":@[I");
      predicatedMap0.validate("~'CGAMZ", object0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
      predicatedMap0.put(predicatedMap0, notNullPredicate0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicatedMap0, integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, predicate0);
      hashMap0.put(map0, map0);
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate0, uniquePredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      hashMap0.put(object0, object0);
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      predicatedMap0.putIfAbsent(hashMap0, uniquePredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      Integer integer0 = new Integer(1);
      hashMap0.put(integer0, map0);
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(map0, (Predicate) null, uniquePredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("collections.functors.TruePredicate", (Object) null);
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, notNullPredicate0, notNullPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Object object0 = new Object();
      Integer integer0 = new Integer(1322);
      hashMap0.put(object0, integer0);
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.putAll(hashMap0);
      assertFalse(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot set value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      hashMap0.put(object0, object0);
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(1322);
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.put((Object) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = hashMap0.put("", "");
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      Object object1 = predicatedMap0.putIfAbsent(object0, (Object) null);
      assertNull(object1);
  }
}