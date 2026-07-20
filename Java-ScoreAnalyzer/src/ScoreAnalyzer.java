import java.util.Scanner;

public class ScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("How many training scores will you enter? ");
		int count = input.nextInt();	
		
		int[] scores = new int[count];
		
		for (int i = 0; i < scores.length; i++)
		{
		    System.out.print("Enter score #" + (i + 1) + ": ");
		    scores[i] = input.nextInt();
		}
		
		int total = 0;

		for (int i = 0; i < scores.length; i++)
		{
		    total += scores[i];
		}
		
		double average = (double) total / scores.length;

		System.out.println("Total score: " + total);
		System.out.println("Average score: " + average);
		
		int highest = scores[0];

		for (int i = 1; i < scores.length; i++)
		{
		    if (scores[i] > highest)
		        highest = scores[i];
		}

		System.out.println("Highest score: " + highest);

	}

}
