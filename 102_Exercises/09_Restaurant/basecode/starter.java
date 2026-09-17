/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("            WELCOME RESTAURANT OWNER!            ");
        System.out.println("=================================================");
		System.out.println("what is the name of your restaurant");
		String rest = sc.nextLine();
		System.out.println("what is your name");
		String name = sc.nextLine();
		System.out.println("Great to see you," + name + "! Let's set up a menu for " + name);
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");

		System.out.println("--- Item #1 ---");
		System.out.println("item name:");
		String oneitem = sc.nextLine();
		System.out.println("Price of " + oneitem + "($):");
		double oneitemprice = sc.nextDouble();
		System.out.println("How many " + oneitem + " would you like?");
		int itemonequant = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemonequant + "x" + oneitem + " to your order" + " $" + itemonequant * oneitemprice);

		System.out.println("--- Item #2 ---");
		System.out.println("item name:");
		String twoitem = sc.nextLine();
		System.out.println("Price of " + twoitem + "($):");
		double twoitemprice = sc.nextDouble();
		System.out.println("How many " + twoitem + " would you like?");
		int itemtwoquant = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemtwoquant + "x" + twoitem + " to your order" + " $" + itemtwoquant * twoitemprice);

		System.out.println("--- Item #3 ---");
		System.out.println("item name:");
		String threeitem = sc.nextLine();
		System.out.println("Price of " + threeitem + "($):");
		double threeitemprice = sc.nextDouble();
		System.out.println("How many " + threeitem + " would you like?");
		int itemthreequant = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemthreequant + "x" + threeitem + " to your order" + " $" + itemthreequant * threeitemprice);

		System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20):");
		double tip = sc.nextDouble();
//  alex p helped with recipt we did tg on call
		System.out.println("=================================================");    
        System.out.println("              "+ rest +"- Menu For Today               ");
        System.out.println("=================================================");
        System.out.println("Owner: " + name);
        System.out.println("-------------------------------------------------");
        System.out.println("Item                Qty     Price");
        System.out.println("-------------------------------------------------");
        System.out.println(oneitem +"                " + itemonequant + "     " +  oneitemprice );
        System.out.println(twoitem +"                " + itemtwoquant + "     " +  twoitemprice );
        System.out.println(threeitem +"                " + itemthreequant + "     " +  threeitemprice );
        System.out.println("-------------------------------------------------");
        double total = (oneitemprice * itemonequant) + (twoitemprice * itemtwoquant) + (threeitemprice * itemthreequant);
        System.out.println("Subtotal:                " + total);
        double tipdecimal = tip * 0.01;
        double tipsubmount = total * tipdecimal;
        System.out.println("Tip (" + tip + "%):         " + tipsubmount);
        double taxsubmount = (0.01 * 9.75) * total;
        System.out.println("Tax (9.75%):           " + taxsubmount);
        System.out.println("=================================================");
        System.out.println("TOTAL:           $"  + (tipsubmount + taxsubmount));
        System.out.print("=================================================");









		
	}
}
