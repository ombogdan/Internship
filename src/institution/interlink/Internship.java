package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    private ArrayList students = new ArrayList();

    public Internship(String name) {

        this.name = name;
    }

    public void addStudent(ArrayList<Student> student) {
        this.students.add(student);
    }

    public String getStudents() {
        return this.students.toString();
    }
}