/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a integer: ");
		int numone = sc.nextInt();
		if (numone % 3 == 0 && numone % 4 == 0 &&  numone % 5 == 0) {
			System.out.println(numone + " is  divisible by 3, 4, or 5!");
		}
		else{
			System.out.println(numone + " is not divisible by 3, 4, or 5!");
		}

		System.out.println("Please enter a second integer: ");
		int numtwo = sc.nextInt();
		if (numtwo % 3 == 0 && numtwo % 4 == 0 &&  numtwo % 5 == 0) {
			System.out.println(numtwo + " is  divisible by 3, 4, or 5!");
		}
		else{
			System.out.println(numtwo + " is not divisible by 3, 4, or 5!");
		}


	}
	}

