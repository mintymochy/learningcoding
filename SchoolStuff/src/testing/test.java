package testing;

import java.util.*;

/*
 * August Jones 
 * :3
 */
public class test {

	public static int test(int[] a, int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v)
				return i;
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 2, 3, 4 };
		System.out.println(test(nums, 2));

	}
}
