package MethodsMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int n = array.length;

        String command = sc.nextLine();

        String type = "";
        int count = 0;

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "exchange":
                    int index = Integer.parseInt(commandArray[1]);
                    if (indexIsValid(index, n)) {
                        if (index == n - 1) {
                            break;
                        }
                        String firstHalf = "";
                        for (int i = 0; i <= index; i++) {
                            firstHalf += array[i] + " ";
                        }
                        String[] firstHalfArray = firstHalf.split(" ");
                        int lengthOfTheFirstHalfArray = firstHalfArray.length;
                        String secondHalf = "";
                        for (int i = index + 1; i < n; i++) {
                            secondHalf += array[i] + " ";
                        }
                        String[] secondHalfArray = secondHalf.split(" ");
                        int lengthOfTheSecondHalfArray = secondHalfArray.length;
                        for (int i = 0; i < lengthOfTheSecondHalfArray; i++) {
                            array[i] = secondHalfArray[i];
                        }
                        for (int i = 0; i < lengthOfTheFirstHalfArray; i++) {
                            array[i + lengthOfTheSecondHalfArray] = firstHalfArray[i];
                        }
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    type = commandArray[1];
                    switch (type) {
                        case "even":
                            String evenNumbers = makeEvenString(array);
                            if (evenNumbers.isEmpty()) {
                                System.out.println("No matches");
                                break;
                            }
                            String[] evenNumbersArray = evenNumbers.split(" ");
                            int lengthOfEvenNumbersArray = evenNumbersArray.length;
                            int[] convertedEvenNumbersArray = convertIntoInt(evenNumbersArray);
                            Arrays.sort(convertedEvenNumbersArray);
                            int maxEven = convertedEvenNumbersArray[lengthOfEvenNumbersArray - 1];
                            searchAndPrintIndex(array, maxEven);
                            break;
                        case "odd":
                            String oddNumbers = makeOddString(array);
                            if (oddNumbers.isEmpty()) {
                                System.out.println("No matches");
                                break;
                            }
                            String[] oddNumbersArray = oddNumbers.split(" ");
                            int lengthOfOddNumbersArray = oddNumbersArray.length;
                            int[] convertedOddNumbersArray = convertIntoInt(oddNumbersArray);
                            Arrays.sort(convertedOddNumbersArray);
                            int maxOdd = convertedOddNumbersArray[lengthOfOddNumbersArray - 1];
                            searchAndPrintIndex(array, maxOdd);
                            break;
                    }
                    break;
                case "min":
                    type = commandArray[1];
                    switch (type) {
                        case "even":
                            String evenNumbers = makeEvenString(array);
                            if (evenNumbers.isEmpty()) {
                                System.out.println("No matches");
                                break;
                            }
                            String[] evenNumbersArray = evenNumbers.split(" ");
                            int[] convertedEvenNumbersArray = convertIntoInt(evenNumbersArray);
                            Arrays.sort(convertedEvenNumbersArray);
                            int minEven = convertedEvenNumbersArray[0];
                            searchAndPrintIndex(array, minEven);
                            break;
                        case "odd":
                            String oddNumbers = makeOddString(array);
                            if (oddNumbers.isEmpty()) {
                                System.out.println("No matches");
                                break;
                            }
                            String[] oddNumbersArray = oddNumbers.split(" ");
                            int[] convertedOddNumbersArray = convertIntoInt(oddNumbersArray);
                            Arrays.sort(convertedOddNumbersArray);
                            int minOdd = convertedOddNumbersArray[0];
                            searchAndPrintIndex(array, minOdd);
                            break;
                    }
                    break;
                case "first":
                    count = Integer.parseInt(commandArray[1]);
                    if (count > n) {
                        System.out.println("Invalid count");
                    } else {
                        type = commandArray[2];
                        switch (type) {
                            case "even":
                                String evenNumbers = makeEvenString(array);
                                if (evenNumbers.isEmpty()) {
                                    System.out.println("[]");
                                    break;
                                }
                                String[] evenNumbersArray = evenNumbers.split(" ");
                                int lengthOfEvenNumbersArray = evenNumbersArray.length;
                                String[] countEvenNumbersArray;
                                if (count >= lengthOfEvenNumbersArray) {
                                    countEvenNumbersArray = new String[lengthOfEvenNumbersArray];
                                    for (int i = 0; i < lengthOfEvenNumbersArray; i++) {
                                        countEvenNumbersArray[i] = evenNumbersArray[i];
                                    }
                                } else {
                                    countEvenNumbersArray = new String[count];
                                    for (int i = 0; i < count; i++) {
                                        countEvenNumbersArray[i] = evenNumbersArray[i];
                                    }
                                }
                                System.out.println(Arrays.toString(countEvenNumbersArray));
                                break;
                            case "odd":
                                String oddNumbers = makeOddString(array);
                                if (oddNumbers.isEmpty()) {
                                    System.out.println("[]");
                                    break;
                                }
                                String[] oddNumbersArray = oddNumbers.split(" ");
                                int lengthOfOddNumbersArray = oddNumbersArray.length;
                                String[] countOddNumbersArray;
                                if (count >= lengthOfOddNumbersArray) {
                                    countOddNumbersArray = new String[lengthOfOddNumbersArray];
                                    for (int i = 0; i < lengthOfOddNumbersArray; i++) {
                                        countOddNumbersArray[i] = oddNumbersArray[i];
                                    }
                                } else {
                                    countOddNumbersArray = new String[count];
                                    for (int i = 0; i < count; i++) {
                                        countOddNumbersArray[i] = oddNumbersArray[i];
                                    }
                                }
                                System.out.println(Arrays.toString(countOddNumbersArray));
                                break;
                        }
                    }
                    break;
                case "last":
                    count = Integer.parseInt(commandArray[1]);
                    if (count > n) {
                        System.out.println("Invalid count");
                    } else {
                        type = commandArray[2];
                        switch (type) {
                            case "even":
                                String evenNumbers = makeEvenString(array);
                                if (evenNumbers.isEmpty()) {
                                    System.out.println("[]");
                                    break;
                                }
                                String[] evenNumbersArray = evenNumbers.split(" ");
                                int lengthOfEvenNumbersArray = evenNumbersArray.length;
                                String[] countEvenNumbersArray;
                                if (count >= lengthOfEvenNumbersArray) {
                                    countEvenNumbersArray = new String[lengthOfEvenNumbersArray];
                                    for (int i = 0; i < lengthOfEvenNumbersArray; i++) {
                                        countEvenNumbersArray[i] = evenNumbersArray[i];
                                    }
                                } else {
                                    countEvenNumbersArray = new String[count];
                                    for (int i = 0; i < count; i++) {
                                        for (int j = lengthOfEvenNumbersArray - count; j < lengthOfEvenNumbersArray; j++) {
                                            countEvenNumbersArray[i] = evenNumbersArray[j];
                                            i++;
                                        }
                                    }
                                }
                                System.out.println(Arrays.toString(countEvenNumbersArray));
                                break;
                            case "odd":
                                String oddNumbers = makeOddString(array);
                                if (oddNumbers.isEmpty()) {
                                    System.out.println("[]");
                                    break;
                                }
                                String[] oddNumbersArray = oddNumbers.split(" ");
                                int lengthOfOddNumbersArray = oddNumbersArray.length;
                                String[] countOddNumbersArray;
                                if (count >= lengthOfOddNumbersArray) {
                                    countOddNumbersArray = new String[lengthOfOddNumbersArray];
                                    for (int i = 0; i < lengthOfOddNumbersArray; i++) {
                                        countOddNumbersArray[i] = oddNumbersArray[i];
                                    }
                                } else {
                                    countOddNumbersArray = new String[count];
                                    for (int i = 0; i < count; i++) {
                                        for (int j = lengthOfOddNumbersArray - count; j < lengthOfOddNumbersArray; j++) {
                                            countOddNumbersArray[i] = oddNumbersArray[j];
                                            i++;
                                        }
                                    }
                                }
                                System.out.println(Arrays.toString(countOddNumbersArray));
                                break;
                        }
                    }
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        sc.close();

    }

    public static boolean indexIsValid(int index, int n) {
        return index >= 0 && index < n;
    }

    public static int[] convertIntoInt(String[] array) {
        int n = array.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        return arr;
    }

    public static String makeOddString(String[] array) {
        int n = array.length;
        String str = "";
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(array[i]);
            if (current % 2 != 0) {
                str += array[i] + " ";
            }
        }
        return str;
    }

    public static String makeEvenString(String[] array) {
        int n = array.length;
        String str = "";
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(array[i]);
            if (current % 2 == 0) {
                str += array[i] + " ";
            }
        }
        return str;
    }

    public static void searchAndPrintIndex(String[] array, int specialNumber) {
        int n = array.length;
        for (int i = n - 1; i >= 0; i--) {
            int current = Integer.parseInt(array[i]);
            if (current == specialNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
// 0  1 2  3 4  5 6  7 8  9 10  11  12 13   14
// 9 -1 0 -8 2 -7 3 -6 4 -5 67 -52 100 11 -299
// 1  2 3  4 5  6 7  8 9 10 11  12  13 14   15

// even: 0, -8, 2, -6, 4, -52, 100
// odd: 9, -1, -7, 3, -5, 67, 11, -299
