/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number and we'll print out every prime until that number:");
	int numb = sc.nextInt();
	starter st = new starter();
	st.printPrimes(numb);
	}

	public void starter (){

	}

	public boolean checkPrime (int inputOne){
		int temp  = inputOne - 1;
		while(temp > 1){
		if(inputOne %  temp == 0){
			return false;
		}
		temp--;
		}return true;



	}
	public void printPrimes (int inputTwo){
		int temp = 2;
		while (temp < inputTwo){
			if (checkPrime(temp)){
				System.out.println(temp);
			}
			temp++;

		}

		
	}
}
