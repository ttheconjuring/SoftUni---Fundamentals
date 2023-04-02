package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int brokenHeadsets = 0;
        int brokenMouses = 0;
        int brokenKeyboards = 0;
        int brokenDisplays = 0;

        for (int i = 1; i <= lostGames; i++) {
            if(i % 2 == 0) {
                brokenHeadsets++;
                if(i % 3 == 0) {
                    brokenMouses++;
                    brokenKeyboards++;
                    if(brokenKeyboards % 2 == 0) {
                        brokenDisplays++;
                    }
                }
            } else if(i % 3 == 0){
                brokenMouses++;
            }
        }

        double total = brokenHeadsets * headsetPrice + brokenMouses * mousePrice + brokenKeyboards * keyboardPrice + brokenDisplays * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.%n", total);

        sc.close();
    }

}
// 1 [2] {3} [4] 5 {[6]} 7 [8] {9} [10] 11 {[12]}