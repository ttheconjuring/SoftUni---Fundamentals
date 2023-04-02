package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static int getSumOfEvens(String num) {
        int n = num.length();
        int sumOfEvens = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (current % 2 == 0) {
                sumOfEvens += current;
            }
        }
        return sumOfEvens;
    }

    public static int getSumOfOdds(String num) {
        int n = num.length();
        int sumOfOdds = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (current % 2 != 0) {
                sumOfOdds += current;
            }
        }
        return sumOfOdds;
    }

    public static void printResult(String num) {
        System.out.println(getSumOfEvens(num) * getSumOfOdds(num));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int n = Integer.parseInt(num);
        if (n > 0) {
            printResult(num);
        } else if (n < 0) {
            num = num.substring(1);
            printResult(num);
        } else {
            System.out.println(0);
        }

    }

}
