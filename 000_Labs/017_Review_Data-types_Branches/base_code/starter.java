/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String name = sc.nextLine();
		 System.out.println("What is your title? Ex: Slayer of Dragons");
		 String role = sc.nextLine();
		 System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
	String option = sc.nextLine();
	if (option.equalsIgnoreCase("Wizard")){
		System.out.println("You've chosen the Wizard! Excelsior!");
	}

	if (option.equalsIgnoreCase("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
	}
	if (option.equalsIgnoreCase("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");
	}

	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
	System.out.println("Strength (1-10): ");
	int str = sc.nextInt();
	System.out.println("Dexterity (1-10): ");
	int dex = sc.nextInt();
	System.out.println("Intelligence (1-10): ");
	int intel = sc.nextInt();
	System.out.println("Charisma (1-10): ");
	int charisma = sc.nextInt();

	System.out.println("--------------------------------------------------");
	System.out.println("You're a wizard with the following stats! Strength -" + str +"Dexterity -" + dex + "Intelligence -" + intel + "Charisma -" + charisma );
	}
}
