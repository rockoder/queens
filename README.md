# Problem Statement

1. Place N queens on an NxN chess board so that none of them attack each other (the classic n-queens problem).
1. Additionally, please make sure that no three queens are in a straight line at ANY angle, so queens on A1, C2 and E3, despite not attacking each other, form a straight line at some angle.

# Assumptions

1. Output will be displayed on console and no GUI will be provided.

# Implementation Details

1. N-Queens is a classic classic problem which can be solved using backtracking strategy.
1. The current implementation extends the solution provided by Robert Sedgewick at his [course](https://introcs.cs.princeton.edu/java/23recursion/Queens.java.html).
1. Appropriate minimal changes are made to the program to introduce the additional non-collinear condition.
1. Additionally, few unit tests are added to test the solution with different inputs.

# Build & Usage

1. Clone the repo: `git clone https://github.com/rockoder/queens.git`
1. `cd queens`
1. `./gradlew build`
1. To run pass the N queens as program argument. For ex: `./gradlew run -PappArgs=8`

# Sample Output

```
$ ./gradlew run -PappArgs=4

> Task :run
* Q * *
* * * Q
Q * * *
* * Q *

* * Q *
Q * * *
* * * Q
* Q * *

Total number of solutions: 2

BUILD SUCCESSFUL in 0s
2 actionable tasks: 1 executed, 1 up-to-date
```
