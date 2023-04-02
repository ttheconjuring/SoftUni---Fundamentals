package MapLambdaStreamAPIExercise;

import java.util.*;

public class Courses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> coursesStudentsMap = new LinkedHashMap<>();

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] inputArray = input.split(" : ");
            String course = inputArray[0];
            String student = inputArray[1];
            if (!coursesStudentsMap.containsKey(course)) {
                coursesStudentsMap.put(course, new ArrayList<>());
                coursesStudentsMap.get(course).add(student);
            } else {
                coursesStudentsMap.get(course).add(student);
            }
            input = sc.nextLine();
        }

       for (Map.Entry<String, List<String>> stringListEntry : coursesStudentsMap.entrySet()) {
            System.out.println(stringListEntry.getKey() + ": " + stringListEntry.getValue().size());
           for (String s : stringListEntry.getValue()) {
               System.out.printf("-- %s%n", s);
           }
        }

       // ChatGPT
        /* coursesStudentsMap.forEach((key, value) -> {
            System.out.printf("%s: %d%n", key, value.size());
            value.forEach(student -> System.out.printf("-- %s%n", student));
        }); */

        sc.close();
    }

}
