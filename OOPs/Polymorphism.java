public class Polymorphism {
    public static void main(String args[]) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)2.5));
        // System.out.println(calc.sum(1, 2, 3));

        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal {
    // Function Overriding: Same function name amd parameters in parents and the child class.
    void sound() {
        System.out.println("Animal makes a Sound.");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Calculator {
    // Function Overloading: same function name with different parameters
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
}
