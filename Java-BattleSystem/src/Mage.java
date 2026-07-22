public class Mage extends Character
{
    public Mage(String name, int level, int health)
    {
        super(name, level, health);
    }

    @Override
    public void attack()
    {
        System.out.println(name + " summons a meteor storm that lights up the entire battlefield!");
    }
}