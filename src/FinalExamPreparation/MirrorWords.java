package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String regex = "(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> mirrorWordsList = new ArrayList<>();
        int validWordPairsCounter = 0;

        while (matcher.find()) {
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            validWordPairsCounter++;
            if (firstWord.equals(new StringBuilder(secondWord).reverse().toString())) {
                mirrorWordsList.add(firstWord + " <=> " + secondWord);
            }
        }

        if (validWordPairsCounter == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.println(validWordPairsCounter + " word pairs found!");
            if (mirrorWordsList.size() == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are: ");
                System.out.println(String.join(", ", mirrorWordsList));
            }
        }

        sc.close();
    }

}
