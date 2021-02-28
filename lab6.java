/******************************************************************************

	Write a program to accept a decimal number. 
	Display it in the binary form      

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
		//declare instance of class
	    int num;
    	Scanner sc = new Scanner(System.in);
		
		//take input values  
		System.out.println("enter value to convert to binary");
    	num = sc.nextInt();
    	int binary[] = new int[40];
    	int index = 0;
		
		//evaluate     
		while(num > 0)
    	{
        	binary[index++] = num%2;
        	num = num/2;
    	}
		
		//print output
		for(int i = index-1;i >= 0;i--)
    	{
       		System.out.print(binary[i]);
    	}
    }
}