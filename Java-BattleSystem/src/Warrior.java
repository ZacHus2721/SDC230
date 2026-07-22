public class Warrior extends Character
{
    public Warrior(String name, int level, int health)
    {
        super(name, level, health);
    }

    @Override
    public void attack()
    {
        System.out.println(name + " charges the enemy and strikes them with his sword, Oathbreaker!");
    }
}