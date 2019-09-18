package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<Student>();
    private String name;

    public University(String name) {
        this.name = name;
    }


    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudentsForIntership() {
        int middleKnowledge = getMiddleKnowledge();
        ArrayList<Student> studentsForIntership = new ArrayList<>();
        for (int i = 0; i < this.students.size(); i++) {
            if (middleKnowledge < this.students.get(i).getKnowledge().getLevel()) {
                studentsForIntership.add(students.get(i));
            }
        }
        return studentsForIntership;
    }

    private int getMiddleKnowledge() {
        int sumOfKnowledge = 0;
        if (this.students.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.students.size(); i++) {
                sumOfKnowledge += students.get(i).getKnowledge().getLevel();
            }
            return sumOfKnowledge / this.students.size();
        }
    }
}