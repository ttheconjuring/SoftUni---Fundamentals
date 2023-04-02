package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);

        int startingIndex = Math.min(ch1, ch2);
        int endingIndex = Math.max(ch1, ch2);

        for (int i = startingIndex + 1; i < endingIndex; i++) {
            System.out.print((char) i + " ");
        }

        sc.close();
    }

}
