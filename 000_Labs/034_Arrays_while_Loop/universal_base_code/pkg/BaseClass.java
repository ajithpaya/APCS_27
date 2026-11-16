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
	int count = 0;
	while(count<amt){
		myArray[count] = (int)(Math.random() * amt);
		count++;
	}
	return myArray;
}
public void printArray(int[] myArray){
		int count = 0;
	while(count < myArray.length){
		System.out.println(myArray[count]);
		count++;
	}
}
}

