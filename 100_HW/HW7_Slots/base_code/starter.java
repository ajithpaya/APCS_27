/*
 *	Author:
 *  Date:
 * 	Collaborator(s):  alex poledian
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
	while (money > 0) {
		System.out.print("Would you like to play the slots?");
		String pa = sc.nextLine();
	if (pa.equals("Yes")){
		System.out.print("You have $" + money + ". How much would you like to wager? ");
		int wager = sc.nextInt();
		sc.nextLine();

		money = money - wager;
		int num1 = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		int num3 = (int)(Math.random() * 10) + 1;
		System.out.println("Your rolls are: ");
		System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");

		if (num1 == num2 || num1 == num3 || num2 == num3) {
			money = money + wager * 2;
			System.out.println("You won! Your wager has now been doubled!");
			} else {
			System.out.println("Didn't win this time, better luck next time!");
				}
			System.out.println("You now have $" + money + ".");
			System.out.println("--------------------------------------------------");

			} else if ( pa.equals("no")) {
				System.out.println("Thanks for playing! You have  $" + money );

				break;
			}
		}
 
		if (money == 0) {
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			}
	}
}
