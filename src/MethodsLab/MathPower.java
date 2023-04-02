package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    public static double getNumOnPow(double num, int pow) {
        return Math.pow(num, pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        int pow = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getNumOnPow(num, pow)));

        sc.close();
    }

}
