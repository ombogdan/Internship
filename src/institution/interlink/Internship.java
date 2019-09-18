package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    private ArrayList students = new ArrayList();

    public Internship(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList getStudents() {
        return this.students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
