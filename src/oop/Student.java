package oop;

public class Student {
    private int studentID;
    private String name;
    static int studentsCount = 0;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        studentsCount++;
    }

    public String getName() {
        return name;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public static void main(String[] args) {
        System.out.println(Student.studentsCount);
        Student a = new Student(44, "Alice");
        System.out.println(a.getName());
        Student c = new Student(41, "Bob");
        System.out.println(Student.studentsCount);
        Student b = new Student(98, "Cyril");
        System.out.println(Student.studentsCount);
    }
}
