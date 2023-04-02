package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short meters = Short.parseShort(sc.nextLine());
        double kilometers = meters * 1.0 / 1000;

        System.out.printf("%.2f", kilometers);

        sc.close();
    }

}
