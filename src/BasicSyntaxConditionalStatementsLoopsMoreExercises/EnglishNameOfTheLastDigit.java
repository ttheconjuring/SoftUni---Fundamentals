package BasicSyntaxConditionalStatementsLoopsMoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {

    public static String giveTheName(int lastDigit) {
        switch (lastDigit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int lastDigit = Math.abs(n) % 10;
        String result = giveTheName(lastDigit);

        System.out.println(result);

        sc.close();;
    }

}
