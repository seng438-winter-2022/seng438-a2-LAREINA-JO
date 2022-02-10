package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities; 
import org.junit.*;

public class createNumberArrayTest {
    private DataUtilities exampledatautilities;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception {
    }
    


    @Test
    public void inputDoubleIsEmpty() {
        double[] inputDoubleArray = {};
        Number[] actualArray = exampledatautilities.createNumberArray(inputDoubleArray);
        assertEquals("This array should be empty.", 0, actualArray.length);
    }
    
    @Test
    public void inputDoubleIsNull() {
    	try {
            Number[] actualArray = DataUtilities.createNumberArray(null);
			fail("Cannot pass null as a paramter");
		}
		catch(Exception e) {
			assertEquals("Null does not throw "
					+ "an InvalidParameterException",InvalidParameterException.class,e.getClass());
		}
    }
    
    @Test
    public void inputDoubleIsNotEmpty() {
    	double[] inputDoubleArray = {1.2, 3.4, 5.6, 7.8, 9.0};
    	Number[] actualArray = exampledatautilities.createNumberArray(inputDoubleArray);
    	Number[] expectArray = {1.2, 3.4, 5.6, 7.8, 9.0};
    	assertEquals("The first number of array is 1.2", expectArray[0], actualArray[0]);
		assertEquals("The second number of array is 3.4", expectArray[1], actualArray[1]);
		assertEquals("The third number of array is 5.6", expectArray[2], actualArray[2]);
		assertEquals("The fourth number of array is 7.8", expectArray[3], actualArray[3]);
		assertEquals("The fifth number of array is 9.0", expectArray[4], actualArray[4]);
    }
    
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
