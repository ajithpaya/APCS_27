/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int arr [] = new int[1001];
	int rev [] = new int[1001];
	int count = 0;
count = 0;
	while(count<arr.length){
		arr[count] = (count+1)*3;
		count++;
	}
	count = 0;
	while(count<rev.length){
		rev[count] = 1000-count;
		count++;
	}
	count = 0;
	while(count<rev.length){
		System.out.println(rev[count]);
		count++;
	}
		count = 0;
	while(count<arr.length){
		System.out.println(arr[count]);
		count++;
	}
	}

}
