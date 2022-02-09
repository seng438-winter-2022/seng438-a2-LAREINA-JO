
package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class RangeToStringTest { 
private Range exampleRange; 
@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-5, 5); 
} 
 
 
@Test 
public void RangetoString() { 
assertEquals("Range[-5.0,5.0]", exampleRange.toString()); 
} 
@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 
