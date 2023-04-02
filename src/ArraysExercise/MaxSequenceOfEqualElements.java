package ArraysExercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int n = array.length;

        String sequence = "";
        int m = 0;

        String longest = "";
        int max = 0;

        for (int i = 0; i < n; i++) {
            String current = array[i];
            for (int j = i; j < n; j++) {
                if (array[j].equals(current)) {
                    sequence += array[j] + " ";
                } else {
                    break;
                }
            }
            m = sequence.length();
            if (max < m) {
                max = m;
                longest = sequence;
            }
            sequence = "";
        }

        String[] arr = longest.split(" ");
        System.out.println(String.join(" ", arr));

        sc.close();
    }

}
