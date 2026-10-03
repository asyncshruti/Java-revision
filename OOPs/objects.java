package OOPs;

public class objects {
    /*
     * public static void main(String[] args) {
     * Student s1 = new Student();
     * Student s2 = new Student();
     * 
     * s1.name = "Velora";
     * s1.age = 24;
     * s1.rollNumber = 7654;
     * s1.college = "IIT DElhi";
     * 
     * 
     * s2.name = "Sourav";
     * s2.age = 25;
     * s2.rollNumber = 7655;
     * s2.college = "IIT DElhi";
     * 
     * s1.markAttendance();
     * s2.markAttendance();
     * 
     * s1.print();
     * s2.print();
     * 
     * }
     * }
     * 
     * class Student {
     * String name;
     * int age;
     * int rollNumber;
     * String college;
     * 
     * void markAttendance() {
     * System.out.println("Attendance marked by " + name );
     * }
     * 
     * void print() {
     * System.out.println(name + "," + rollNumber + "," +college);
     * }
     * 
     */
    /*
     * //call by value
     * public static void main(String[] args) {
     * 
     * int x = 4;
     * int y = 5;
     * 
     * System.out.println(x + "," + y);
     * addTen(x,y);
     * 
     * System.out.println(x + "," + y);
     * 
     * 
     * static void addTen(Random r) {
     * r.x = r.x + 10;
     * r.y = r.y + 10;
     * 
     * 
     * }
     */

    // call by reference---
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);

        System.out.println(r1.x + "," + r1.y);
        addTen(r1);

        System.out.println(r1.x + "," + r1.y);
    }

    static void addTen(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;

    }
}
    class Random {
        int x;
        int y;

        Random(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
//call by reference ---> There is no call by reference in java.