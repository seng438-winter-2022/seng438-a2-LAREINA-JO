package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities; 
import org.junit.*;

public class createNumberArray2DTest {
    private DataUtilities exampledatautilities;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception {
    }
    


    @Test
    public void inputDouble2DIsEmpty() {
        double[][] inputDouble2DArray = {};
        Number[][] actualArray = exampledatautilities.createNumberArray2D(inputDouble2DArray);
        assertEquals("This array should be empty.", 0, actualArray.length);
    }
    
    @Test
    public void inputDouble2DIsNull() {
    	try {
            Number[][] actualArray = DataUtilities.createNumberArray2D(null);
			fail("Cannot pass null as a paramter");
		}
		catch(Exception e) {
			assertEquals("Null does not throw "
					+ "an InvalidParameterException",InvalidParameterException.class,e.getClass());
		}
    }
    
    @Test
    public void inputDouble2DIsNotEmpty() {
    	double[][] inputDoubleArray = {{1.2, 3.4}, {5.6, 7.8}, {9.0, 8.7}};
    	Number[][] actualArray = exampledatautilities.createNumberArray2D(inputDoubleArray);
    	Number[][] expectArray = {{1.2, 3.4}, {5.6, 7.8}, {9.0, 8.7}};
    	assertEquals("The first number of array is 1.2", expectArray[0][0], actualArray[0][0]);
		assertEquals("The second number of array is 3.4", expectArray[0][1], actualArray[0][1]);
		assertEquals("The third number of array is 5.6", expectArray[1][0], actualArray[1][0]);
		assertEquals("The fourth number of array is 7.8", expectArray[1][1], actualArray[1][1]);
		assertEquals("The fifth number of array is 9.0", expectArray[2][0], actualArray[2][0]);
		assertEquals("The fifth number of array is 8.7", expectArray[2][1], actualArray[2][1]);
    }
    
    

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
