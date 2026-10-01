package OOPs;

public class objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Velora";
        s1.age = 24;
        s1.rollNumber = 7654;
        s1.college = "IIT DElhi";


        s2.name = "Sourav";
        s2.age = 25;
        s2.rollNumber = 7655;
        s2.college = "IIT DElhi";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();

    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name );
    }

    void print() {
         System.out.println(name + "," + rollNumber + "," +college);
    }
}