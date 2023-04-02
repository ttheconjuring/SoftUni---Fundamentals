package MiddleExam;

import java.util.Scanner;

public class TheHuntingGames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int players = Integer.parseInt(sc.nextLine());
        double groupEnergy = Double.parseDouble(sc.nextLine());
        double waterPerDayForOnePerson = Double.parseDouble(sc.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(sc.nextLine());

        double sumOfWater = players * waterPerDayForOnePerson * days;
        double sumOfFood = players * foodPerDayForOnePerson * days;

        int j = 0;
        int k = 0;

        for (int i = 0; i < days; i++) {
            j++;
            k++;
            double energyLoss = Double.parseDouble(sc.nextLine());
            groupEnergy -= energyLoss;
            if (groupEnergy <= 0) {
                System.out.println("You will run out of energy. You will be left with " + String.format("%.2f", sumOfFood) + " food and " + String.format("%.2f", sumOfWater) + " water.");
                return;
            }
            if (j == 2) {
                groupEnergy += (groupEnergy * 0.05);
                sumOfWater -= (sumOfWater * 0.3);
                j = 0;
            }
            if (k == 3) {
                sumOfFood -= (sumOfFood / players);
                groupEnergy += (groupEnergy * 0.1);
                k = 0;
            }
        }

        System.out.println("You are ready for the quest. You will be left with - " + String.format("%.2f", groupEnergy) + " energy!");

        sc.close();
    }

}

