package org.example;

public class Main {
    public static void main(String[] args) {

        Student person = new Student("Violet");
        Message.getMessage(person);
        person.addGrade(5, 80);
        person.getGradeLevel();

        System.out.println(" ");

        Student nextPerson = new Student("Sally", 900, 7, 3.0);
        nextPerson.addGrade(3, 70);
        nextPerson.addGrade(4, 80);
        nextPerson.getGradeLevel();

        Student newStudent = new Student("Marshall");
        newStudent.addGrade(2,100);
        Message.getMessage(newStudent);
        newStudent.getGradeLevel();
    }
}