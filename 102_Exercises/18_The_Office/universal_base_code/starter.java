/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee d = new Employee(1987 , "Dwight" , "Schrute" , 4416.66);
		d.employeeToString();
		Employee j = new Employee(2474 , "Jim" , "Halpert" , 4416.66);
		j.employeeToString();
		Employee p = new Employee(2011 , "Pam" , "Beesly" , 2250);
		p.employeeToString();
		Employee b = new Employee(1234 , "Betot" , "Sarokuhihi" , 45 );
		b.employeeToString();
				
		d.raiseSalary(100);
		j.raiseSalary(200);
		p.raiseSalary(500);
		b.raiseSalary(-1000);

		System.out.println(d.getSalary());
		System.out.println(j.getSalary());
		System.out.println(p.getSalary());
		System.out.println(b.getSalary());

		System.out.println(d.getAnnualSalary());
		System.out.println(j.getAnnualSalary());
		System.out.println(p.getAnnualSalary());
		System.out.println(b.getAnnualSalary());

	}
}
