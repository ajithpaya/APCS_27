/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Pick number one"); 	
		int  numone = sc.nextInt();

		System.out.println("Pick number two");
		int  numtwo = sc.nextInt();

		System.out.println("Pick number three");
		int  numthree = sc.nextInt();

		if (numone > numtwo && numone > numthree){
			System.out.println(numone + " is your largest number");
		}
		if (numone < numtwo && numone < numthree){
			System.out.println(numone + " is your smallest number");
		}

		

		if (numtwo > numone && numtwo > numthree){
			System.out.println(numtwo + " is your largest number");
		}
		if (numtwo < numone && numtwo < numthree){
			System.out.println(numtwo + " is your smallest number");
		}


		if (numthree > numone && numthree > numtwo){
			System.out.println(numthree + " is your largest number");
		}
		if (numthree < numone && numthree < numtwo){
			System.out.println(numtwo + " is your smallest number");
		}





	}
}
