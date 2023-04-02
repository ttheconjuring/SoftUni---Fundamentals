package MiddleExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;

        String command = sc.nextLine();

        int index1;
        int index2;

        while (!command.equals("end")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "swap":
                    index1 = Integer.parseInt(commandArray[1]);
                    index2 = Integer.parseInt(commandArray[2]);
                    int holder = array[index1];
                    array[index1] = array[index2];
                    array[index2] = holder;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandArray[1]);
                    index2 = Integer.parseInt(commandArray[2]);
                    int product = array[index1] * array[index2];
                    array[index1] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < n; i++) {
                        array[i] -= 1;
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        sc.close();
    }

}

// 2 4 1 5 6 2
//
