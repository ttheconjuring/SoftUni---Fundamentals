package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String model;
        double radius;
        int height;
        double volume;
        double biggestKeg = Double.MIN_VALUE;
        String biggestModel = "";

        for (int i = 0; i < n; i++) {
            model = sc.nextLine();
            radius = Double.parseDouble(sc.nextLine());
            height = Integer.parseInt(sc.nextLine());
            volume = Math.PI * radius * radius * height;
            if (biggestKeg < volume) {
                biggestKeg = volume;
                biggestModel = model;
            }
        }

        System.out.println(biggestModel);

        sc.close();
    }

}
