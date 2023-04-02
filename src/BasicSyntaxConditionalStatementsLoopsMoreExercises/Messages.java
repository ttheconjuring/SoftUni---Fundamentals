package BasicSyntaxConditionalStatementsLoopsMoreExercises;

import java.util.Scanner;

public class Messages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int messageLength = Integer.parseInt(sc.nextLine());
        String message = "";
        String input;

        int numberOfDigits;
        int mainDigit;
        int offset;
        int letterIndex = 0;

        for (int i = 0; i < messageLength; i++) {
            input = sc.nextLine();
            if (input.equals("0")) {
                message += " ";
                continue;
            }
            numberOfDigits = input.length();
            mainDigit = Integer.parseInt(input.substring(0, 1));
            offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            letterIndex = (offset + numberOfDigits - 1);
            switch (letterIndex) {
                case 0:
                    message += "a";
                    break;
                case 1:
                    message += "b";
                    break;
                case 2:
                    message += "c";
                    break;
                case 3:
                    message += "d";
                    break;
                case 4:
                    message += "e";
                    break;
                case 5:
                    message += "f";
                    break;
                case 6:
                    message += "g";
                    break;
                case 7:
                    message += "h";
                    break;
                case 8:
                    message += "i";
                    break;
                case 9:
                    message += "j";
                    break;
                case 10:
                    message += "k";
                    break;
                case 11:
                    message += "l";
                    break;
                case 12:
                    message += "m";
                    break;
                case 13:
                    message += "n";
                    break;
                case 14:
                    message += "o";
                    break;
                case 15:
                    message += "p";
                    break;
                case 16:
                    message += "q";
                    break;
                case 17:
                    message += "r";
                    break;
                case 18:
                    message += "s";
                    break;
                case 19:
                    message += "t";
                    break;
                case 20:
                    message += "u";
                    break;
                case 21:
                    message += "v";
                    break;
                case 22:
                    message += "w";
                    break;
                case 23:
                    message += "x";
                    break;
                case 24:
                    message += "y";
                    break;
                case 25:
                    message += "z";
                    break;
                default:
                    System.out.println("wtf");

            }
        }

        System.out.println(message);

        sc.close();
    }

}
