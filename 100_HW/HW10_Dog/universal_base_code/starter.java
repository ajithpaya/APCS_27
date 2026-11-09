/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	Dog lucky = new Dog  ("lucky" , 6);
	Dog monkey = new Dog ("monkey", "golden retreiver");

	if(lucky.isSleeping()){
		System.out.println(lucky.name +" is sleeping");
	}else{
		System.out.println(lucky.name + " is awake");
		lucky.bark();
		monkey.bark();
	}

	if(monkey.isSleeping()){
		if(lucky.isSleeping() == false){
		monkey.bark();
		}
	}else if(monkey.isSleeping() == true){
		if(lucky.isSleeping() == false){
		monkey.bark();
	}
		

	}
	}
}
