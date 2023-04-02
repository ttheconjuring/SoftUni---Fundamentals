package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        if(people <= capacity) {
            System.out.println(1);
        } else {
            if(people % capacity == 0) {
                System.out.println(people / capacity);
            } else {
                System.out.println((people / capacity) + 1);
            }
        }

        sc.close();
    }

}
