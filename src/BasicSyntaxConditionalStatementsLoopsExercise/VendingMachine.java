package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double insertedMoney = 0;
        String input = sc.nextLine();

        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    insertedMoney += Double.parseDouble(input);
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", Double.parseDouble(input));
            }
            input = sc.nextLine();
        }

        input = sc.nextLine();

        while (!input.equals("End") && insertedMoney > 0) {
            switch (input) {
                case "Nuts":
                    if(insertedMoney < 2) {
                        System.out.println("Sorry, not enough money");
                        input = sc.nextLine();
                        continue;
                    }
                    insertedMoney -= 2;
                    System.out.printf("Purchased %s%n", input);
                    break;
                case "Water":
                    if(insertedMoney < 0.7) {
                        System.out.println("Sorry, not enough money");
                        input = sc.nextLine();
                        continue;
                    }
                    insertedMoney -= 0.7;
                    System.out.printf("Purchased %s%n", input);
                    break;
                case "Crisps":
                    if(insertedMoney < 1.5) {
                        System.out.println("Sorry, not enough money");
                        input = sc.nextLine();
                        continue;
                    }
                    insertedMoney -= 1.5;
                    System.out.printf("Purchased %s%n", input);
                    break;
                case "Soda":
                    if(insertedMoney < 0.8) {
                        System.out.println("Sorry, not enough money");
                        input = sc.nextLine();
                        continue;
                    }
                    insertedMoney -= 0.8;
                    System.out.printf("Purchased %s%n", input);
                    break;
                case "Coke":
                    if(insertedMoney < 1) {
                        System.out.println("Sorry, not enough money");
                        input = sc.nextLine();
                        continue;
                    }
                    insertedMoney -= 1;
                    System.out.printf("Purchased %s%n", input);
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = sc.nextLine();
        }

        System.out.printf("Change: %.2f", insertedMoney);

        sc.close();
    }
}
