package MethodsMoreExercises;

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        if (isZero(a) || isZero(b) || isZero(c)) {
            System.out.println("zero");
        }
        if (isNegative(a) && isNegative(b) && isNegative(c)) {
            System.out.println("negative");
        }
        if (isPositive(a) && isPositive(b) && isPositive(c)) {
            System.out.println("positive");
        }

        if ((isNegative(a) && isNegative(b) && isPositive(c)) ||
                (isNegative(a) && isNegative(c) && isPositive(b)) ||
                (isNegative(b) && isNegative(c) && isPositive(a))) {
            System.out.println("positive");
        } else if ((isPositive(a) && isPositive(b) && isNegative(c)) ||
                (isPositive(a) && isPositive(c) && isNegative(b)) ||
                (isPositive(b) && isPositive(c) && isNegative(a))) {
            System.out.println("negative");
        }

        sc.close();
    }

    public static boolean isNegative(int n) {
        return n < 0;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isZero(int n) {
        return n == 0;
    }

}


