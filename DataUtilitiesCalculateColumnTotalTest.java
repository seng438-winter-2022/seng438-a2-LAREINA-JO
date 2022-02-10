package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.*;


public class DataUtilitiesCalculateColumnTotalTest {
	
    private Mockery mockingContext1 = new Mockery();
    private Values2D values1 = mockingContext1.mock(Values2D.class);
    
	 @Before
	 public void setUpForcalculateColumnTotal() throws Exception{
	     mockingContext1.checking(new Expectations() {
	         {
	             allowing(values1).getRowCount();
	             will(returnValue(3));
	             allowing(values1).getValue(0, 0);
	             will(returnValue(7.5));
	             allowing(values1).getValue(1, 0);
	             will(returnValue(2.5));
	             allowing(values1).getValue(2, 0);
	             will(returnValue(5.0));
	             
	             allowing(values1).getValue(0, 5);
	             will(returnValue(8.8));
	             allowing(values1).getValue(1, 5);
	             will(returnValue(8.8));
	             allowing(values1).getValue(2, 5);
	             will(returnValue(8.8));
	             
	             allowing(values1).getValue(with(any(Integer.class)), with(-1));
	             will(throwException(new IndexOutOfBoundsException()));
	             allowing(values1).getValue(with(-1), with(any(Integer.class)));
	             will(throwException(new IndexOutOfBoundsException()));
	         }
	     });
	 }
	 
	 //Test of null Value2D argument
	 @Test(expected = IllegalArgumentException.class)
	 public void testNullValue2DForcalculateColumnTotal() {
	     DataUtilities.calculateColumnTotal(null, 0);
	 }
	 
	//Tests of positive, zero, and negative column number
	 @Test
	 public void testZeroValueForcalculateColumnTotal() {
	     double result = DataUtilities.calculateColumnTotal(values1, 0);
	     assertEquals(15.0, result, .000000001d);
	 }
	 @Test
	 public void testPositiveValueForcalculateColumnTotal() {
	     double result = DataUtilities.calculateColumnTotal(values1, 5);
	     assertEquals(26.4, result, .000000001d);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testNegativeValueForcalculateColumnTotal() {
	     DataUtilities.calculateColumnTotal(values1, -1);
	 }
}
