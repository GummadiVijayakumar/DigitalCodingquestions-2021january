package org.twoprograms;

/* in this program 
 * input : 123sgd78564
 * output: 123sgd54
 * so we have to eliminate 7 and 56
 * input : 124765dge56u
 * output: 12465dgeu
  */
 
import java.util.Scanner;
public class NumberProgram 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		
		System.out.println((int)'7');
		
		System.out.println("Enter the string with number to eliminate 56 and 7 : ");
		
		String s = scan.nextLine();
		
		char[] arr = s.toCharArray();
		
		String temp = "";
		
		System.out.println(arr.length);
		for(int i =0 ; i< s.length()-1 ; i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				if((s.charAt(i) != 55) &&(s.charAt(i) != 53 || s.charAt(i+1) != 54) )
				{ 
					temp = temp + (int)(s.charAt(i)-48);
				}
			}
			else if( (s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122) )
			{
				temp = temp + (char) (s.charAt(i));
			}
			
		}
		
		
		System.out.println("Solution after removing the 7 and 56 is : ");
		System.out.println(temp);
	}
}
