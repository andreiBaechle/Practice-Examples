package lab6;

import java.util.Scanner;


/**
*@Author Andrei Baechle
*
* this class will scan the console and add the value to a total sum.
*/

public class SumFromConsole {
	
	public static void main(String[] args) {
		
	}
	 public static int sumFromConsole()
	  {
	    Scanner in = new Scanner(System.in);
	    int total = 0;
	    while (in.hasNextInt())
	    {
	      System.out.print("Enter a number: ");
	      int num = in.nextInt();
	      total = total + num;     
	    }
	    return total;
	  }
}


