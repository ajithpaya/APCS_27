/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {

	public static void main(String args[]) {

		while(true){
				Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the Ajith ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int choice = sc.nextInt();
		sc.nextLine();
			if(choice == 1){
			BankAccount ba = new BankAccount();
			ba.displayAccountInfo();
			}else if(choice == 2){
				System.out.println("Enter Owner Name");
				String ownerName = sc.nextLine();
				BankAccount ba1 = new BankAccount(ownerName);
				ba1.displayAccountInfo();
			}else if(choice == 3){
				System.out.println("What is the name of the owner of this bank account? ");
				String ownerName1 = sc.nextLine();
				double balance1 = sc.nextDouble();
				BankAccount ba2 = new BankAccount(ownerName1, balance1);
				ba2.displayAccountInfo();
			}else{
				break;
			}
		}
	}
}
