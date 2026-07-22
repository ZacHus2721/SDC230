public class CharacterTest {

    public static void main(String[] args) {

        Character hero = new Character("Aria", 5, 100);

        System.out.println("Character Name: " + hero.name);
        System.out.println("Level: " + hero.level);
        System.out.println("Health: " + hero.health);

        System.out.println();

        Character enemy = new Character("Goblin", 2, 40);

        System.out.println("Character Name: " + enemy.name);
        System.out.println("Level: " + enemy.level);
        System.out.println("Health: " + enemy.health);

        System.out.println();

        Character boss = new Character("Dragon", 20, 500);

        System.out.println("Character Name: " + boss.name);
        System.out.println("Level: " + boss.level);
        System.out.println("Health: " + boss.health);
    }

}