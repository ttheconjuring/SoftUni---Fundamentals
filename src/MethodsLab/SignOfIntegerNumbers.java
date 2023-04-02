package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {

    public static void printTheSign(int n) {
        if (n > 0) {
            System.out.println("The number " + n + " is positive.");
        } else if (n < 0) {
            System.out.println("The number " + n + " is negative.");
        } else {
            System.out.println("The number 0 is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printTheSign(n);

        sc.close();
    }

}
