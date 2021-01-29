package org.twoprograms;
/*  given 
 * input : 12345
 * output : 120 
 * which comes from 1*2*3*4*5
 * 
 *  */
import java.util.Scanner;

public class MultiplicationNumber 
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the  number : ");
		int num = scan.nextInt();
		
		int u = 0;
		
		long c = 1;
		
		for(;;)
		{
			if( num > 0 )
			{
				u = num%10;
				c = c* u ;
				
				num = num /10;
			}
			else if(num <=0)
			{
				break;
			}
		}
		
		System.out.println(c);
	
	}
}
