import java.util.Scanner;
	
public class SnackShopLoyaltyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.println("What is your purchase amount: ");
		int purchaseAmount = input.nextInt();
		
		int discountPercent = getDiscountPercent(purchaseAmount);

		double discountAmount = purchaseAmount * (discountPercent / 100.0);
		double finalTotal = purchaseAmount - discountAmount;

		System.out.println("Discount: " + discountPercent + "%");
		System.out.println("Discount amount: $" + discountAmount);
		System.out.println("Final total: $" + finalTotal);
		
		System.out.println("\nPurchase Summary");
		System.out.println("Customer: " + name);
		System.out.println("Purchase Amount: $" + purchaseAmount);
		System.out.println("Discount: " + discountPercent + "%");
		System.out.println("Final Total: $" + finalTotal);
	}
	
	public static int getDiscountPercent(double purchaseAmount) {
	    if (purchaseAmount < 10.00) {
	        return 0;
	    } else if (purchaseAmount < 20.00) {
	        return 10;
	    } else {
	        return 15;
	    }
	}
}
