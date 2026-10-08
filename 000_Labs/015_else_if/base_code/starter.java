/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int num = sc.nextInt();
		int a = (int) (Math.random() * 1000) + 1;

		if (num == a){
			System.out.println("You got it right the number was " + a);
		}

		if (num > a){
			System.out.println("Your number was bigger than the number. The number was " + a );
		}
		if (num < a){
			System.out.println("Your number was smaller than the number. The number was " + a);
		}

	}
}
