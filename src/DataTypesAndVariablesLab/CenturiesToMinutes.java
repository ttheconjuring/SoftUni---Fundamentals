package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CenturiesToMinutes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte centuries = Byte.parseByte(sc.nextLine());
        int years =(centuries * 100);
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);

        sc.close();
    }

}
