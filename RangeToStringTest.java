
package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class RangeToStringTest { 
private Range exampleRange;
private Range exampleRange1;
private Range exampleRange2;
private Range exampleRange3;

@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-5, 5); 
exampleRange1 = new Range(0, 0); 
exampleRange2 = new Range(5.0, 25.0); 
exampleRange3 = new Range(-25, -5); 
} 
 
 
@Test 
public void RangetoString() { 
assertEquals("Range[-5.0,5.0]", exampleRange.toString()); 
} 

@Test 
public void RangeZerotoString() { 
assertEquals("Range[0.0,0.0]", exampleRange1.toString()); 
} 

@Test 
public void PositiveRangetoString() { 
assertEquals("Range[5.0,25.0]", exampleRange2.toString()); 
} 

@Test 
public void NegativeRangetoString() { 
assertEquals("Range[-25.0,-5.0]", exampleRange3.toString()); 
}

@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 
