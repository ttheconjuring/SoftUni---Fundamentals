package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());

        int[] array = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
            sum += array[i];
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);

        sc.close();
    }

}
