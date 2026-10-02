/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		int c = (int)(Math.random() * 3)+1;

		if (c == 1){
			System.out.println("It's a furry animal!");
			System.out.println("What is your guess?");
			String animal = sc.nextLine();
		
		if (animal.equalsIgnoreCase("cat")){
			System.out.println("You got it! Woo!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's a feline friend!");
			sc.nextLine();
			String animal2 = sc.nextLine();

			if (animal2.equalsIgnoreCase("cat")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't guess it right the answer was cat");

		}
		}
		}



		if (c == 2){
			System.out.println("It's a fruit!");
			System.out.println("What is your guess?");
			String fruit = sc.nextLine();
		
		if (fruit.equalsIgnoreCase("apple")){
			System.out.println("You got it! Woo!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's a red fruit!!");
			sc.nextLine();
			String fruit2 = sc.nextLine();

			if (fruit2.equalsIgnoreCase("apple")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't guess it right the answer was apple");

		}
		}
		}
		 


if (c == 3){
			System.out.println("It's a planet in our solar system!");
			System.out.println("What is your guess?");
			String planet = sc.nextLine();

		if (planet.equalsIgnoreCase("earth")){
			System.out.println("You got it! Woo!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's the only one with humans on it!!");
			sc.nextLine();
			String planet2 = sc.nextLine();

			if (planet2.equalsIgnoreCase("earth")){
				System.out.println("You got it! Woo!");
}
			else{
				System.out.println("You sadly didn't guess it right the answer was earth");
			}






		}

}
		}
	}

		
	
	