/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?: ");
		String name = sc.nextLine();
		System.out.println("How old are you?: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("What month are you born on?: ");
		String month = sc.nextLine();
		System.out.println("What day were are you born on?: ");
		int day = sc.nextInt();
		System.out.println("What year were you born on?: ");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?: ");
		double buck = sc.nextDouble();

		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You are born in " + month);
		System.out.println("You are born in " + year);
		System.out.println("You think a buck fifty is $" + buck);


	}
}
