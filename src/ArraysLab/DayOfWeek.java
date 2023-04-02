package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(sc.nextLine());

        if(day > 0 && day < 8) {
            for (int i = 0; i <= 6; i++) {
                if(i == day - 1) {
                    System.out.println(weekday[i]);
                }
            }
        } else {
            System.out.println("Invalid day!");
        }

        sc.close();
    }

}
