package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities; 
import org.jfree.data.KeyedValues;
import org.junit.*;
import org.jmock.Expectations;
import org.jmock.Mockery;

public class getCumulativePercentagesTest {
	private KeyedValues value1;
	private KeyedValues value2;

    @Before
    public void getCumulativePercentagesTestPositiveSetUp() throws Exception {
    	Mockery mockingContext1 = new Mockery();
    	value1 = mockingContext1.mock(KeyedValues.class);
    	mockingContext1.checking(new Expectations() {{
    		atLeast(1).of(value1).getItemCount();
			will(returnValue(3));
			
    		atLeast(1).of(value1).getKey(0);
    		will(returnValue(0));
    		atLeast(1).of(value1).getKey(1);
    		will(returnValue(1));
    		atLeast(1).of(value1).getKey(2);
    		will(returnValue(2));
    		
    		atLeast(1).of(value1).getValue(0);
			will(returnValue(3));
			atLeast(1).of(value1).getValue(1);
			will(returnValue(4));
    		atLeast(1).of(value1).getValue(2);
			will(returnValue(5));
    	}});    	
    }
    
    @Before
	public void getCumilativePercentageTestPosAndNegSetup() {
		Mockery mockingContext2 = new Mockery(); 
		value2 = mockingContext2.mock(KeyedValues.class);
		mockingContext2.checking(new Expectations() {{
			atLeast(1).of(value2).getItemCount();
			will(returnValue(3));
			
    		atLeast(1).of(value2).getKey(0);
    		will(returnValue(0));
    		atLeast(1).of(value2).getKey(1);
    		will(returnValue(1));
    		atLeast(1).of(value2).getKey(2);
    		will(returnValue(2));
    		
    		atLeast(1).of(value2).getValue(0);
			will(returnValue(2));
			atLeast(1).of(value2).getValue(1);
			will(returnValue(-3));
    		atLeast(1).of(value2).getValue(2);
			will(returnValue(6));
		}});
    }
    
    @Test
	public void getCumulativePercentageTestNull() {
		try {
			DataUtilities.getCumulativePercentages(null);
			fail("Null can't be a variable");
		}catch(Exception e) {
			assertTrue("Null is allowed to be an argument", true);
		}
	}
    
    @Test
	public void getCumulativePercentageTestPositive() {
    	assertEquals("The value should be 0.2500, 3/(3+4+5)", 0.2500, (double)DataUtilities.getCumulativePercentages(value1).getValue(0), .0001d);
    	assertEquals("The value should be 0.5833, (3+4)/(3+4+5)", 0.5833, (double)DataUtilities.getCumulativePercentages(value1).getValue(1), .0001d);
    	assertEquals("The value should be 1.0000, (3+4+5)/(3+4+5)", 1.0000, (double)DataUtilities.getCumulativePercentages(value1).getValue(2), .0001d);
    }
    
    @Test
	public void getCumulativePercentageTestPosAndNeg() {
    	assertEquals("The value should be 0.4000, 2/(2-3+6)", 0.4000, (double)DataUtilities.getCumulativePercentages(value2).getValue(0), .0001d);
    	assertEquals("The value should be -0.2000, (2-3)/(2-3+6)", -0.2000, (double)DataUtilities.getCumulativePercentages(value2).getValue(1), .0001d);
    	assertEquals("The value should be 1.0000, (2-3+6)/(2-3+6)", 1.0000, (double)DataUtilities.getCumulativePercentages(value2).getValue(2), .0001d);
    }
    
    
    
    
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
