package program;

public class occurancesofcharacter {

	public static void main(String[] args) {
		String str="geeksforgeek";
		int arr[]=new int[str.length()];
		
		char ch[]=str.toCharArray(); //it converts string to character array

		
		for(int i = 0; i < str.length(); i++) 
		{
			arr[i]=1;
		    for(int j=i+1;j<str.length();j++) 
		    {
			   if(ch[i]==ch[j]) 
			   {
				   arr[i]++;
				   ch[j]=0;
			   }
		   }
		}
		 for (int i = 0; i < arr.length; i++) 
		 { 
			 if(ch[i]!=' '&& ch[i]!=0) {
				 System.out.println(ch[i]+"-"+arr[i]);
			 }
	            
		 }
		 }
	
}
