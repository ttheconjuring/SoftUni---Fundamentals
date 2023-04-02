package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static int getArea(int width, int length) {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        System.out.println(getArea(width, length));

        sc.close();
    }

}
