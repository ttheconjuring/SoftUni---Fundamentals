package BasicSyntaxConditionalStatementsLoopsMoreExercises;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());
        int three = Integer.parseInt(sc.nextLine());

        int first = Math.max(Math.max(one, two), three);
        int second;
        int third = Math.min(Math.min(one, two), three);

        if(first == one){
            if(third == two){
                second = three;
            } else {
                second = two;
            }
        } else if(first == two) {
            if(third == one) {
                second = three;
            } else {
                second = one;
            }
        } else {
            if(third == two) {
                second = one;
            } else {
                second = two;
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        sc.close();
    }

}
