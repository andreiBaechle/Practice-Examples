package mini2;

import api.Selector;

/**
*@Author Andrei Baechle
*/

/**
 * Selector that returns false if the current string is
 * within a javadoc comment, true otherwise.  Using a NonJavadocSelector
 * in the filter method of a StringList has the effect of removing all
 * javadoc comments.  Note that we are assuming that javadoc comments
 * always start and end on different lines, and that no executable
 * code ever appears on the same line as a javadoc comment.
 */
public class NonJavadocSelector implements Selector
{
	public boolean select(java.lang.String s)
	{
		
		  if (s.charAt(0) == '/' && s.charAt(1) == '*' && s.charAt(2) == '*')
		  {
			   return true;
			  
		  }
		  else if (s.charAt(s.length()-2) == '*' && s.charAt(s.length()-1) == '/')
		  {
			  return false;
		  }
		  else 
		  {
			  return false;
		  }
			  
		}
}


