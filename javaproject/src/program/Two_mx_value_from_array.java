package program;

import java.util.Arrays;

public class Two_mx_value_from_array {

	public static void main(String[] args) {
		int arr[]= {1,8,5,9,3,7,6,3,10};
		Arrays.sort(arr);
		
		
			System.out.println(arr[arr.length-1]);
			System.out.println(arr[arr.length-2]);
		
	}

}
