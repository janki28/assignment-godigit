/******************************************************************************

	Write a program to accept the principle, rate of interest, and time. 
	Calculate simple interest and display the same.      

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		//declare instance of class
		int principle, time, rate, interest;
		Scanner sc = new Scanner(System.in);
		
		//take input values
		System.out.println("Principle");
		principle=sc.nextInt();
		System.out.println("Rate");
		rate=sc.nextInt();
		System.out.println("Time");
		time=sc.nextInt();
		
		//evaluate
		interest=(principle*time*rate)/100;
		
		//print output
		System.out.println("interest=" +interest);
	}
}