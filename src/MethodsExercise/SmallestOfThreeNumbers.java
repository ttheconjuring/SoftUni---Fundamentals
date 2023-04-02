package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        System.out.println(getTheSmallest(n1, n2, n3));

        sc.close();
    }

    public static int getTheSmallest(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }

}
