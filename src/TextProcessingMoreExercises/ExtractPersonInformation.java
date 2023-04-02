package TextProcessingMoreExercises;

import java.util.Scanner;

public class ExtractPersonInformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String name = input.substring(input.indexOf('@') + 1, input.indexOf('|'));
            String age = input.substring(input.indexOf('#') + 1, input.indexOf('*'));
            System.out.printf("%s is %s years old.%n", name, age);
        }

        sc.close();
    }

}
