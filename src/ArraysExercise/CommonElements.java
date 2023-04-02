package ArraysExercise;

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array1 = sc.nextLine().split(" ");
        String[] array2 = sc.nextLine().split(" ");

        for (String s : array2) {
            for (String s1 : array1) {
                if(s.equals(s1)) {
                    System.out.print(s1 + " ");
                }
            }
        }

        sc.close();
    }

}
