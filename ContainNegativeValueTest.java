//This test will follow the black box testing, boundry test

package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class ContainNegativeValueTest { 
private Range exampleRange; 
@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-1, 5); 
} 
 
 
@Test 
public void containedNegativelValueShouldBeNegativeOne() { 
assertTrue("The contained negative value should be -1", exampleRange.contains(-1)); 
} 
@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 