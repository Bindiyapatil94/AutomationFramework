package program;

public class Shifting_Of_Array {

	public static void main(String[] args) {
		int arr[]= {1,4,6,6,7};
		int n=arr.length;
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--)
	     {
	       arr[i]=arr[i-1];
	     }
	     arr[0]=temp;
	 
	     for(int i=0;i<n;i++)
	     {
	       System.out.print(arr[i]+" ");
	     }

	}

}