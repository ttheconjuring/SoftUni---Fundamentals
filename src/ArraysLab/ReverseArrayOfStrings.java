package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");

        int n = array.length;

//        for (int i = n - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }

        String holder;
        for (int i = 0; i < n / 2; i++) {
            holder = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1- i] = holder;
        }

        System.out.println(String.join(" ", array));

        sc.close();
    }

}
