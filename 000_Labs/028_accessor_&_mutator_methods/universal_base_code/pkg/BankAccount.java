package pkg;
import java.util.*;

public class BankAccount {
	//gloval variables
private String owner;
private int accountNumber; 
private double balance;
private boolean isActive;
private static int accountValue = 50;

	//constructors

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

//methods

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

//accessors mutator
public String getOwner(){
	return owner;
}

public void setOwner(String newOwner){
	owner = newOwner;
}

public double getBalance(){
	return balance;
}

public void closeAccount(){
	isActive = false;
}

public boolean isActive(){
	return isActive;
}

public void deposit(double amount){
	if(isActive && amount > 0){
		balance += amount;
	}else{
		System.out.println("Cant Deposit");
	}
}

public void withdraw(double amount){
	if(isActive && amount > 0 && amount <= balance){
		balance -= amount;
	}else{
		System.out.println("Cant deposit");
	}
}
}