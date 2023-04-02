package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waterTankCapacity = 255;
        int n = Integer.parseInt(sc.nextLine());
        int currentLiters = 0;
        int liters;

        for (int i = 0; i < n; i++) {
            liters = Integer.parseInt(sc.nextLine());;
            currentLiters += liters;
            if (waterTankCapacity < currentLiters) {
                System.out.println("Insufficient capacity!");
                currentLiters -= liters;
            }
        }

        System.out.println(currentLiters);

        sc.close();
    }

}
