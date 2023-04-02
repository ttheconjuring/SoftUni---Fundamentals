package MiddleExamPreparation;

import java.util.Scanner;

public class HeartDelivery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split("@");
        int n = arr.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        String command = sc.nextLine();
        int index = 0;

        while (!command.equals("Love!")) {
            String[] commandArray = command.split("\\s+");
            int length = Integer.parseInt(commandArray[1]);
            index += length;
            if (index >= n) {
                index = 0;
            }
            if (array[index] == 0) {
                System.out.println("Place " + index + " already had Valentine's day.");
            } else if (array[index] - 2 == 0) {
                array[index] = 0;
                System.out.println("Place " + index + " has Valentine's day.");
            } else {
                array[index] -= 2;
            }
            command = sc.nextLine();
        }

        System.out.println("Cupid's last position was " + index + ".");

        int houseCount = 0;
        for (int i : array) {
            if (i != 0) {
                houseCount++;
            }
        }

        if (houseCount == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.println("Cupid has failed " + houseCount + " places.");
        }

        sc.close();

    }

}
