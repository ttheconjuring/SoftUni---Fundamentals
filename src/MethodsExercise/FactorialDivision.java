package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f", getFactorialOf(n1) * 1.0 / getFactorialOf(n2));

        sc.close();
    }

    public static long getFactorialOf(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
