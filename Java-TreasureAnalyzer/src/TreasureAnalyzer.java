import java.util.Scanner;

public class TreasureAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many treasure chests were opened? ");
        int numChests = input.nextInt();

        int[] treasure = new int[numChests];

        for (int i = 0; i < treasure.length; i++) {
            System.out.print("Enter the gold value for chest " + (i + 1) + ": ");
            treasure[i] = input.nextInt();
        }

        TreasureAnalyzer analyzer = new TreasureAnalyzer();

        int total = analyzer.calculateTotal(treasure);
        double average = analyzer.calculateAverage(total, treasure.length);
        int highest = analyzer.findHighestValue(treasure);

        System.out.println("\nTreasure Summary");
        System.out.println("Total treasure collected: " + total);
        System.out.println("Average treasure value: " + average);
        System.out.println("Most valuable chest: " + highest);

        input.close();
    }

    public int calculateTotal(int[] treasure) {
        int total = 0;

        for (int value : treasure) {
            total += value;
        }

        return total;
    }

    public double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public int findHighestValue(int[] treasure) {
        int highest = treasure[0];

        for (int value : treasure) {
            if (value > highest) {
                highest = value;
            }
        }

        return highest;
    }
}