**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |  9  |
| -------------- | --- |
| Student Names: | Brian Chen  |
|                | Zheng Chen  |
|                | Rui Guan    |
|                | Weitao Wu   |

# 1 Introduction

Text…

# 2 Detailed description of unit test strategy

// including the input partitions you have designed

# 3 Test cases developed

Methods to be tested in org.jfree.data.Range: 
contains(double value):
balck box testing, equivalence class testing, robustness testing, boundry testing

First applying the black box testing and equivalence class testing to test if the method can result the correct value within the range, then apply the boundry test to test if the method can result the correct boundry values.

toString():
black box testing and equivalence testing

Since the toString() method only result a string which represents the correct range, apply the black box and equivalence testing can test if the method can result the correct string.

getCentralValue()   
getLength()
constrain()

Methods to be tested in org.jfree.data.DataUtilities: 
calculateRowTotal()
calculateColumnTotal(Values2D data, int column)


// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Brian Chen: getLength(), constrain()

Zheng Chen: getCentralValue(), calculateColumnTotal(Values2D data, int column)

Rui Guan:

Weitao Wu: contains(double value), toString(), calculateRowTotal()

(If necessary)
As a Group:


# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
