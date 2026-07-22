public class BattleTest
{
    public static void main(String[] args)
    {
        Warrior hero = new Warrior("Thorn", 8, 150);
        Mage wizard = new Mage("Lyra", 10, 90);
        Rogue scout = new Rogue("Shade", 7, 80);
        Archer ranger = new Archer("Hawkeye", 9, 95);

        Warrior boss = new Warrior("White Beard", 99, 5000);

        hero.attack();
        wizard.attack();
        scout.attack();
        ranger.attack();

        System.out.println();

        boss.attack();
        System.out.println("The ground quakes as White Beard uses the Tremor-Tremor fruit, shaking the entire kingdom!");
    }
}