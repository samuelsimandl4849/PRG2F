package oop;

public class Student {
    int studentID;
    String name;

    static int studentsCount = 0;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        studentsCount++;
    }

    public String getName() {
        return name;
    }
    static int getStudentsCount(){
        return studentsCount;
    }

    public static void main(String[] args) {
        System.out.println(Student.studentsCount);
        Student a = new Student(1, "Alice");
        System.out.println(a.getName());
        Student b = new Student(2, "Bob");
        System.out.println(Student.studentsCount);
        Student c = new Student(3, "Cyril");
        System.out.println(Student.studentsCount);
    }
}
