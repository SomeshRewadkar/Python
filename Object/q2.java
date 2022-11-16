package Object;
/*
 * Write a program to print the roll number 
 * and average marks of 8 students in three subjects (each out
of 100). The marks are entered by user.

Not able to find out average of class
 */

import java.util.*;
class marks
{    int r;
     int m;
     int p;
     int c;
     int sum=0;
	public marks(int r,int m,int p,int c)
	{
		this.r= r;
		this.m=m;
		this.p=p;
		this.c=c;
		
	}
	void avg()
	{
		sum=sum+((m+p+c)/3);
		System.out.println(sum/8);
	}
}
public class q2 {

}
