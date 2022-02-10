**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  9  |
| -------------- | --- |
| Student Names: | Brian Chen  |
|                | Zheng Chen  |
|                | Rui Guan    |
|                | Weitao Wu   |

# 1 Introduction

This assignment aims to test our capability to apply the methods to do the black box testing. We are required to write the code to test two classes: Range and DataUltilites. Plus, we are also asked to apply some other testing methods, such as, equivalence test, boundry test, robustness test, etc. JMock techniques are needed to be included in the tests for DataUtilites class.

# 2 Detailed description of unit test strategy

In this assignment, black box testing is the basic technique and the main focus. Black box testing is to test the performance of the application without viewing the actual code. Then, the equivalence class testing helps us divide the inputs into two portions: expected inputs and unexpected inputs. We can test these two portions to find the correctness of the method we test. Next, applying the boundry value test on some cases can help check if any mistakes happen at or near the boundry values. At last, applying the robustness test to check the out-of-bound values will help find out the errors. 

// including the input partitions you have designed

# 3 Test cases developed

Methods to be tested in org.jfree.data.Range: 

contains(double value): No errors. 
Black box testing, equivalence class testing, robustness testing, boundry testing
First applying the black box testing and equivalence class testing to test if the method can result the correct value within the range, then apply the boundry test to test if the method can result the correct boundry values. 

toString(): No errors. a
black box testing and equivalence testing
Since the toString() method only result a string which represents the correct range, apply the black box and equivalence testing can test if the method can result the correct string.

getUpperBound():

getLowerBound(): Results showed that the getLowerBound() correctly returned the lower bound value of the range

getLength(): Results shouwed that the getLength() meethod correctly returned the length of the range




Methods to be tested in org.jfree.data.DataUtilities: 

calculateRowTotal(Values2D data, int row): No errors.
black box testing, equivalence testing 
First applying the black box and equivalence testing to check if the result for two row is correct, then check if the result of two positive/negative values is correct. At last, check if the result for more rows is correct.

calculateColumnTotal(Values2D data, int column):

calculateColumnTotal(Values2D data, int column，int[] validRows):

createNumberArray(double[]):

getCumulativePercentages(KeyedValues):


// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Brian Chen: getLowerBound(), getLength()

Zheng Chen: getUpperBound(), calculateColumnTotal(Values2D data, int column)， calculateColumnTotal(Values2D data, int column，int[] validRows)

Rui Guan: createNumberArray(double[]), createNumberArray2D(double[][]), getCumulativePercentages(KeyedValues)

Weitao Wu: contains(double value), toString(), calculateRowTotal(Values2D data, int row)

(If necessary)
As a Group:


# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
