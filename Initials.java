package lab6;

import java.util.Scanner;

/**
*@Author Andrei Baechle
*
*this class will scan an input for your name, and return your initials;
*/
public class Initials 
{
	
	public static void main(String[] args) 
	
	{
		String name = new String();
		System.out.println("enter name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		char c = name.charAt(0);
		System.out.println(c);
		
		for (int i = 1; i < name.length(); i++)
		{
			char c1 = name.charAt(i);
			
			if (c1 == ' ')
			{
				System.out.println(name.charAt(i + 1));
				
			}
		}

	}
	
}
