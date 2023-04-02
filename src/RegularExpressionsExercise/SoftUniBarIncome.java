package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|(?<price>[^|$%.]*\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = sc.nextLine();

        double totalSum = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price").replaceAll("[A-Za-z]+", ""));
                double totalPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalPrice);
                totalSum += totalPrice;
            }
            input = sc.nextLine();
        }

        System.out.println("Total income: " + String.format("%.2f", totalSum));

        sc.close();
    }

}
