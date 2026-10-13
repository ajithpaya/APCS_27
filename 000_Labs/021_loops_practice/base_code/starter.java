/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int inf = (int)(Math.random() * 101);
	System.out.println("Welcome to the guessing game!");
	System.out.println("Please guess a number: ");
	int numbar = sc.nextInt();
	while(numbar != inf){
		if (inf < numbar) {
			System.out.println("number is lower");
		}else{
			System.out.println("number is higher");
		}
		System.out.println("Please guess another number: ");
		numbar = sc.nextInt();
	}
	System.out.println("you got the number right");
	

	



		
	}
}
