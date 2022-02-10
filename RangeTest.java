package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { exampleRange = new Range(-5, 5);
    }


    @Test
    public void lengthShouldBeTen() {
        assertEquals("The length of -5 and 5 should be 10", 
        		10, exampleRange.getLength(), .000000001d);
    }
    
    @Test
    public void lengthShouldNotBeZero() {
        assertNotEquals("The length of -5 and 5 should not be 0", 
        		0, exampleRange.getLength(), .000000001d);
    }
    
    @Test
    public void lengthShouldNotBeLetter() {
        assertNotEquals("The length of -5 and 5 should not be K", 
        		'K', exampleRange.getLength(), .000000001d);
    }
    
	@Test
    public void lowerBoundShouldBeMinusFive() {
        assertEquals("The lower bound value of -5 and 5 should be -5", 
        		-5, exampleRange.getLowerBound(), .000000001d);
    }
    
    @Test
    public void lowerBoundShouldNotBeFive() {
        assertNotEquals("The lower bound value of -5 and 5 should not be 5", 
        		5, exampleRange.getLowerBound(), .000000001d);
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}