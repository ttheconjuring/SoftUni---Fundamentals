package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);
        char third = sc.nextLine().charAt(0);

        System.out.printf("%c %c %c", third, second, first);

        sc.close();
    }

}
