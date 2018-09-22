package mini2;

import api.Selector;

/**
*@Author Andrei Baechle
*/

/**
 * Selector that returns false for a strings that are
 * empty, that are all whitespace, or whose first non-whitespace
 * character is the '#' character.
 */
public class ValidLineSelector implements Selector
{
  public ValidLineSelector()
  {
	  
  }
  
	  public boolean select(java.lang.String s){
	  {
		  if (s.trim().length() == 0 || s.trim().charAt(0) == '#')
		  {
			  return false;
		  }
		  else
		  {
			  return true;
					  
		  }
	  }
  }
}
