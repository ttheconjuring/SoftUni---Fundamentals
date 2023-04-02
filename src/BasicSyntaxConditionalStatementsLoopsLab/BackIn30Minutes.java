package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        int minute = Integer.parseInt(sc.nextLine());

        int currentTimeInMinutes = hour * 60 + minute;
        int after30Minutes = currentTimeInMinutes + 30;

        int aHour = after30Minutes / 60;
        if(aHour == 24) {
            aHour = 0;
        }
        int aMinute = after30Minutes % 60;

        if(aMinute < 10) {
            System.out.printf("%d:0%d", aHour, aMinute);
        } else {
            System.out.printf("%d:%d", aHour, aMinute);
        }

        sc.close();
    }
}
