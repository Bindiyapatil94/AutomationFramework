package program;

import java.util.Arrays;

public class arraydemoprogram {

	public static void main(String[] args) {
		int arr[]= {1,5,0,3,0,5,3,0};
		int n=arr.length;
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
