/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is base num ");
        int basenum = sc.nextInt();
        System.out.println("What is exponent num ");
        int exp = sc.nextInt();
        int answer = pow(basenum, exp);
        System.out.println("Your answer is: " + answer);}
    
   		public static int pow (int x, int y){
        int answer = 1;
        int i = 0;
        while (i < y){
            answer = answer * x;
            i=i+1;
        }
        return answer;}
    
}