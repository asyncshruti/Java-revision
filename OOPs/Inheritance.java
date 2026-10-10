package OOPs;
//1. single inheritance---
/* 
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
 */
  /*   
//2.hierachical inheritance---
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

*/

//MULTI LEVEL inheritance---
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
class equilatralTriangle extends triangle {
    int side ;
    

}
