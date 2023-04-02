package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String groupType = sc.nextLine();
        String day = sc.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                switch (groupType) {
                    case "Students":
                        price = people * 8.45;
                        if(people >= 30) {
                            price = price - price * 0.15;
                        }
                        break;
                    case "Business":
                        price = people * 10.90;
                        if(people >= 100) {
                            price -= 10 * 10.90;
                        }
                        break;
                    case "Regular":
                        price = people * 15;
                        if(people >= 10 && people <= 20) {
                            price = price - price * 0.05;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Saturday":
                switch (groupType) {
                    case "Students":
                        price = people * 9.80;
                        if(people >= 30) {
                            price = price - price * 0.15;
                        }
                        break;
                    case "Business":
                        price = people * 15.60;
                        if(people >= 100) {
                            price -= 10 * 15.60;
                        }
                        break;
                    case "Regular":
                        price = people * 20;
                        if(people >= 10 && people <= 20) {
                            price = price - price * 0.05;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Sunday":
                switch (groupType) {
                    case "Students":
                        price = people * 10.46;
                        if(people >= 30) {
                            price = price - price * 0.15;
                        }
                        break;
                    case "Business":
                        price = people * 16;
                        if(people >= 100) {
                            price -= 10 * 16;
                        }
                        break;
                    case "Regular":
                        price = people * 22.50;
                        if(people >= 10 && people <= 20) {
                            price = price - price * 0.05;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

        System.out.printf("Total price: %.2f%n", price);

        sc.close();
    }
}
