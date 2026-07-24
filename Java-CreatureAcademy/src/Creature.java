public class Creature {

    private String name;
    private int health;

    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}