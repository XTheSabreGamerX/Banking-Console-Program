/*Juan Carlos T. Matias
 IT101A*/

import java.util.*;
public class Banking {

	public static void main(String[] args) {
		
		String fname, lname, fullname, address, pin, pin2;
		double intrate;
		int deposit, balance;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("--- Create Account ---"); //Register Section
		
		System.out.print("Input your First Name: ");
		fname = s.nextLine();
		
		System.out.print("Input your Last Name: ");
		lname = s.nextLine();
		
		System.out.print("Input your Address: ");
		address = s.nextLine();
		
		System.out.print("Input your PIN CODE: ");
		pin = s.nextLine();
		
		fullname = fname + " " + lname;
		
		System.out.println("_________________"); //Account Info Display
		System.out.println("Account Info:");
		System.out.println("Fullname: " + fullname);
		System.out.println("Address: " + address);
		System.out.println("_________________"); //Login using PIN CODE
		System.out.print("Input your PIN CODE: ");
		pin2 = s.nextLine();
		
		if (pin2.equals(pin)){ //Successful login = Deposit or Withdraw Section
			
			System.out.print("Input interest rate: ");
			intrate = s.nextDouble();
			System.out.print("Input deposit: ");
			deposit = s.nextInt();
			System.out.print("Your balance is: ");
			balance = s.nextInt();
			System.out.print("Press [D] if you want to Deposit, Press [W] if you want to Withdraw");
		}
		
		else { //Failed login
			
			System.out.println("INVALID Account");
			System.out.println("Please Try Again");
		}
		

	}

}
