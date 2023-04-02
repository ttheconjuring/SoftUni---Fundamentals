package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("" + alphabet.charAt(i) + alphabet.charAt(j)+ alphabet.charAt(k));
                }
            }
        }

        sc.close();
    }

}
