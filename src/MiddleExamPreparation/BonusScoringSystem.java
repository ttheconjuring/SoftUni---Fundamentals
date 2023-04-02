package MiddleExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = Integer.parseInt(sc.nextLine());
        int lectures = Integer.parseInt(sc.nextLine());
        int additionalBonus = Integer.parseInt(sc.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < students; i++) {
            int studentAttendances = Integer.parseInt(sc.nextLine());
            double totalBonus = studentAttendances * 1.0 / lectures * (5 + additionalBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendances = studentAttendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.%n", maxAttendances);
        sc.close();
    }

}
