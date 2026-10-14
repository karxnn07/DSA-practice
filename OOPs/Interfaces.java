public class Interfaces {
   public static void main(String args[]) {

    // Queen queen = new Queen();
    // queen.moves();

    Bear bear = new Bear();
    bear.eatsPlant();
    bear.eatsMeat();

   } 
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal(in all Directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal(in all Directions by 1 step only)");
    }
}

interface Herbivore{
    void eatsPlant();
}

interface Carnivore{
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatsPlant() {
        System.out.println("Bear eats plants");
    }
    public void eatsMeat() {
        System.out.println("Bear eats meat");
    }
}