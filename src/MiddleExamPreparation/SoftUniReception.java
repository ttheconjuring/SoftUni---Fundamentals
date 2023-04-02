package MiddleExamPreparation;

import java.util.Scanner;

public class SoftUniReception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(sc.nextLine());
        int secondEmployee = Integer.parseInt(sc.nextLine());
        int thirdEmployee = Integer.parseInt(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;

        if (students == 0) {
            System.out.println("Time needed: 0h.");
            return;
        } else if (studentsPerHour >= students) {
            System.out.println("Time needed: 1h.");
            return;
        }

        int hoursNeeded = 0;

        while (students > 0) {
            if ((hoursNeeded + 1) % 4 == 0) {
                hoursNeeded++;
            } else {
                hoursNeeded++;
                students -= studentsPerHour;
            }
        }

        System.out.println("Time needed: " + hoursNeeded + "h.");

        sc.close();
    }

}
