import java.util.List;

public class StudentCaller {
    public static void main(String[] args) {
        // Creating Object of Student
        Student s1 =  new Student();

        // Setting values
        s1.setStudentId(1);
        s1.getStudentName("Abc");

        // Add grades using addGrade() method
        s1.addGrade(90.02);
        s1.addGrade(36.50);
        s1.addGrade(88.88);

        // Getting the values using getter method
        int s1id = s1.getStudentId();
        String s1name = s1.getStudentName();
        List < Double > grades = s1.getGrades();

        // Printing the values
        System.out.println("Student ID: " + s1id);
        System.out.println("Student Name: " + s1name);
        System.out.println("Grades: " + grades);
    }
}
