package RegularExpressionsMoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArray = input.split("\\|");
        String firstPart = inputArray[0];
        String secondPart = inputArray[1];
        String thirdPart = inputArray[2];

        String firstPartRegex = "([#$%*&])[A-Z]+\\1";
        Pattern firstPartPattern = Pattern.compile(firstPartRegex);
        Matcher firstPartMatcher = firstPartPattern.matcher(firstPart);
        StringBuilder firstPartEssential = new StringBuilder();
        while (firstPartMatcher.find()) {
            firstPartEssential.append(firstPartMatcher.group(), 1, firstPartMatcher.group().length() - 1);
        }

        String secondPartRegex = "(6\\t*[5-9]|[78]\\t*\\d|9\\t*0)\\t*:\\t*([01]\\t*\\d|2\\t*0)";
        Pattern secondPartPattern = Pattern.compile(secondPartRegex);
        Matcher secondPartMatcher = secondPartPattern.matcher(secondPart.replaceAll("\\t", ""));
        StringBuilder secondPartEssential = new StringBuilder();
        while (secondPartMatcher.find()) {
            char startingLetter = (char) Integer.parseInt(secondPartMatcher.group().substring(0, 2));
            if (characterCollectionContainsCharacter(firstPartEssential.toString(), startingLetter)) {
                int length = Integer.parseInt(secondPartMatcher.group().substring(3));
                if (!secondPartEssential.toString().contains(String.valueOf(startingLetter))) {
                    secondPartEssential.append(startingLetter);
                    secondPartEssential.append(":");
                    secondPartEssential.append(length + 1);
                    secondPartEssential.append(" ");
                }
            }
        }

        String[] requirementsArray = secondPartEssential.toString().split(" ");

        String[] thirdPartArray = thirdPart.split("\\s+");
        int n = thirdPartArray.length;
        for (int i = 0; i < n; i++) {
            if (wordIsValid(thirdPartArray[i], requirementsArray)) {
                System.out.println(thirdPartArray[i]);
            }
        }

        sc.close();
    }

    public static boolean characterCollectionContainsCharacter(String firstPartEssential, char startingLetter) {
        int n = firstPartEssential.length();
        for (int i = 0; i < n; i++) {
            if (firstPartEssential.charAt(i) == startingLetter) {
                return true;
            }
        }
        return false;
    }

    public static boolean wordIsValid(String word, String[] requirementsArray) {
        int n = requirementsArray.length;
        for (int i = 0; i < n; i++) {
            String startingLetter = requirementsArray[i].substring(0, 1);
            if (word.startsWith(startingLetter)) {
                int length = Integer.parseInt(requirementsArray[i].substring(2));
                if (word.length() == length) {
                    return true;
                }
            }
        }
        return false;
    }

}
