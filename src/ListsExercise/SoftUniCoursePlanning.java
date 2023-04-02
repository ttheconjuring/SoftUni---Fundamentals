package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String command = sc.nextLine();

        String lessonTitle = "";

        while (!command.equals("course start")) {
            String[] commandArray = command.split(":");
            switch (commandArray[0]) {
                case "Add":
                    lessonTitle = commandArray[1];
                    if (!list.contains(lessonTitle)) {
                        list.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    lessonTitle = commandArray[1];
                    int index = Integer.parseInt(commandArray[2]);
                    if (!list.contains(lessonTitle)) {
                        list.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    lessonTitle = commandArray[1];
                    if (list.contains(lessonTitle)) {
                        list.remove(lessonTitle);
                        if (list.contains(lessonTitle + "-Exercise")) {
                            list.remove(lessonTitle + "-Exercise");
                        }
                    }
                    break;
                case "Swap":
                    lessonTitle = commandArray[1];
                    String secondLessonTitle = commandArray[2];
                    if (list.contains(lessonTitle) && list.contains(secondLessonTitle)) {
                        int indexOfTheSecondLessonTitle = list.indexOf(secondLessonTitle);
                        int indexOfTheLessonTitle = list.indexOf(lessonTitle);
                        list.set(indexOfTheSecondLessonTitle, lessonTitle);
                        list.set(indexOfTheLessonTitle, secondLessonTitle);
                        if (list.contains(lessonTitle + "-Exercise")) {
                            int indexOfLessonTitle = list.indexOf(lessonTitle);
                            int indexOfTheExercise = list.indexOf(lessonTitle + "-Exercise");
                            list.add(indexOfLessonTitle + 1, lessonTitle + "-Exercise");
                            list.remove(indexOfTheExercise);
                        }
                        if (list.contains(secondLessonTitle + "-Exercise")) {
                            int indexOfLessonTitle = list.indexOf(secondLessonTitle);
                            int indexOfTheExercise = list.indexOf(secondLessonTitle + "-Exercise");
                            list.add(indexOfLessonTitle + 1, secondLessonTitle + "-Exercise");
                            list.remove(indexOfTheExercise + 1);
                        }
                    }
                    break;
                case "Exercise":
                    lessonTitle = commandArray[1];
                    if (!list.contains(lessonTitle)) {
                        list.add(lessonTitle);
                        list.add(lessonTitle + "-Exercise");
                    } else if (list.contains(lessonTitle) && !list.contains(lessonTitle + "-Exercise")) {
                        list.add(list.indexOf(lessonTitle) + 1, lessonTitle + "-Exercise");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "." + list.get(i));
        }

        sc.close();
    }

}
