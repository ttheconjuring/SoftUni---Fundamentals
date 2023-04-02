package BasicSyntaxConditionalStatementsLoopsMoreExersices;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double currentBalance = Double.parseDouble(sc.nextLine());
        double spentOnGames = 0;

        String input = "";
        while (!input.equals("Game Time")) {
            input = sc.nextLine();

            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                break;
            }

            if (input.equals("Game Time")) {
                break;
            }


            switch (input) {
                case "OutFall 4":
                    if (currentBalance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought OutFall 4");
                        currentBalance -= 39.99;
                        spentOnGames += 39.99;
                    }
                    break;
                case "CS: OG":
                    if (currentBalance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought CS: OG");
                        currentBalance -= 15.99;
                        spentOnGames += 15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Zplinter Zell");
                        currentBalance -= 19.99;
                        spentOnGames += 19.99;
                    }
                    break;
                case "Honored 2":
                    if (currentBalance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Honored 2");
                        currentBalance -= 59.99;
                        spentOnGames += 59.99;
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                        currentBalance -= 29.99;
                        spentOnGames += 29.99;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch Origins Edition");
                        currentBalance -= 39.99;
                        spentOnGames += 39.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
        }

        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentOnGames, currentBalance);
        }

    }
}