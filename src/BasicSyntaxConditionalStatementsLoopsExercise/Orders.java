package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orders = Integer.parseInt(sc.nextLine());
        double pricePerCapsule;
        int days;
        int capsules;
        double orderIncome = 0;
        double total = 0;

        for (int i = 0; i < orders; i++) {
            pricePerCapsule = Double.parseDouble(sc.nextLine());
            days = Integer.parseInt(sc.nextLine());
            capsules = Integer.parseInt(sc.nextLine());
            orderIncome = days * capsules * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", orderIncome);
            total += orderIncome;
        }

        System.out.printf("Total: $%.2f%n", total);

        sc.close();
    }

}
