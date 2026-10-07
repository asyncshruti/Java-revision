package OOPs;


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(100);

        System.out.println(ba.getBalance());
    }
    
}
class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    public double getBalance() {
       return balance;
    }

}

class Student1 {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student1(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    //geters and setters----
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getcollege() {
        return college;
    }
    public void setcollege(String college) {
        this.college = college;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getrollNumber() {
        return rollNumber;
    }
    public void setrollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

}   
   




    