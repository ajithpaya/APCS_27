/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {

	public BaseClass() {
		
		
	}

public int[] createArray(int amt){
	int[] myArray = new int[amt];
	for(int i = 0; i<amt; i++){
		myArray[i] = (int)(Math.random() * amt);
	}
	return myArray;
}
public void printArray(int[] myArray){
	for(int i = 0; i< myArray.length; i++){
		System.out.println(myArray[i]);
	
	}
}
}



