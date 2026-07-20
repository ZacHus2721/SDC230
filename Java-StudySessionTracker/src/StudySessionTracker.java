import java.util.Scanner;

public class StudySessionTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("How many study sessions did you complete? ");
		int sessions = input.nextInt();
		
		int totalMinutes = 0;
		
		for (int i = 1; i <= sessions; i++)
		{
		    System.out.print("Enter minutes studied in session " + i + ": ");
		    int minutes = input.nextInt();
		    totalMinutes = totalMinutes + minutes;
		}
		
		System.out.println("Total study time: " + totalMinutes + " minutes");
		
		double average = (double) totalMinutes / sessions;
		System.out.println("Average study time: " + average + " minutes");
		
		 input.close();
	}
		public static void showMessage(int totalMinutes)
		{
		    if (totalMinutes >= 180)
		    {
		        System.out.println("Excellent work! That is a strong study day.");
		    }
		    else if (totalMinutes >= 90)
		    {
		        System.out.println("Nice job! You put in solid study time.");
		    }
		    else
		    {
		        System.out.println("Keep building the habit. Every minute counts.");
		    }
		    
		    showMessage(totalMinutes);
	}
}
