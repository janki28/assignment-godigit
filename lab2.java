/******************************************************************************

	Write a program to accept two numbers. Display the two numbers. 
	Swap the two numbers and display them again.   

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		//declare instance of class
		int one, two,temp;
		Scanner sc = new Scanner(System.in);
	
		//take input values
		System.out.println("one");
		one=sc.nextInt();
		System.out.println("two");
		two=sc.nextInt();
	
		//print values before swapping
		System.out.println("before swapping 1:"+one+"2:"+two);
	
		//evaluate
		temp = one;
		one	 = two;
		two  = temp;
	
		//print values after swapping
		System.out.println("after swapped 1 "+one+" 2 "+two);

	}
}