package TextProcessingMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String key = sc.nextLine();
        int[] currentKey = Arrays.stream(key.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = currentKey.length;

        String input = sc.nextLine();

        while (!input.equals("find")) {
            int i = 0;
            StringBuilder sb = new StringBuilder();
            for (char currentCharacter : input.toCharArray()) {
                if (i == n) {
                    i = 0;
                }
                currentCharacter -= currentKey[i];
                sb.append(currentCharacter);
                i++;
            }
            String treasureType = sb.substring(sb.indexOf("&") + 1, sb.lastIndexOf("&"));
            String treasureCoordinates = sb.substring(sb.indexOf("<") + 1, sb.indexOf(">"));
            System.out.printf("Found %s at %s%n", treasureType, treasureCoordinates);
            input = sc.nextLine();
        }

        sc.close();
    }

}
