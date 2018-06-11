# Problem Statement

1. Place N queens on an NxN chess board so that none of them attack each other (the classic n-queens problem).
1. Additionally, please make sure that no three queens are in a straight line at ANY angle, so queens on A1, C2 and E3, despite not attacking each other, form a straight line at some angle.

# Assumptions

1. Output will be displayed on console and no GUI will be provided.

# Implementation Details

1. N-Queens is a classic problem which can be solved using recursion and backtracing.
1. The current implementation extends the solution provided by Robert Sedgewick at his [course](https://introcs.cs.princeton.edu/java/23recursion/Queens.java.html).
1. Appropriate minimal changes are made to the implementation to introduce the additional non-collinear condition. To find collinearity, the program finds slope between the any two queens and check if there is a duplicate slope.
1. Few unit tests are added to test the solution with different inputs.
1. Due to the nature of the problem, focus is more on the algorithm than on the OO design principles. Hence many static functions can be found in the implementation. Program can be re-designed by following better design principles however this could dilute the focus from the underlying algorithm.
1. Program prints out all solutions on the console. Additionally, it prints the total number of solutions found.
1. As mentioned by the original implementation, this program implicitly enumerates all n^n possible placements (instead of n!), but the backtracing prunes off most of them, so it's not necessarily worth the extra complication of enumerating only permutations.

# Limitations

1. Works for n <= 15 in reasonable time on developer laptop, but slows down considerably for larger n.

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
