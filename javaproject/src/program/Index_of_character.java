package program;

public class Index_of_character {

	public static void main(String[] args) 
	{
     String s1="Automationtesting";
       
       for(int i=0;i<s1.length();i++)
       {
       char a=s1.charAt(i);
       if(a=='t')
       {
    	   System.out.println(i);
       }
       }
      }

}
