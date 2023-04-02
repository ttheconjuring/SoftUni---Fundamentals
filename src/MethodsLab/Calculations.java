package MethodsLab;

import java.util.Scanner;

public class Calculations {

    public static void add(int n, int m) {
        System.out.println(n + m);
    }

    public static void subtract(int n, int m) {
        System.out.println(n - m);
    }

    public static void multiply(int n, int m) {
        System.out.println(n * m);
    }

    public static void divide(int n, int m) {
        System.out.println(n / m);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operator = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        switch (operator) {
            case "add":
                add(n, m);
                break;
            case "subtract":
                subtract(n, m);
                break;
            case "multiply":
                multiply(n, m);
                break;
            case "divide":
                divide(n, m);
                break;
            default:
                System.out.println("error");
        }

        sc.close();
    }

}
