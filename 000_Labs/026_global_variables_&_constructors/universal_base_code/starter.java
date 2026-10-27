/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {

	public static void main(String args[]) {
		BankAccount a = new BankAccount("ajith" , 1200.0);
		a.print();
		BankAccount l = new BankAccount("lucky" , 2.0);
		l.print();
		BankAccount p = new BankAccount("poole" , 100000.0);
		p.print();
		BankAccount e = new BankAccount("eto");
		e.print();

		
	}
}

