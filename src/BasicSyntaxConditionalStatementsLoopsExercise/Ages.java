package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        if(age < 3) {
            System.out.println("baby");
        } else if(age < 14) {
            System.out.println("child");
        } else if(age < 20) {
            System.out.println("teenager");
        } else if(age < 66) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }

        sc.close();
    }
}
