/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int btz = (int)(Math.random()*1000)+1;
		System.out.println("Pick any number 1 - 1000");
		int bt = sc.nextInt();

		if(bt == btz){
			System.out.println("You got it correct");
		}
		else{
			System.out.print("You got it wrong The number was " + btz);
		}


		
	}
}
