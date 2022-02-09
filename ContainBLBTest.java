//This test will follow the black box testing, Equivalence Testing, boundry test, Robustness Testing
//The test will success if the range doesn't include BLB value

package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class ContainBLBTest { 
private Range exampleRange; 
@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-1, 5); 
} 
 
 
@Test 
public void containedBLBValue() { 
assertFalse("-2 should not be contained", exampleRange.contains(-2)); 
} 
@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 