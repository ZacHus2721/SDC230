public class Wizard extends Creature
{
    public Wizard(String name, int health)
    {
        super(name, health);
    }

    @Override
    public void attack()
    {
        System.out.println("The wizard casts lightning!");
    }
}