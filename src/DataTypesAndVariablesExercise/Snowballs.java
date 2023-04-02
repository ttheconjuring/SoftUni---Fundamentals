package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballs = Integer.parseInt(sc.nextLine());
        int snowballSnow;
        int snowballTime;
        int snowballQuality;
        double snowballValue;

        int highestSnowballSnow = 0;
        int highestSnowballTime = 0;
        int highestSnowballQuality = 0;
        double highestSnowballValue = Double.MIN_VALUE;

        for (int i = 0; i < snowballs; i++) {
            snowballSnow = Integer.parseInt(sc.nextLine());
            snowballTime = Integer.parseInt(sc.nextLine());
            snowballQuality = Integer.parseInt(sc.nextLine());
            snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (highestSnowballValue < snowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality);

        sc.close();
    }

}
