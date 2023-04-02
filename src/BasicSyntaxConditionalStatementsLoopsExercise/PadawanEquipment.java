package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double saberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        int freeBeltCounter = 0;
        for (int i = 1; i <= students; i++) {
            if(i % 6 == 0) {
                freeBeltCounter++;
            }
        }

        double total = 0;
        double saberTotal = students * saberPrice + (Math.ceil(students * 0.1) * saberPrice);
        double robeTotal = students * robePrice;
        double beltTotal = students * beltPrice - freeBeltCounter * beltPrice;
        total = saberTotal + robeTotal + beltTotal;

        if(total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", total - money);
        }

        sc.close();
    }

}
