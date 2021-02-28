/******************************************************************************

    Write a program to calculate the LCM of any no. of numbers    

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		//declare instance of class
	    int n;
		int min, max, x, lcm = 0,i,j,k;  
		Scanner sc = new Scanner(System.in);
		
		//take input values  
		System.out.println("enter number:");
      	n = sc.nextInt();
      	System.out.println("enter array value numbers: ");
		int[] number = new int[n];
      	for(int a = 0; a < n; a++)
      	{
      	    number[a] = sc.nextInt();
      	    
      	}
		  
		//evaluate     
		for(i = 0; i<number.length; i++) 
		{
			for(j = i+1; j<number.length-1; j++) 
			{
				if(number[i] > number[j]) 
				{
               		min = number[j];
               		max = number[i];
            	} 
				else 
				{
               		min = number[i];
               		max = number[j];
        		}
				for(k =0; k<number.length; k++) 
				{
        			x = k * max;
               		if(x % min == 0) 
					{
                		lcm = x ;
               		}
            	}
         	}
		  }
		
		//print output
    	System.out.println("LCM of the given array of numbers : " + lcm);
   	}
}