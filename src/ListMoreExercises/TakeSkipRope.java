package ListMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = input.length();

        List<Integer> numbersList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(input.charAt(i))) {
                numbersList.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            } else {
                characterList.add(input.charAt(i));
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbersList.get(i));
            } else {
                skipList.add(numbersList.get(i));
            }
        }

        String decrypted = "";
        int skipCount = skipList.size();
        int takeCount = takeList.size();

        int iterations = 0;
        while (iterations < takeCount) {
            String currentTake = "";
            int takenCharacters = takeList.get(iterations);
            if (takenCharacters <= characterList.size()) {
                for (int i = 0; i < takenCharacters; i++) {
                    currentTake += String.valueOf(characterList.get(i));
                }
                decrypted += currentTake;
                int j = 0;
                while (j < takenCharacters) {
                    characterList.remove(0);
                    j++;
                }
            } else {
                for (int i = 0; i < characterList.size(); i++) {
                    currentTake += String.valueOf(characterList.get(i));
                }
                decrypted += currentTake;
                 int j = 0;
                while (j < characterList.size()) {
                    characterList.remove(0);
                    j++;
                }
                break;
            }
            int k = 0;
            int skippedCharacters = skipList.get(iterations);
            if (skippedCharacters <= characterList.size()) {
                while (k < skippedCharacters) {
                    characterList.remove(0);
                    k++;
                }
            } else {
                while (k < characterList.size()) {
                    characterList.remove(0);
                    k++;
                }
                break;
            }
            iterations++;
        }

        System.out.println(decrypted);

        sc.close();
    }

}

// 0 1 2 3
// s k i p
// 1 2 3 4
