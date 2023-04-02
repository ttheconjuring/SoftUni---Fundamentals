package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void getMax(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    public static void getMax(char a, char b) {
        System.out.println((char)Math.max(a, b));
    }

    public static void getMax(String a, String b) {
       if(a.compareTo(b) >= 0) {
           System.out.println(a);
       } else {
           System.out.println(b);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        switch (input) {
            case "int":
                int a = Integer.parseInt(sc.nextLine());
                int b = Integer.parseInt(sc.nextLine());
                getMax(a, b);
                break;
            case "char":
                char c = sc.nextLine().charAt(0);
                char d = sc.nextLine().charAt(0);
                getMax(c, d);
                break;
            case "string":
                String e = sc.nextLine();
                String f = sc.nextLine();
                getMax(e, f);
                break;
        }

        sc.close();
    }

}
