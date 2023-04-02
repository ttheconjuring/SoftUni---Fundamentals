package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }

}
