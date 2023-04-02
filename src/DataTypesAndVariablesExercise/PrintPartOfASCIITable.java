package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beginning = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for (int i = beginning; i <= end; i++) {
            System.out.print((char) i + " ");
        }

        sc.close();
    }

}
