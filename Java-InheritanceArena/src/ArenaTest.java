public class ArenaTest
{
    public static void main(String[] args)
    {
        Warrior hero = new Warrior("Thorn", 8, 150);
        Mage wizard = new Mage("Lyra", 10, 90);
        Rogue assassin = new Rogue("Sven", 6, 180);
        hero.attack();
        wizard.castSpell();
        assassin.stealth();
    }
}