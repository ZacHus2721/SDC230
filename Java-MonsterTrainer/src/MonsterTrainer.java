import java.util.Scanner;

public class MonsterTrainer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monster's name: ");
        String name = input.nextLine();

        System.out.print("Enter the first training score: ");
        int score1 = input.nextInt();

        System.out.print("Enter the second training score: ");
        int score2 = input.nextInt();

        MonsterTrainer trainer = new MonsterTrainer();

        int total = trainer.calculateTotal(score1, score2);
        double average = trainer.calculateAverage(total);

        System.out.println("\nMonster: " + name);
        System.out.println("Total Power: " + total);
        System.out.println("Average Score: " + average);

        trainer.showPowerLevel(average);

        input.close();
    }

    public int calculateTotal(int score1, int score2) {
        return score1 + score2;
    }

    public double calculateAverage(int total) {
        return total / 2.0;
    }

    public void showPowerLevel(double average) {
        if (average >= 90) {
            System.out.println("Power Level: Legendary Monster");
        } else if (average >= 75) {
            System.out.println("Power Level: Battle Ready");
        } else if (average >= 60) {
            System.out.println("Power Level: Still Training");
        } else {
            System.out.println("Power Level: Needs More Snacks and Practice");
        }
    }
}