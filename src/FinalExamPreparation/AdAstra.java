package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        String regex = "([#|])(?<itemName>[a-zA-z ]+)\\1(?<expirationDate>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> foodStorage = new ArrayList<>();

        int calories = 0;
        while (matcher.find()) {
            StringBuilder foodInformation = new StringBuilder();
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int kcal = Integer.parseInt(matcher.group("calories"));
            foodInformation.append("Item: ").append(itemName).append(", Best before: ").append(expirationDate).append(", Nutrition: ").append(kcal);
            foodStorage.add(foodInformation.toString());
            calories += kcal;
        }

        int days = calories / 2000;

        System.out.println("You have food to last you for: " + days + " days!");
        for (String foodInfo : foodStorage) {
            System.out.println(foodInfo);
        }

        sc.close();
    }

}
