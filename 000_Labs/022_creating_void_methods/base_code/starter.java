/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        toString("write a sentence");
        String sentence1 = sc.nextLine();
        toString(sentence1);
        	toString("");
        toString("this is using the methods");
        String sentenc = sc.nextLine();
        toString(sentenc);
    }
    public static void toString (String senty){
        System.out.println(senty);
    }
}