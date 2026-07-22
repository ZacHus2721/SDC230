public class Archer extends Character
{
    public Archer(String name, int level, int health)
    {
        super(name, level, health);
    }

    @Override
    public void attack()
    {
        System.out.println(name + " fires a three arrows at once hit three different targets!");
    }
}