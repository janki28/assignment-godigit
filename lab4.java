/******************************************************************************

    Write a program to accept a double value. Separate the whole value from the fractional value and store them in two variables. 
    Display the same  

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        //declare instance of class
        double value;
        
        //take input values  
        Scanner sc = new Scanner(System.in);
        value = sc.nextDouble();
        System.out.print("\nOriginal value: "+value);
        
        //evaluate
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;  
        
        //print output
        System.out.print("\nIntegral part: "+integral_part);
        System.out.print("\nFractional part: "+fractional_part);
    }
}