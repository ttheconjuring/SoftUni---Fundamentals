package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        int sum = sumOFFirstAndSecond(first, second);
        int result = subtractThirdFromSun(sum, third);

        System.out.println(result);

        sc.close();
    }

    public static int sumOFFirstAndSecond(int first, int second) {
        return first + second;
    }

    public static int subtractThirdFromSun(int sum, int third) {
        return sum - third;
    }


}
