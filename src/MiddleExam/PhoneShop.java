package MiddleExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> phones = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String command = sc.nextLine();

        String phone;

        while (!command.equals("End")) {
            String[] commandArray = command.split(" - ");
            switch (commandArray[0]) {
                case "Add":
                    phone = commandArray[1];
                    if (!phones.contains(phone)) {
                        phones.add(phone);
                    }
                    break;
                case "Remove":
                    phone = commandArray[1];
                    phones.remove(phone);
                    break;
                case "Bonus phone":
                    String[] phonesArray = commandArray[1].split(":");
                    String oldPhone = phonesArray[0];
                    String newPhone = phonesArray[1];
                    if (phones.contains(oldPhone)) {
                        phones.add(phones.indexOf(oldPhone) + 1, newPhone);
                    }
                    break;
                case "Last":
                    phone = commandArray[1];
                    if (phones.contains(phone)) {
                        phones.remove(phone);
                        phones.add(phone);
                    }
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println(String.join(", ", phones));

        sc.close();
    }

}
