package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstStr = sc.nextLine();
        String secondStr = sc.nextLine();
        String delimiter = sc.nextLine();

        System.out.printf("%s%s%s", firstStr, delimiter, secondStr);


        sc.close();
    }

}
