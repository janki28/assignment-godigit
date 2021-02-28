/******************************************************************************

    Write a program to accept a binary number and display it in the decimal form.  

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        //declare instance of class
        int binary, decimal=0, n=0;
        
        //take input values  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to convert to binary");
        binary = sc.nextInt();
        
        //evaluate
        while(true)
        {  
            if(binary == 0)
            {  
                break;  
            } 
            else 
            {  
                int temp = binary%10;  
                decimal += temp*Math.pow(2, n);  
                binary = binary/10;  
                n++;  
            }  
        }
        //print output  
        System.out.print(decimal); 
    }
}