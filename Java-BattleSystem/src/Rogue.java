public class Rogue extends Character
{
    public Rogue(String name, int level, int health)
    {
        super(name, level, health);
    }

    @Override
    public void attack()
    {
        System.out.println(name + " fades into the shadows and attacks from behind!");
    }
}