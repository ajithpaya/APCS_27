package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	//String actor;		// What's the actors name?
	//int age;			// What's the age of the actor?
	//String villain;		// Who's the arch nemesis of this Spiderman?
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		

	//Global Varibales
public String actor;
public int age;
public String villan;

public String myActor;
public int aAge;
public String superVillan;

	//Constructors
public Spiderman(int aAge){
	actor = "unknown";
	age = aAge;
	villan = "unknown";
}
public Spiderman(){
	actor = "unknown";
	age = 0;
	villan = "unknown";

}
public Spiderman(String myActor){
	actor = myActor;
	age = 0;
	villan = "unknown";

}
public Spiderman(String myActor, int aAge){
	actor = myActor;
	age = aAge;
	villan = "unknown";
}
public Spiderman(String myActor, int aAge, String superVillan){
	actor = myActor;
	age = aAge;
	villan = superVillan;
}

//Methods
public String getActors(){
	return actor;
}
public int getAge(){
	return age;
}
public String getVillan(){
	return villan;
}


public void setActors(String actor){
	this.actor = actor;
}
public void setAge(int age){
	this.age = age;
}
public void setVillan(String villan){
	this.villan = villan;
}

	public void fight(){
		System.out.println("Spidey shoots his web at " + villan);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
