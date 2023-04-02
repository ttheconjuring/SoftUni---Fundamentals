package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static double divide(int a, int b) {
        return a * 1.0 / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());

        switch (operator) {
            case "+":
                add(a, b);
                break;
            case "-":
                subtract(a, b);
                break;
            case "*":
                multiply(a, b);
                break;
            case "/":
                DecimalFormat df = new DecimalFormat("0.####");
                System.out.println(df.format(divide(a, b)));
                break;
            default:
                System.out.println("error");
        }

        sc.close();
    }

}
