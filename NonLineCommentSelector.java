package mini2;

import api.Selector;

/**
*@Author Andrei Baechle
*/

/**
 * Selector whose <code>select</code> method returns false for strings whose first non-whitespace
 * text is "//", and true for all other strings.
 */
public class NonLineCommentSelector implements Selector
{ 
	public boolean select(java.lang.String s)
	{
	
  if (s.charAt(0) == '/' && s.charAt(1) == '/')
  {
	   return false;
	  
  }
  else 
  {
	  return true;
  }
  
	}

}