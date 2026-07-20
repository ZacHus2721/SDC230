import java.util.Scanner;

public class TrainingArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);

		System.out.print("Enter score for training session 1: ");
		int score1 = input.nextInt();

		System.out.print("Enter score for training session 2: ");
		int score2 = input.nextInt();
		
		int total = calculateTotal(score1, score2);
		double average = calculateAverage(total);

		System.out.println("Total Score: " + total);
		System.out.println("Average Score: " + average);

		showLevel(average);
		
	}
	public static int calculateTotal(int a, int b)
	{
	    return a + b;
	}
	public static double calculateAverage(int total)
	{
	    return (double) total / 2;
	}
	public static void showLevel(double average)
	{
	    if (average >= 90)
	        System.out.println("Elite training level!");
	    else if (average >= 70)
	        System.out.println("Solid training performance.");
	    else
	        System.out.println("More training required.");
	}
}
