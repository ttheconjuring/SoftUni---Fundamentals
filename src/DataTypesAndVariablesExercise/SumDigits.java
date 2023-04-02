package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] array = input.toCharArray();
        int n = array.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(array[i]));
        }

        System.out.println(sum);

        sc.close();
    }

    }
