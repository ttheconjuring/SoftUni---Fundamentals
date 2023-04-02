package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);

        sc.close();
    }

}
