package Object;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;

class BankAccount
{
	String Name;
//	String Address;
//	String AccType;
//	int Balance;
//	int NumberOfTransactions;
	static int acc=10;
	
	public BankAccount()
	{
	}
	public String accno()
	{
		return "BA"+ (acc=acc+1);
	}
	@Override
	public String toString() {
		return "BankAccount [Name=" + Name + ", accno()=" + accno() + "]";
	}
	
	
	
}

public class q5 {

	public static void main(String[] args)
	{
	 System.out.println("Enter no. of depositors \n");
	 Scanner scan = new Scanner(System.in);
//		 ArrayList<String> a = new  ArrayList<String>();
//		 System.out.println("Enter no. of depositors: ");
//		 int nd= scan.nextInt();
//		 for (int i=1;i<=nd;i++)
//		 {   String name = scan.next();
//			 a.add(name);
//		 }
//		 System.out.println(a);
		 int n = scan.nextInt(); 
		 BankAccount C[] = new BankAccount[n]; 
		 for (int i = 0; i < C.length; i++) { 
		 C[i] = new BankAccount(); 
		 System.out.println(C[i]);
//		 C[i].openAccount(); 
//		 C[i].AccountNum(i); 
		 } 
		 
		
		
		 

	}

}
