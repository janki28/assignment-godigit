/******************************************************************************

    Write a program to accept a number and display whether it is an even or odd number 
    (Note: Don't use Ifelse statement)   
*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
        //declare instance of class
        String[] array = {"Even", "Odd"};  
        Scanner sc = new Scanner(System.in);

        //take input values
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
                
        //evaluate
        System.out.println(array[no%2]);
	}
}