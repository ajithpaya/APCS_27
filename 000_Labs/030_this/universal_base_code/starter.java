/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
				PooleDwarf d1 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d2 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d3 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d4 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d5 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d6 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
				PooleDwarf d7 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
			String firstName = d1.getName();
		int duplicates = 0;

if(d2.isSameName(firstName)){
		duplicates++;
}
if(d3.isSameName(firstName)){
	duplicates++;
}
if(d4.isSameName(firstName)){
	duplicates++;
}
if(d5.isSameName(firstName)){
	duplicates++;
}
if(d6.isSameName(firstName)){
	duplicates++;
}
if(d7.isSameName(firstName)){
	duplicates++;
}

System.out.println("The first dwarf's name is " + firstName);
System.out.println("Number of duplicates: " + duplicates);
	}
}
