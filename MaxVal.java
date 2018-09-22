package lab9;

/**
*@Author Andrei Baechle
*
* MaxVal finds the maximum value in an array recursively.
*/

public class MaxVal {

	public static void main(String[] args)
	{
		int[] test = {3, 4, 6, 1, 5, 3, 2}; // sum should be 20
	    int result = maxVal(test);
	    System.out.println(result);

	}
	
	public static int maxVal(int[] arr)
	{
		return maxValRec(arr, 0 , arr.length-1);
	}
	
	public static int maxValRec(int[] arr, int start, int end)
	{
		if (start == end)
		{
			return arr[start];
		}
		else
		{
			int mid = (start + end )/2;
			int left = maxValRec(arr, start, mid);
			int right = maxValRec(arr, mid + 1, end);
			return Math.max(left, right);
		}
	}

}
