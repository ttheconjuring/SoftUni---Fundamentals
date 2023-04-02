package MiddleExamPreparation;

import java.util.Scanner;

public class BlackFlag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int dailyPlunder = Integer.parseInt(sc.nextLine());
        double expectedPlunder = Double.parseDouble(sc.nextLine());

        double currentPlunder = 0;
        int i = 0;
        int j = 0;
        int currentDay = 0;

        while (currentDay != days) {
            currentDay++;
            i++;
            j++;
            currentPlunder += dailyPlunder;
            if (i == 3) {
                currentPlunder += (dailyPlunder * 0.5);
                i = 0;
            }
            if (j == 5) {
                currentPlunder -= (currentPlunder * 0.3);
                j = 0;
            }
        }

        if (currentPlunder >= expectedPlunder) {
            System.out.println("Ahoy! " + String.format("%.2f", currentPlunder) + " plunder gained.");
            return;
        } else {
            double percentage = currentPlunder / expectedPlunder * 100;
            System.out.println("Collected only " + String.format("%.2f", percentage) + "% of the plunder.");
        }

        sc.close();
    }

}
