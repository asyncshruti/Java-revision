package OOPs;

public class polymospishm {

    // compile time poly...----
    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displatInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

}

// run time poly...---

class shape {
    public void area() {
        System.out.println("Display area of shape");
    }
}

class triangle extends shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * h * b);
    }
}
class circle extends shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}