public class Goblin extends Creature {

    public Goblin(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " stabs with a rusty dagger!");
    }
}