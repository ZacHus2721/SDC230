import java.util.Scanner;

public class PortalScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("A number emerges from the portal... enter its value: ");
		int number = input.nextInt();
		
		if(number > 0)
		{
		    System.out.println("The scanner detects: POSITIVE REALM.");
		}
		else if(number < 0)
		{
		    System.out.println("The scanner detects: NEGATIVE REALM.");
		}
		else
		{
		    System.out.println("The scanner detects: THE VOID.");
		}
	}

}
