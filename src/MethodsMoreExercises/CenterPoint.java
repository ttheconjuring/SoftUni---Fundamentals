package MethodsMoreExercises;

import java.util.Scanner;

public class CenterPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());

        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        double distance1 = calculateDistance(x1, y1);
        double distance2 = calculateDistance(x2, y2);

        if(distance1 < distance2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if(distance1 > distance2) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }

        sc.close();
    }

    public static double calculateDistance(int x, int y) {
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(distance);
    }

}
