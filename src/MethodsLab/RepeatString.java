package MethodsLab;

import java.util.Scanner;

public class RepeatString {

    public static void repeat(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        repeat(str, n);

        sc.close();
    }

}
