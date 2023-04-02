package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String password = new StringBuilder(username).reverse().toString();
        int counter = 0;
//        boolean isLogged = false;

        String input = sc.nextLine();

        while (!input.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.println("User " + username + " blocked!");
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = sc.nextLine();
        }

        if(counter < 4) {
            System.out.println("User " + username + " logged in.");
        }



        sc.close();
    }
}
