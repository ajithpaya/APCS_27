package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		
//global variables
public String name;
public int age;
public String breed;

//constructors
public Dog(){
name = "clifford";
age = 3;
breed = "big red dog";
}
public Dog(String aName){
name = aName;
age = 1;
breed = "dog dog";
}
public Dog(String aName, String aBreed){
name = aName;
age = 1;
breed = aBreed;
}
public Dog(String aName, int aAge){
name = aName;
age = aAge;
breed = "dog dog";
}
//methods
public void setName(String name){
	this.name = name;
}
public void setAge(int age){
	this.age = age;
}
public void setBreed(String breed){
	this.breed = breed;
}
public String getName(){
	return name;
}
public int getAge(){
	return age;
}
public String getBreed(){
	return breed;
}
public boolean isSleeping(){
	Random random = new Random();
	if(random.nextBoolean()){
		return true;
	}else{
		return false;
	}
}
public void bark(){
	System.out.println(this.name + " barks!");
}

	}


