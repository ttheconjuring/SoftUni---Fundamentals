package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(countTheVowels(input));

        sc.close();
    }

    public static int countTheVowels(String input) {
        int counter = 0;
        input = input.toLowerCase();
        for (Character ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        return counter;
    }


}
