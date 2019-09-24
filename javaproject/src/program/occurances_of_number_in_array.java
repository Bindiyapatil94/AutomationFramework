package program;

public class occurances_of_number_in_array {

	public static void main(String[] args) {
		int arr[]= {33,34,73,22,37};
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==33)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
