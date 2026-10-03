package OOPs;

public class Final {

    /* 
    public static void main(String[] args) {
        
        Student s1 = new Student("Shruti", 21, 23456);
        Student s2 = new Student("Shruti", 21, 23456);

        // Student.college = "IIT Delhi";

        System.out.println(s1.name + "," + s1.age + "," + s1.rollNumber + "," + Student.college);
        System.out.println(s2.name + "," + s2.age + "," + s2.rollNumber + "," + Student.college);

    }

}
class Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    //static block;
    static {
        college = "IIT DELHI";
    }
 */
/* 
    public static void main(String[] args) {
        Random1 r1 = new Random1();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
// Final f1 = new Final();
// f1.main;
// final.main()

}
class Random1 {
    final double PI;
    Random1() {
        this.PI = 3.14;

    }
*/
    public static void main(String[] args) {
        System.out.println("Number of arguments are" + args.length);

        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + "=" + args[i]);
        }
        //java Final input.txt output.txt
        // java final
    }
    
}


