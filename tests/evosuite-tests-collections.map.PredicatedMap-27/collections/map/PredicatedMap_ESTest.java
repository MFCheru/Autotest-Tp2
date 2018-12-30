/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 30 11:15:07 GMT 2017
 */

package collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.AllPredicate;
import collections.functors.InstanceofPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.functors.UniquePredicate;
import collections.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Predicate predicate0 = NotNullPredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, predicate0);
      Object object0 = predicatedMap0.put("gi", hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, hashMap0);
      predicatedMap0.put(object0, (Object) null);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      Map map0 = PredicatedMap.decorate(hashMap0, uniquePredicate0, uniquePredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, uniquePredicate0, uniquePredicate0);
      hashMap0.put("[%GaCN&0I.nh*;", "[%GaCN&0I.nh*;");
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(map0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Object object0 = hashMap0.computeIfPresent(predicatedMap0, biFunction0);
      predicatedMap0.put(hashMap0, object0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate0, predicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer((-3671));
      Object object0 = new Object();
      predicatedMap0.put(object0, integer0);
      Predicate[] predicateArray0 = new Predicate[2];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Class<Integer> class0 = Integer.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, (Predicate) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Predicate[] predicateArray0 = new Predicate[3];
      Predicate predicate0 = TruePredicate.getInstance();
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      predicateArray0[2] = (Predicate) allPredicate0;
      Integer integer0 = new Integer((-1194));
      hashMap0.put(integer0, "J_cUu@Ou\"s%^");
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, truePredicate0, truePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", "");
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Class<Integer> class0 = Integer.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate0, predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
      predicatedMap0.putIfAbsent(hashMap0, "Cannot set value - Predicate rejected it");
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
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
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.putAll(predicatedMap0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, notNullPredicate0, notNullPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
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
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Integer integer0 = new Integer((-3671));
      Object object0 = predicatedMap0.checkSetValue(integer0);
      assertEquals((-3671), object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate("Cannot set value - Predicate rejected it", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, predicate0, predicate0);
      Predicate predicate1 = UniquePredicate.getInstance();
      Map map1 = PredicatedMap.decorate(predicatedMap0, predicate1, predicate1);
      PredicatedMap predicatedMap1 = new PredicatedMap(map1, predicate1, predicate1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap1.put(object0, "k`s `E]C]BQsM]4ux");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      predicatedMap0.validate((Object) null, hashMap0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      BiFunction<Object, Integer, String> biFunction0 = (BiFunction<Object, Integer, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , anyInt());
      Object object0 = predicatedMap0.compute(truePredicate0, biFunction0);
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, object0);
      Map map0 = PredicatedMap.decorate(predicatedMap0, truePredicate0, truePredicate0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      BiFunction<Object, Integer, String> biFunction0 = (BiFunction<Object, Integer, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , anyInt());
      Object object0 = predicatedMap0.compute(truePredicate0, biFunction0);
      predicatedMap0.put(hashMap0, object0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicatedMap0, (Object) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
