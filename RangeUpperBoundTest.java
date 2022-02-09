package org.jfree.data.test;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;

public class RangeUpperBoundTest {
	
    private Range exampleRange1;
    private Range exampleRange2;
    private Range exampleRange3;
    @Before
    public void setUp() throws Exception { 
    	exampleRange1 = new Range(-10, 10);
    	exampleRange2 = new Range(-10, 0);
    	exampleRange3 = new Range(-10, -10);
    }
    

    
    @Test
    public void UpperBoundPostiveValue() {
        assertEquals(10.0, exampleRange1.getUpperBound(), .000000001d);
    }
    @Test
    public void UpperBoundZeroValue() {
        assertEquals(0.0, exampleRange2.getUpperBound(), .000000001d);
    }
    @Test
    public void UpperBoundNegativeValue() {
        assertEquals(-10.0, exampleRange3.getUpperBound(), .000000001d);
    }
    
    /*
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }*/
}
