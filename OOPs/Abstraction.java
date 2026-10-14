public class Abstraction {
    public static void main (String args[]) {

        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang

        // Horse horse = new Horse();
        // horse.eats();
        // horse.walks();
        // System.out.println(horse.color);
        
        // Chicken chicken = new Chicken();
        // chicken.walks();
    }
}

abstract class Animal {
    String color;
    Animal() {
       System.out.println("Animal constructor is called");
    }

    void eats() {
        System.out.println("Animal eats...");
    }
    abstract void walks();
}

class Horse extends Animal {
   Horse() {
     System.out.println("Horse constructor is called");
   }
    void changecolor() {
        color = "white";
    }
    void walks() {
        System.out.println("Horse Walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {
    void walks() {
        System.out.println("Chicken walks on 2 legs.");
    }
}
