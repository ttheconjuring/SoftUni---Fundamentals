package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class DecryptingMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        String message = "";
        char ch;
        int index;

        for (int i = 0; i < n; i++) {
            ch = sc.nextLine().charAt(0);
            index = (int)ch + key;
            message += (char)index;
        }

        System.out.println(message);


        sc.close();
    }

}
