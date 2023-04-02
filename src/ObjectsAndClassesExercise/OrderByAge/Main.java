package ObjectsAndClassesExercise.OrderByAge;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String personData = sc.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!personData.equals("End")) {
            String[] personDataArray = personData.split("\\s+");
            String name = personDataArray[0];
            String ID = personDataArray[1];
            int age = Integer.parseInt(personDataArray[2]);
            Person person = new Person(name, ID, age);
            personList.add(person);
            personData = sc.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            person.print();
        }

        sc.close();
    }

}
