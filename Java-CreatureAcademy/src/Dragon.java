public class Dragon extends Creature {

    public Dragon(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " breathes fire!");
    }
}