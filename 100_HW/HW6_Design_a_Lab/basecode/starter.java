/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
	System.out.println("Would you like to be apart of Earth Clan, Water Clan, or Fire Clan, Wind Clan? ");
	String option = sc.nextLine();


	if (option.equalsIgnoreCase("Earth")){
		System.out.println("You've chosen the Earth! Very Grounding");
		System.out.println("How many continents are on Earth?");
		int pred = sc.nextInt();
		if (pred == 7) {
			System.out.println("yes! There is 7");
		 } else {
			System.out.println("No, there is 7.");
		 }
	}

	if (option.equalsIgnoreCase("Water")){
		System.out.println("You've chosen the Water! How Thirsty ");
		System.out.println("Name a  state of matter of water:");
		String state = sc.nextLine();
		if (state.equalsIgnoreCase("ice") || state.equalsIgnoreCase("water") || state.equalsIgnoreCase("steam")) {
			System.out.println("Correct!");
		} else {
			System.out.println("no, it has to be ice, water, steam.");
		}
            
	}
	if (option.equalsIgnoreCase("Fire")){
		System.out.println("You've chosen the Fire! Very Hot!");  
		System.out.println("What is the boiling point of water in ?");
		int temparure = sc.nextInt();
		if (temparure == 100) {
			System.out.println("Correct! It's 100");
		} else {
			System.out.println("no, it is 100");
		}
    }
    if (option.equalsIgnoreCase("Wind")){
		System.out.println("You've chosen the Wind! How Breezy!");  
		int numb = (int) (Math.random() * 100) + 1;
		System.out.println("Guess a number from 1 to 100:");
		int predic = sc.nextInt();
		if (predic == numb) {
			System.out.println("You are right the number is " + numb);
		} else {
			System.out.println("No it was " + numb );

		
    
		}
		}
}
}
