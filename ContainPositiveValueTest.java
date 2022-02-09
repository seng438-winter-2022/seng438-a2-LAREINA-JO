//This test will follow the black box testing

package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class ContainPositiveValueTest { 
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
@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 