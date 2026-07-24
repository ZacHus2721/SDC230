import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create objects
        Dragon dragon = new Dragon("Smaug", 120);
        Knight knight = new Knight("Sir Lancelot", 100);
        Wizard wizard = new Wizard("Dumbledore", 80);
        Goblin goblin = new Goblin("Ranrok", 60);

        // Create an ArrayList of Creature objects
        ArrayList<Creature> arena = new ArrayList<>();

        // Add all creatures to the list
        arena.add(dragon);
        arena.add(knight);
        arena.add(wizard);
        arena.add(goblin);

        // Demonstrate polymorphism
        System.out.println("=== Battle Arena ===");
        for (Creature c : arena) {
            c.attack();
        }
    }
}