// Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades.
// Provide public getter and setter methods to access and modify the student_id and student_name variables.
// However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.


import java.util.ArrayList;
import java.util.List;

class Student {
    private int student_id;
    private String student_name;
    private List < Double > grades;

    public int getStudentId() {
        return student_id;
    }
    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }
    public void getStudentName(String student_name) {
        this.student_name = student_name;
    }

    public List <Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }

}
