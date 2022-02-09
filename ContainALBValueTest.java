//This test will follow the black box testing, boundry test

package org.jfree.data.test;

import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.Range; 
import org.junit.*; 
 public class ContainALBValueTest { 
private Range exampleRange; 
@BeforeClass  public static void setUpBeforeClass() 
throws Exception { 
} 
 
 
@Before 
public void setUp() throws Exception { 
exampleRange = new Range(-1, 5); 
} 
 
 
@Test 
public void containedALBBlValueShouldBeZero() { 
assertTrue("The contained ALB value should be 0", exampleRange.contains(0)); 
} 
@After 
public void tearDown() throws Exception { 
} 
@AfterClass 
public static void tearDownAfterClass() throws Exception { 
} 
 } 
