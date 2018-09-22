package mini2;

import api.Combiner;

/**
*@Author Andrei Baechle
**/

/**
 * Combiner that appends the first letter of a string onto
 * the accumulator.  If the string is empty, returns the 
 * accumulator.
 */
public class FirstLetterCombiner implements Combiner<String>
{
  public java.lang.String combine(java.lang.String obj, java.lang.String s)
  {
	  if(s.trim().length() == 0 )
	  {
		  return obj; 
	  }
	  else
	  {
	  char c = s.charAt(0);
	  return obj + c;
      }
  }
 
}
