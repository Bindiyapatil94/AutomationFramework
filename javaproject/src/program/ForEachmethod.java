package program;

import java.util.ArrayList;
import java.util.List;

public class ForEachmethod {
	
		   public static void main(String[] args) {
		      List<String> fruits = new ArrayList<String>();
		      fruits.add("Apple");
		      fruits.add("Orange");
		      fruits.add("Banana");
		      fruits.add("Pear"); 
		      fruits.add("Mango");
		      //lambda expression in forEach Method 
		      fruits.forEach(str->System.out.println(str));
		   }
		

}
