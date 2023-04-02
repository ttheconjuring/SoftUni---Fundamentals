package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double britishPounds = Double.parseDouble(sc.nextLine());
        double usDollars = britishPounds * 1.36;

        System.out.printf("%.3f", usDollars);

        sc.close();
    }
}
