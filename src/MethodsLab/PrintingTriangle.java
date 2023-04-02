package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {

   public static void printLine(int start, int end) {
       for (int i = start; i <= end; i++) {
           System.out.print(i + " ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            printLine(1, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }

        sc.close();
    }

}
