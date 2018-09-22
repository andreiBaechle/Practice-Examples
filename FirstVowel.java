package lab6;

import java.util.Scanner;

/**
*@Author Andrei Baechle
*
*this class will scan your input and return the first Vowel you typed.
*/

public class FirstVowel
{
	
	public static void main(String[] args) 
	
	{
		System.out.print(vowels());
	}
		public static int vowels()
		{
		
		String phrase = new String();
		System.out.println("enter phrase: ");
		Scanner input = new Scanner(System.in);
		phrase = input.nextLine();
		
		for (int i = 1; i < phrase.length(); i++)
		
		{
			char ch = phrase.charAt(i);
			
			if ("aeiouAEIOU".indexOf(ch) >= 0)
			{
				System.out.println(phrase.charAt(i));
				return i;
			}
			
		
		}
		return -1;
	}
	
}
