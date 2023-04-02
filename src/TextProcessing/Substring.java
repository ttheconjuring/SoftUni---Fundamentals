package TextProcessing;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String toBeRemoved = sc.nextLine();
        String input = sc.nextLine();


        while (input.contains(toBeRemoved)) {
            int startingIndex = input.indexOf(toBeRemoved);
            int lastIndex = startingIndex + toBeRemoved.length();
            input = input.substring(0, startingIndex) + input.substring(lastIndex);
        }

        System.out.println(input);

        sc.close();
    }

}
