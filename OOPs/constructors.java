package OOPs;

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();

        //default values---
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        int x = 4; // local variable ---no default values

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

    void markAttendance() { // behaviour --> function --> instance methods
        System.out.println("Attendance marked for student " + name);
    }

}
