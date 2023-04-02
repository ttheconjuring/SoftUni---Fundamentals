package TextProcessingMoreExercises;

import java.util.Scanner;

public class AsciiSumator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstCharacter = sc.nextLine().charAt(0);
        char secondCharacter = sc.nextLine().charAt(0);
        String input = sc.nextLine();

        int sum = 0;

        for (char currentCharacter : input.toCharArray()) {
            for (int i = firstCharacter + 1; i < secondCharacter; i++) {
                if (currentCharacter == i) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }

}


