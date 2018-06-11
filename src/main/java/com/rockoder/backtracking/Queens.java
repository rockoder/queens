package com.rockoder.backtracking;

import java.util.HashSet;
import java.util.Set;

public class Queens {

    private static int nSolutions = 0;

    /***************************************************************************
     * Return true if queen placement q[n] does not 'conflict' with
     * other queens q[0] through q[n-1]
     ***************************************************************************/
    private static boolean isConsistent(int[] q, int n) {
        Set<Double> slopes = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (q[i] == q[n])             return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
            if (!slopes.add((double) (q[i] - q[n]) / (i - n))) return false;  // 3 queens collinear
        }
        return true;
    }

    /***************************************************************************
     * Prints n-by-n placement of queens from permutation q in ASCII.
     ***************************************************************************/
    private static void printQueens(int[] q) {
        ++nSolutions;

        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == j) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /***************************************************************************
     *  Try all permutations using backtracking
     ***************************************************************************/
    public static void enumerate(int n) {
        nSolutions = 0;
        int[] a = new int[n];
        enumerate(a, 0);
    }

    private static void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isConsistent(q, k)) enumerate(q, k+1);
            }
        }
    }

    public static int getnSolutions() {
        return nSolutions;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please pass number of queens as argument.");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);
        if (n > 0)
            enumerate(n);
        System.out.println("Total number of solutions: " + nSolutions);
    }
}
