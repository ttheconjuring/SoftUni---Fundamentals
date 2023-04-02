package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String specialBombNumberInput = sc.nextLine();
        int specialBombNumber = Integer.parseInt(specialBombNumberInput.split("\\s+")[0]);
        int power = Integer.parseInt(specialBombNumberInput.split("\\s+")[1]);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == specialBombNumber) {
                int numberBeforeTheSpecialBombNumber = 0;
                for (int j = 0; j < i; j++) {
                    numberBeforeTheSpecialBombNumber++;
                }
                if (numberBeforeTheSpecialBombNumber < power) {
                    int j = 0;
                    while (list.get(j) != specialBombNumber) {
                        list.remove(j);
                    }
                    i -= numberBeforeTheSpecialBombNumber;
                } else {
                    int j = i - power;
                    while (list.get(j) != specialBombNumber) {
                        list.remove(j);
                    }
                    i -= power;
                }
                int numbersAfterTheSpecialBombNumber = 0;
                for (int j = i + 1; j < list.size(); j++) {
                    numbersAfterTheSpecialBombNumber++;
                }
                if (numbersAfterTheSpecialBombNumber < power) {
                    list.subList(i + 1, list.size()).clear();
                } else {
                    list.subList(i + 1, i + 1 + power).clear();
                }
                list.remove(i);
                i = -1;
            }
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
        sc.close();
    }

}
