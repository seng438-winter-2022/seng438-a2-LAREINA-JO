package org.jfree.data.test;

import org.jmock.Mockery;
import org.jmock.Expectations;
import static org.junit.Assert.*;


import org.junit.Test;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.junit.*; 

 public class DataUtilitiesCalculateRowTotalForTwoZeroValueTest { 
	 @Test
	 public void calculateRowTotalForFourValues() {
	     // setup
	     Mockery mockingContext = new Mockery();
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	        	 one(values).getColumnCount();
	             will(returnValue(2));
	          
	             one(values).getValue(0, 0);
	             will(returnValue(0));
	             one(values).getValue(0, 1);
	             will(returnValue(0));
	             
	         }
	     });
	     // exercise	
	     double result = DataUtilities.calculateRowTotal(values, 0);
	     // verify
	     assertEquals(0, result, .000000001d);
	     // tear-down: NONE in this test method
	 }
 } 
