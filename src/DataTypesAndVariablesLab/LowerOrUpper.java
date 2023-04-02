package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        if(Character.isLowerCase(ch)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

        sc.close();
    }

}
