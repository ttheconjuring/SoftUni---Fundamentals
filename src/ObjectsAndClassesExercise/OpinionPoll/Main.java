package ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personalData = sc.nextLine();
            String[] personalDataArray = personalData.split("\\s+");
            int age = Integer.parseInt(personalDataArray[1]);
            if (age > 30) {
                String name = personalDataArray[0];
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person person : personList) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }

        sc.close();
    }

}
