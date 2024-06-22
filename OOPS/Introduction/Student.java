package OOPS.Introduction;

public class Student {
    int rno;
    float marks;
    String name;

    Student(){
        this.name = "Nalin";
        this.marks = 88.5f;
        this.rno = 1;

    }

    Student(String name, int rno, float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}
