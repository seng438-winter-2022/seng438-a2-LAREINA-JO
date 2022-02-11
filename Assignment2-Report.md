**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  9  |
| -------------- | --- |
| Student Names: | Brian Chen  |
|                | Zheng Chen  |
|                | Rui Guan    |
|                | Weitao Wu   |

# 1 Introduction

This assignment aims to test our capability to apply the methods to do the black box testing. We are required to write the code to test two classes: Range and DataUltilites. Plus, we are also asked to apply some other testing methods, such as, equivalence test, boundry test, robustness test, etc. For DataUtilites class, JMock techniques are needed in the tests whose arguments is interface. 

# 2 Detailed description of unit test strategy

In this assignment, black box testing is the basic technique and the main focus. Black box testing is to test the performance of the application without viewing the actual code. Then, the equivalence class testing helps us divide the inputs into two portions: expected inputs and unexpected inputs. We can test these two portions to find the correctness of the method we test. Next, applying the boundry value test on some cases can help check if any mistakes happen at or near the boundry values. At last, applying the robustness test to check the out-of-bound values will help find out the errors. 

For getter methods:
We divide equivalence class by Range object's upper and lower bound. Zero value will be considered as well. For example, {-5,5}, {-5,0}, and {-5,-5} belong to three equivalence class correspondingly.

For methods in DataUtilities class:
We shall read the documentary of those methods and specify their legal and illegal arguments. We shall design cases with the combination of legal and illegal arguments. For example, row and column numbers can only be zero or positive numbers.

# 3 Test cases developed

Methods to be tested in org.jfree.data.Range: 

contains(double value): No failure found. 
Black box testing: equivalence class testing, robustness testing, boundry testing
First applying the black box testing and equivalence class testing to test if the method can result the correct value within the range, then apply the boundry test to test if the method can result the correct boundry values. 

toString(): No failure found. 
Black box testing: equivalence testing
Since the toString() method only result a string which represents the correct range, apply the black box and equivalence testing can test if the method can result the correct string.

getUpperBound(): No failure found
Black box testing, equivalence class testing, boundry testing
The test cases of postive, zero, and negative upperbound value are tested. Then the the same upper bound value with lower bound is tested.

getLowerBound(): No Failure found
Black box testing, equivalence class testing
The test cases of postive, zero, and negative lowerbound value are tested.

getLength(): Failure found
Black box testing, equivalence class testing, boundry testing
The test cases of postive, zero, and negative upperbound value are tested. Results showed that lengthShouldBeZero() has failure when the both inputs are the same and negative.



Methods to be tested in org.jfree.data.DataUtilities: 

calculateRowTotal(Values2D data, int row): No failure found.
Black box testing: equivalence testing 
First applying the black box and equivalence testing to check if the result for two row is correct, then check if the result of two positive/negative values is correct. At last, check if the result for more rows is correct.

calculateColumnTotal(Values2D data, int column): No failure found.
Black box testing, equivalence class testing, boundry testing
First, all the legal arguments combinations are tested and all test passed. The illegal(out of bound) arguments are applied as well and we got the expected exceptions.

calculateColumnTotal(Values2D data, int column，int[] validRows): Failure found.
Black box testing: equivalence class testing, boundry testing
First, all the legal arguments combinations are tested and all test passed. The illegal(out of bound) arguments are applied as well and we got the expected exceptions. At the last, when the array has duplicated values such as {0,0,0}, the method added up 0 row 3 times which is specified as a failure.

createNumberArray(double[]): Failure found.
Black box testing: equivalence class testing, boundry testing
First applying the equivalence testing to check if the input double array is empty, then check if the input double array is null is correct. The failure was found here. It should throw an "InvalidParameterException" instead of an illegalArgumentException. At last, check if the input double array is a normal array is correct.

createNumberArray2D(double[][]): Failure found.
Black box testing: equivalence class testing, boundry testing
First applying the equivalence testing to check if the input double 2D array is empty, then check if the input double 2D array is null is correct. The failure was found here. It should throw an "InvalidParameterException" instead of an illegalArgumentException. At last, check if the input double 2D array is a normal array is correct.


getCumulativePercentages(KeyedValues): No failure found.
Black box testing: equivalence class testing.
Jmock is used in this part. First setup the mocking for the keys, values and expected percentages. Then, applying the equivalence testing to check if the values are null is correct, then check if the values are positive is correct. At last, check if the values are mixed positive and negative is correct.


// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Brian Chen: getLowerBound(), getLength()

Zheng Chen: getUpperBound(), calculateColumnTotal(Values2D data, int column)， calculateColumnTotal(Values2D data, int column，int[] validRows)

Rui Guan: createNumberArray(double[]), createNumberArray2D(double[][]), getCumulativePercentages(KeyedValues)

Weitao Wu: contains(double value), toString(), calculateRowTotal(Values2D data, int row)



# 5 Difficulties encountered, challenges overcome, and lessons learned
The jmock workspace environment setup, its reference library, and jmock coding are the difficulties we encountered during the lab. The Jmock document helps a lot to provide mocking manual. The Jmock example from the assignment outline gave us a simple sructure to keep working on it.
This lab brings exercises on test case desgin, junit, and jmock which we can carry further in the course.


# 6 Comments/feedback on the lab itself
The library resource provided from github classroom missed a hamcrest-all-1.3.jar which is necessary to run jmock. In addition, giving a jomck tutorial and document website in the assignment outline will be more helpful.
