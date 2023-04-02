package MethodsMoreExercises;

import java.util.Scanner;

public class TribonacciSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printTribonacci(n);

        sc.close();
    }

    public static int printTribonacciRec(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n == 3) {
            return 2;
        }
        return dp[n] = printTribonacciRec(n - 1, dp) + printTribonacciRec(n - 2, dp) + printTribonacciRec(n - 3, dp);
    }

    public static void printTribonacci(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(printTribonacciRec(i, dp) + " ");
        }
    }

}
