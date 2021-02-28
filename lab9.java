/******************************************************************************

    Write a program to find X ^ N without using in-built functions. 
    Accept X and n. 
    Display the result.      

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    static int power(int base,int exponent) 
    { 
        //evaluate
        if(exponent == 0)
        {
            return 1;
        }
        else if(exponent%2 == 0)
        {
            return power(base,exponent/2)*power(base,exponent/2);
        }
        else
        {
            return base*power(base,exponent/2)*power(base,exponent/2);
        }
    }
    public static void main(String[] args)
    {
        //declare instance of class
        int base,exponent;
        
        //take input values  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        base = sc.nextInt();
        System.out.println("Enter exponent");
        exponent = sc.nextInt();
        
        //print output
        System.out.println(power(base,exponent));         
    }
}