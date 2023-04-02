package ObjectsAndClassesExercise.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Student[] array = new Student[n];

        for (int i = 0; i < n; i++) {
            String studentData = sc.nextLine();
            String[] studentDataArray = studentData.split("\\s+");
            String firstName = studentDataArray[0];
            String lastName = studentDataArray[1];
            double grade = Double.parseDouble(studentDataArray[2]);
            array[i] = new Student(firstName, lastName, grade);
        }

        Arrays.sort(array, Comparator.comparing(Student::getGrade).reversed());

        for (Student student : array) {
            student.print();
        }

        sc.close();
    }

}
