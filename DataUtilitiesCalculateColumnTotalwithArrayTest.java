package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.*;


public class DataUtilitiesCalculateColumnTotalwithArrayTest {
	
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
	 
	 //Test of null Value2D and regular array argument
	 @Test(expected = IllegalArgumentException.class)
	 public void testNullValue2DForcalculateColumnTotalwithArray() {
		 int[] arr= {0,1,2};
	     DataUtilities.calculateColumnTotal(null, 0, arr);
	 }
	 
	//Tests of positive, zero, and negative column number and regular array argument
	 @Test
	 public void testZeroValueForcalculateColumnTotalwithRegularArray() {
		 int[] arr= {0,1,2};
	     double result = DataUtilities.calculateColumnTotal(values1, 0, arr);
	     assertEquals(15.0, result, .000000001d);
	 }
	 @Test
	 public void testPositiveValueForcalculateColumnTotalwithRegularArray() {
		 int[] arr= {0,1,2};
	     double result = DataUtilities.calculateColumnTotal(values1, 5, arr);
	     assertEquals(26.4, result, .000000001d);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testNegativeValueForcalculateColumnTotalwithRegularArray() {
		 int[] arr= {0,1,2};
	     DataUtilities.calculateColumnTotal(values1, -1, arr);
	 }
	 
	//Tests of positive, zero, and negative column number and zero array argument
	 @Test
	 public void testZeroValueForcalculateColumnTotalwithZeroArray() {
		 int[] arr= {0};
	     double result = DataUtilities.calculateColumnTotal(values1, 0, arr);
	     assertEquals(7.5, result, .000000001d);
	 }
	 @Test
	 public void testPostiveValueForcalculateColumnTotalwithZeroArray() {
		 int[] arr= {0};
	     double result = DataUtilities.calculateColumnTotal(values1, 5, arr);
	     assertEquals(8.8, result, .000000001d);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testNegativeValueForcalculateColumnTotalwithZeroArray() {
		 int[] arr= {0};
	     DataUtilities.calculateColumnTotal(values1, -1, arr);
	 }
	 
	//Tests of positive, zero, and negative column number and negative array argument
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testPositiveValueForcalculateColumnTotalwithNegativeArray() {
		 int[] arr= {-1};
	     DataUtilities.calculateColumnTotal(values1, 5, arr);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testNegativeValueForcalculateColumnTotalwithNegativeArray() {
		 int[] arr= {-1};
	     DataUtilities.calculateColumnTotal(values1, -1, arr);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testZeroValueForcalculateColumnTotalwithNegativeArray() {
		 int[] arr= {-1};
	     DataUtilities.calculateColumnTotal(values1, 0, arr);
	 }
	 
	//Tests of positive, zero, and negative column number and duplicated value array argument
	 @Test
	 public void testZeroValueForcalculateColumnTotalwithDuplicateArray() {
		 int[] arr= {0,0,0};
	     double result = DataUtilities.calculateColumnTotal(values1, 0, arr);
	     assertEquals(7.5, result, .000000001d);
	 }
	 @Test
	 public void testPostiveValueForcalculateColumnTotalwithDuplicateArray() {
		 int[] arr= {0,0,0};
	     double result = DataUtilities.calculateColumnTotal(values1, 5, arr);
	     assertEquals(8.8, result, .000000001d);
	 }
	 @Test(expected = IndexOutOfBoundsException.class)
	 public void testNegativeValueForcalculateColumnTotalwithDuplicateArray() {
		 int[] arr= {0,0,0};
	     DataUtilities.calculateColumnTotal(values1, -1, arr);
	 }
	 

}
