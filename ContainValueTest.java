//This test will follow the black box testing

package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class ContainValueTest { 
private Range exampleRange; 
@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-1, 5); 
} 
 
 
@Test 
public void containedPositivelValueShouldBeOne() { 
assertTrue("The contained positive value should be 1", exampleRange.contains(1)); 
} 

@Test 
public void containedNegativelValueShouldBeNegativeOne() { 
assertTrue("The contained negative value should be -1", exampleRange.contains(-1)); 
} 

@Test 
public void containedALBBlValueShouldBeZero() { 
assertTrue("The contained ALB value should be 0", exampleRange.contains(0)); 
}

@Test 
public void containedAUBValue() { 
assertFalse("6 should not be contained", exampleRange.contains(6)); 
}

@Test 
public void containedBLBValue() { 
assertFalse("-2 should not be contained", exampleRange.contains(-2)); 
}

@Test 
public void containedBUBlValueShouldBeFour() { 
assertTrue("The contained BUB value should be 4", exampleRange.contains(4)); 
} 

@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 