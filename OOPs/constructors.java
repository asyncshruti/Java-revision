package OOPs;

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();


        s1.name = "Velora";
        s1.age = 24;
        s1.rollNumber = 7654;
        s1.college = "IIT DElhi";

        // constructor ---

        //default values---
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // int x = 4; // local variable ---no default values

        /*
        Integer -- 0
        float-- 0.0
        boolean --false
        String-- null
         */
    }
}

class Student {
    String name; // infor/char/dat----->instance variables
    int age;
    int rollNumber;
    String college;

    //default constructor---

    Student() {

    }

    void markAttendance() { // behaviour --> function --> instance methods
        System.out.println("Attendance marked for student " + name);
    }

    // this keyword

    // class Student1 {
    //     String name;
    //     int age;
    //     int rollno;
    //     String college;

    //     Student1(String name, int age, int rollno, String college);
    // }

}
