package MiddleExamPreparation;

import java.util.Scanner;

public class ComputerStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double partsPricesWithoutTaxes = 0;

        String input = sc.nextLine();

        while (!input.equals("special") && !input.equals("regular")) {
            double currentPartPrice = Double.parseDouble(input);
            if (currentPartPrice <= 0) {
                System.out.println("Invalid price!");
            } else {
                partsPricesWithoutTaxes += currentPartPrice;
            }
            input = sc.nextLine();
        }

        double taxes = partsPricesWithoutTaxes * 0.2;
        double finalPrice = partsPricesWithoutTaxes + taxes;

        if (input.equals("special")) {
            finalPrice *= 0.9;
        }

        if (finalPrice <= 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", partsPricesWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", finalPrice);
        }

        sc.close();
    }

}
