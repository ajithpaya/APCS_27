/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private int accountNumber; 
private double balance;
private boolean isActive;
private static int accountValue = 50;

	// -------CONSTRUCTORS-------
public BankAccount(){
	owner = "unknown";
	balance = 0.0;
	isActive = true;
	accountNumber = nextAvailableNumber();

}
public BankAccount(String myOwner){
	owner = myOwner;
	balance = 0;
	accountNumber = nextAvailableNumber();
	isActive = true;
}
public BankAccount(String myOwner, double initialBalance){
	owner = myOwner;
	balance = initialBalance;
	accountNumber = nextAvailableNumber();
	isActive = true;
}

	// -------METHODS-------
private int nextAvailableNumber(){
accountValue++;
	if(accountValue >= 1000){
		return 0;
	}else{
		return accountValue;
	}
}

public void displayAccountInfo(){
	System.out.println("Owner name is " + owner + " Balance is " + balance + "account number is " + accountNumber);
}
public void checkBalance(){
	System.out.println("balance is " + balance);
}
}