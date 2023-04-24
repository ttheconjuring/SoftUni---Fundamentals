package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fieldSize = Integer.parseInt(sc.nextLine());

        if (fieldSize == 0) {
            return;
        }

        int[] field = new int[fieldSize];
        int[] index = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < index.length; i++) {
            if (index[i] >= 0 && index[i] < fieldSize) {
                field[index[i]] = 1;
            }
        }

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            int ladyBugIndex = Integer.parseInt(commandArray[0]);
            if (ladyBugIndex >= 0 && ladyBugIndex < fieldSize) {
                if (field[ladyBugIndex] == 1) {
                    String direction = commandArray[1];
                    int flyLength = Integer.parseInt(commandArray[2]);
                    if (flyLength == 0) {
                        break;
                    }
                    switch (direction) {
                        case "left":
                            if (ladyBugIndex - flyLength >= 0) {
                                if (field[ladyBugIndex - flyLength] == 0) {
                                    field[ladyBugIndex - flyLength] = 1;
                                    field[ladyBugIndex] = 0;
                                } else {
                                    int currentIndex = ladyBugIndex - flyLength;
                                    boolean freeSpotFound = false;
                                    while (currentIndex >= 0) {
                                        if (field[currentIndex] == 0) {
                                            freeSpotFound = true;
                                            field[currentIndex] = 1;
                                            field[ladyBugIndex] = 0;
                                            break;
                                        }
                                        currentIndex -= flyLength;
                                    }
                                    if (!freeSpotFound) {
                                        field[ladyBugIndex] = 0;
                                    }
                                }
                            } else {
                                field[ladyBugIndex] = 0;
                            }
                            break;
                        case "right":
                            if (ladyBugIndex + flyLength < fieldSize) {
                                if (field[ladyBugIndex + flyLength] == 0) {
                                    field[ladyBugIndex + flyLength] = 1;
                                    field[ladyBugIndex] = 0;
                                } else {
                                    int currentIndex = ladyBugIndex + flyLength;
                                    boolean freeSpotFound = false;
                                    while (currentIndex < fieldSize) {
                                        if (field[currentIndex] == 0) {
                                            freeSpotFound = true;
                                            field[currentIndex] = 1;
                                            field[ladyBugIndex] = 0;
                                            break;
                                        }
                                        currentIndex += flyLength;
                                    }
                                    if (!freeSpotFound) {
                                        field[ladyBugIndex] = 0;
                                    }
                                }
                            } else {
                                field[ladyBugIndex] = 0;
                            }
                            break;
                        default:
                            System.out.println("error");
                    }
                }
            }
            command = sc.nextLine();
        }

        for (int i = 0; i < fieldSize; i++) {
            System.out.print(field[i] + " ");
        }

        sc.close();
    }

}
