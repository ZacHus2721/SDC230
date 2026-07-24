import java.util.ArrayList;

public class CreatureTest {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Smolder", 120);
        Knight knight = new Knight("Sir Codealot", 100);
        Goblin goblin = new Goblin("Grimtooth", 60);

        ArrayList<Creature> creatures = new ArrayList<>();

        creatures.add(dragon);
        creatures.add(knight);
        creatures.add(goblin);

        System.out.println("=== Battle Arena ===");

        for (Creature creature : creatures) {
            creature.attack();
        }
    }
}