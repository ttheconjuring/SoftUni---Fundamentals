package MethodsMoreExercises;

import java.util.Scanner;

public class LongerLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // point #1
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        double lengthOfTheFirstLine = calculateLength(x1, y1, x2, y2);

        // point #2
        int x3 = Integer.parseInt(sc.nextLine());
        int y3 = Integer.parseInt(sc.nextLine());
        int x4 = Integer.parseInt(sc.nextLine());
        int y4 = Integer.parseInt(sc.nextLine());

        double lengthOfTheSecondLine = calculateLength(x3, y3, x4, y4);

        if (lengthOfTheFirstLine > lengthOfTheSecondLine) {
            double distanceOfTheFirstPoint = calculateDistance(x1, y1);
            double distanceOfTheSecondPoint = calculateDistance(x2, y2);
            if (distanceOfTheFirstPoint < distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else if (distanceOfTheFirstPoint > distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            }
        } else if (lengthOfTheFirstLine < lengthOfTheSecondLine) {
            double distanceOfTheFirstPoint = calculateDistance(x3, y3);
            double distanceOfTheSecondPoint = calculateDistance(x4, y4);
            if (distanceOfTheFirstPoint < distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else if (distanceOfTheFirstPoint > distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            }
        } else {
            double distanceOfTheFirstPoint = calculateDistance(x1, y1);
            double distanceOfTheSecondPoint = calculateDistance(x2, y2);
            if (distanceOfTheFirstPoint < distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else if (distanceOfTheFirstPoint > distanceOfTheSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            }
        }

        sc.close();
    }

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double calculateDistance(int x, int y) {
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(distance);
    }

}
