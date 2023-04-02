package MethodsMoreExercises;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if(input.equals("int")) {
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(modify(n));
        } else if(input.equals("real")) {
            double n = Double.parseDouble(sc.nextLine());
            System.out.printf("%.2f", modify(n));
        } else if(input.equals("string")) {
            String str = sc.nextLine();
            System.out.println(modify(str));
        }

        sc.close();
    }

    public static int modify(int number) {
        return number * 2;
    }

    public static double modify(Double number) {
        return number * 1.5;
    }

    public static String modify(String input) {
        return "$" + input + "$";
    }

}
