package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int power = Integer.parseInt(sc.nextLine()); // N
        int startingPower = power;
        int distance = Integer.parseInt(sc.nextLine()); // M
        int exhaustionFactor = Integer.parseInt(sc.nextLine()); // Y
        int targetsPoked = 0;

        while (power >= distance) {
            power -= distance;
            targetsPoked++;
            if (power == startingPower / 2) {
                if(exhaustionFactor != 0) {
                    power = power / exhaustionFactor;
                } else {
                    continue;
                }
            }
        }

        System.out.println(power);
        System.out.println(targetsPoked);

        sc.close();
    }

}
