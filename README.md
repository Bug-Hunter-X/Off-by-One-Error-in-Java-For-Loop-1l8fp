# Off-by-One Error in Java For Loop

This repository demonstrates a common off-by-one error in a Java for loop and provides a corrected version.

The original code contains a subtle error in its loop condition, resulting in a potential logic error that can be difficult to debug.

The corrected code showcases a simple fix to address this issue, ensuring accurate loop execution.

## Bug Description
The `BuggyForLoop.java` file contains a for loop that unintentionally stops before executing the intended number of iterations. This is a classic off-by-one error, potentially leading to unexpected program behavior, especially when the loop is used for numerical computation or string manipulation.

## Solution
The `CorrectedForLoop.java` file provides a corrected version of the for loop, fixing the off-by-one error to ensure the code accurately performs its intended task.