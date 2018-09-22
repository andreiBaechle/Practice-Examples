package mini2;

import api.Transformation;

/**
*@Author Andrei Baechle
*/

/**
 * Transformation whose <code>apply</code> method prepends a line number to each string.  
 * For a newly created LineNumberer, the line numbers start at 1 and increase on
 * each successive call.  The line number is left-justified in a field 5 spaces wide.
 */
public class LineNumberer implements Transformation
{
	private int num = 1;
	
	public LineNumberer()
	{
		
	}
  public java.lang.String apply(java.lang.String s)
  {
	  
	  String b = s;
	b = String.format("%-5d", num) + s;
	  num ++;
	
	return b;
  }

}

	  
