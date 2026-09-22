/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int inte = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int biggerint = sc.nextInt();
		System.out.println("Your range is " + inte + " to " + biggerint);
		System.out.println("Here are " + biggerint + "generated in that range.");
		int rand = (int)(Math.random()*(biggerint-inte) + inte);
		System.out.println(rand);
		rand = (int)(Math.random()*(biggerint-inte) + inte);
		System.out.println(rand);
		rand = (int)(Math.random()*(biggerint-inte) + inte);
		System.out.println(rand);
		rand = (int)(Math.random()*(biggerint-inte) + inte);
		System.out.println(rand);
		rand = (int)(Math.random()*(biggerint-inte) + inte);
		System.out.println(rand);
		



	}
}
