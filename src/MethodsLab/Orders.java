package MethodsLab;

import java.util.Scanner;

public class Orders {

    public static double getPrice(String product) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        return price;
    }

    public static void calculateThePrice(String product, int quantity) {
        System.out.printf("%.2f", getPrice(product) * quantity);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        calculateThePrice(product, quantity);

        sc.close();
    }

}
