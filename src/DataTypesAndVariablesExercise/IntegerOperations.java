package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int fourth = Integer.parseInt(sc.nextLine());

        double wtf = ((first + second) / third) * fourth;

        System.out.printf("%.0f", wtf);

        sc.close();
    }

}
