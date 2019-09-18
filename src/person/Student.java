package person;

import person.consciousness.Knowledge;

import java.util.ArrayList;

public class Student {
    private final String fullName;
    private Knowledge knowledge;
    private int level;

    public Student(String fullName) {
        this.fullName = fullName;
        this.knowledge = new Knowledge(0);
    }

    public Student(String fullName, Knowledge knowledge) {
        this.fullName = fullName;
        this.knowledge = knowledge;
    }

    public Student(String fullName, int level) {
        this.fullName = fullName;
        this.knowledge = new Knowledge(level);
    }


    public Knowledge getKnowledge() {
        return knowledge;
    }
}