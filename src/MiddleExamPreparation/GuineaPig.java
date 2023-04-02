package MiddleExamPreparation;

import java.util.Scanner;

public class GuineaPig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double food = Double.parseDouble(sc.nextLine());
        double hay = Double.parseDouble(sc.nextLine());
        double cover = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());

        double foodInGrams = food * 1000;
        double hayInGrams = hay * 1000;
        double coverInGrams = cover * 1000;
        double weightInGrams = weight * 1000;

        int days = 0;

        int i = 0;
        int j = 0;

        while (foodInGrams > 0 && hayInGrams > 0 && coverInGrams > 0) {
            days++;
            i++;
            j++;
            if (days > 30) {
                System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.  %n", foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
                return;
            }
            foodInGrams -= 300;
            if (i == 2) {
                double amountOfHayGiven = foodInGrams * 0.05;
                hayInGrams -= amountOfHayGiven;
                i = 0;
            }
            if (j == 3) {
                double quantityOfCoverPut = weightInGrams / 3;
                coverInGrams -= quantityOfCoverPut;
                j = 0;
            }
        }

        System.out.println("Merry must go to the pet store!");

        sc.close();
    }

}
// 1 [2] {3} [4] 5 {[6]} 7 [8] {9} [10]
