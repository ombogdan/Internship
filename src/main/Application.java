package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.N.U");
        university.addStudent(new Student("Andrew Kostenko", 89));
        university.addStudent(new Student("Julia Veselkina",89));
        university.addStudent(new Student("Maria Perechrest",60));
        university.addStudent(new Student("Bogdan Omelchenko",28));
        university.getStudentsForIntership();
        Internship internship = new Internship("Interlink");

        System.out.println("List of internship's students:");
        System.out.println(university.getStudentsForIntership());
    }
}
//    Завершіть реалізацію логіки додатку таким чином,
//    щоб тільки студенти з рівнем знань (Knowledge) вище середнього (по University) потрапляли на інтернатуру.
//    Студенти можуть бути додані прямо в коді програми (Application.java). Для виконання цього завдання
//    вам необхідно реалізувати наявні методи та додати декілька нових у класи University, Internship та, можливо, інші.
//    композицыя