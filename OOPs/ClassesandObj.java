// Classes & objects in java:

public class ClassesandObj {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Karan";
        s1.roll = 43;
        s1.password = "abc123";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   // Deep copy constructor is called here.
        s2.password = "xyz123";          // Changing password of s2 won't affect s1.
        s1.marks[2] = 75;                // Changing marks of s1 won't affect s2.
        // for (int i = 0; i < s2.marks.length; i++) {
            // System.out.println(s2.marks[i]);
        // }

        Animal animal = new Animal();
        animal.eat();
        animal.breathe();

        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.breathe();  

        // Fish fish = new Fish(); 
        // fish.eat();
        // fish.breathe();
        // fish.Swim();

        // Bird bird = new Bird();
        // bird.eat();
        // bird.breathe();
        // bird.fly();
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow copy constructor:
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor:
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        // System.out.println("Constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    void setName(String newName) {
        name = newName;
    }

    void setRoll(int newRoll) {
        roll = newRoll;
    }

    void setMarks(int[] newMarks) {
        marks = newMarks;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

// Base class:
class Animal {
    String color;

    void eat() {
        System.out.println("Animal eats...");
    }

    void breathe() {
        System.out.println("Animal breathes...");
    }
}

// Derived classes:
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks...");
    }
}

class Fish extends Animal {
    void Swim() {
        System.out.println("Fish swims...");
    }
}

class Bird extends Animal {
    void fly () {
        System.out.println("Bird flies...");
    }
}
