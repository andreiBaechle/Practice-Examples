package mini2;

import api.Combiner;

/**
*@Author Andrei Baechle
**/

/**
 * Adds the length of the given string to the accumulator
 * and returns the result.
 */
public class LengthCombiner implements Combiner<Integer>
{
	public java.lang.Integer combine(java.lang.Integer obj, java.lang.String s)
	{
		int len = s.length()-1;
		obj += len;
		return obj;
	}


}
