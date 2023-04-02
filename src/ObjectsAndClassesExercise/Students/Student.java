package ObjectsAndClassesExercise.Students;

public class Student {

    private String firstName;

    private String lastName;

    private double grade;

    public double getGrade() {
        return this.grade;
    }

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void print() {
        System.out.println(this.firstName + " " + this.lastName + ": " + String.format("%.2f", this.grade));
    }

}
