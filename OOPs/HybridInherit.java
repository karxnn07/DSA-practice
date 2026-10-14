public class HybridInherit {
    public static void main(String args[]) {

        Animal animal = new Animal();
        animal.eat();
        animal.breathe();

        Mammal mammal = new Mammal();
        mammal.walk();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Human human = new Human();
        human.eat();
        human.speak();

        Fish fish = new Fish();
        fish.eat();
        fish.swim();

        Tuna tuna = new Tuna();
        tuna.eat();
        tuna.swim();

        Shark shark = new Shark();
        shark.eat();
        shark.swim();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();

        peacock peacock = new peacock();
        peacock.eat();
        peacock.fly();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Meows");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Speaks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Tuna extends Fish {
    void eat() {
        System.out.println("Eats");
    }
}

class Shark extends Fish {
    void eat() {
        System.out.println("Eats");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}

class peacock extends Bird {
    void eat() {
        System.out.println("Eats");
    }
}