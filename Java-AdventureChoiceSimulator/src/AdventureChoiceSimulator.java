import java.util.Scanner;

public class AdventureChoiceSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("You arrive at a cave.");
		System.out.println("1 - Enter the cave");
		System.out.println("2 - Walk away");
		
		System.out.print("\nEnter your choice(1 or 2) ");
		int choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println("You enter the cave, " + name);
			}
		else if (choice == 2) {
			System.out.println("You walk away, " + name); 
			}
		else {
			System.out.println("Invalid answer.");
		}
		input.close();
	}

}
