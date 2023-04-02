package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = array.length;
        if (n == 1) {
            System.out.println(array[0]);
            return;
        }
        int sum = 0;
        int currentElement;

        for (int i = 0; i < n - 1; i++) {
            int[] condensed = new int[n - 1 - i];
            sum = 0;
            for (int j = 0; j < condensed.length; j++) {
                currentElement = array[j] + array[j + 1];
                condensed[j] = currentElement;
                sum += condensed[j];
                array[j] = condensed[j];
            }
        }

        System.out.println(sum);

        sc.close();
    }

}