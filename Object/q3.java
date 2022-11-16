package Object;

import java.util.Scanner;

/*
 * Write a program to calculate the average height 
 * of all the students of a class. The number of students
and their heights in a class are entered by user.
 */
public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int nos=sc.nextInt();
		System.out.println("Enter height of "+nos+"students");
		float hos=0;
		for (int i=1;i<=nos;i++)
		{
			System.out.println("Enter height of student no."+i);
			float hos1=sc.nextFloat();
			hos=hos+hos1;
		}
		float avg = hos/nos; 
		System.out.println("Average height of studets is "+avg);
		
		
		
	}
	

}
