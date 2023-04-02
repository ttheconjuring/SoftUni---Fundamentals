package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        char ch;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            ch = sc.nextLine().charAt(0);
            sum += ch;
        }

        System.out.println("The sum equals: " + sum);

        sc.close();
    }

}
