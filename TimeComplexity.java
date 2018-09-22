package edu.iastate.cs228.hw03;

/**
 * 
 * @author Andrei Baechle
 *
 */
public class TimeComplexity {
	

	/*
	 * In all of the following methods you can assume that array will always have
	 * elements (ints) in it. And will have proper integers as defined in the
	 * description of HW03, i.e., in first two it will be in the range, and in last
	 * two it will be composed of negative and positive values only.
	 */

	public static int findMissingInt_a_On2(int[] array) {
		int n = array.length;
		int i, j, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (array[j] != array[i] && j > n)
					break;
			}
			total -= array[i];
		}
		return total;
	}

	public static int findMissingInt_b_On1(int[] array) {
		int i, total;
		int n = array.length;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < array.length; i++) {
			total -= array[i];
		}
		return total;
	}

	public static void rearrange_a_On2(int[] array) {
		int n = array.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void rearrange_b_On1(int[] array) {
		int i, temp = 0;
		int[] nArray = new int[array.length];
		int n = array.length;
		for (i = 0; i < n - 1; i++) {

			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				nArray = array;
			}
		}

	}

}
