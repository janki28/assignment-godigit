/******************************************************************************

    Write a program to check if the string is a palindrome 

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        //declare instance of class
        String str1, str2 = "";
        
        //take input values  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check:");
        str1 = sc.nextLine();
        
        //evaluate
        int n = str1.length();
        for(int i = n - 1; i >= 0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }

        //print output  
        if(str1.equals(str2))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        } 
    }
}