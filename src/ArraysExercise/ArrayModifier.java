package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;

        String input = sc.nextLine();

        while (!input.equals("end")) {
            if (input.contains("swap")) {
                String[] arr = input.split(" ");
                int index1 = Integer.parseInt(arr[1]);
                int index2 = Integer.parseInt(arr[2]);
                int holder = array[index1];
                array[index1] = array[index2];
                array[index2] = holder;
            } else if (input.contains("multiply")) {
                String[] arr = input.split(" ");
                int index1 = Integer.parseInt(arr[1]);
                int index2 = Integer.parseInt(arr[2]);
                int product = array[index1] * array[index2];
                array[index1] = product;
            } else if (input.equals("decrease")) {
                for (int i = 0; i < n; i++) {
                    array[i] -= 1;
                }
            }
            input = sc.nextLine();
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
