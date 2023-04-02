package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        int explosionStrength = 0;

        for (int i = 0; i < sb.length(); i++) {
            char currentCharacter = sb.charAt(i);
            if (currentCharacter == '>') {
                explosionStrength += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            } else {
                if (explosionStrength > 0) {
                    sb.deleteCharAt(i);
                    explosionStrength--;
                    i--;
                }
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }

}
