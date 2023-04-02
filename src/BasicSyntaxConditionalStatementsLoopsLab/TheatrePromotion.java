package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        switch (dayType) {
            case "Weekday":
                if (age < 0 || age > 122) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    System.out.println("12$");
                } else if (age <= 64) {
                    System.out.println("18$");
                } else {
                    System.out.println("12$");
                }
                break;
            case "Weekend":
                if (age < 0 || age > 122) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    System.out.println("15$");
                } else if (age <= 64) {
                    System.out.println("20$");
                } else {
                    System.out.println("15$");
                }
                break;
            case "Holiday":
                if (age < 0 || age > 122) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    System.out.println("5$");
                } else if (age <= 64) {
                    System.out.println("12$");
                } else {
                    System.out.println("10$");
                }
                break;
        }

        sc.close();
    }
}
