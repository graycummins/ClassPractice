package org.example;

public class Student {
    public String name;
    public static int nextStudentId = 1;
    private int studentId;
    private double studentCredits;
    private double finalGpa;
    public double creditsTaken;
    private double enteredGpa;
    private double enteredCredits;

    public Student(String aName, int studentId, int credits, double finalGpa) {
        this.name = aName;
        this.studentId = studentId;
        this.enteredCredits = credits;
        this.enteredGpa = finalGpa;
    }
    public Student(String aName, int studentId) {
        this(aName, studentId, 0, 0);
    }
    public Student(String aName) {
        this(aName, nextStudentId);
        nextStudentId++;
    }
    public void addGrade(double credits, double grade)
    {
        double studentGrade;
        if(grade>=60 && grade<70) {
            studentGrade=1;
        } else if (grade>=70 && grade<80) {
            studentGrade=2;
        } else if (grade>=80 && grade<90) {
            studentGrade=3;
        } else if (grade>=90) {
            studentGrade=4;
        }else {
            studentGrade=0;
        }
        studentCredits+=credits;
        creditsTaken+=(credits*studentGrade);
    }

    public void getGradeLevel() {
        String msg1;
        String msg2;
        String msg3;
        String msg4;
        String msg5;

        finalGpa = creditsTaken/studentCredits;
        if (enteredGpa!= 0.0) {
            finalGpa+=enteredGpa;
            finalGpa/=2;
        }


        if(finalGpa>4.0){
            finalGpa=4.0;
        }
        msg2 = "Your studentId is " +studentId;
        msg3 = "You earned " +(studentCredits+enteredCredits)+ " credits";
        msg4 = "Your gpa is " +finalGpa;
        if (finalGpa<=1.0)
        {
            msg4+=", and you have to retake the 1st grade";
        } else if (finalGpa<=2.0 && finalGpa>1.0)
        {
            msg4+=", and you have to retake the 1st grade. You almost passed!";
        }else if (finalGpa<=3.0 && finalGpa>2.0) {
            msg4 += ", and you passed the 1st grade. Congrats!";
        }else if (finalGpa<=4.0 && finalGpa>3.0)
        {
            msg4+=". You get to move into the 3rd grade for your outstanding GPA!";
        }
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
    }
}
