package program;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class collection 
{
public static void main(String[] args)
{
	//Set s=new HashSet();
	TreeSet s=new TreeSet();
	s.add(10);
	//s.add('a');
	s.add(10);
	s.add(10);
	//s.add(null);
	//s.add('b');
	//s.add(null);
	//s.add("shru");
	System.out.println(s.size());
	System.out.println(s.isEmpty());
	System.out.println(s.contains(10));
	System.out.println(s);
}		
}
