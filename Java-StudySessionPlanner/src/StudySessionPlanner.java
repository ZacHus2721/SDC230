import java.util.Scanner;

public class StudySessionPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("How many assignments do you need to complete ");
		int assignments = input.nextInt();
		
		if (assignments == 1 || assignments == 2) {
		    System.out.println(name + ", Light study session recommended.");
		} else if (assignments == 3 || assignments == 4) {
		    System.out.println(name + ", Focused study session recommended.");
		} else {
		    System.out.println(name + ", Intense study session recommended. Bring snacks.");
		}
		
		String studyPlan;

		if (assignments == 1 || assignments == 2) {
		    studyPlan = "Light study session recommended.";
		} else if (assignments == 3 || assignments == 4) {
		    studyPlan = "Focused study session recommended.";
		} else {
		    studyPlan = "Intense study session recommended. Bring snacks.";
		}
		
		input.close();
	}
	public static int calculateStudyHours(int assignments) {
	    int studyHours = assignments * 2;
	    return studyHours;  
	}
}
