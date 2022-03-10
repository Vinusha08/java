package treeset;
import java.util.*;

public class Treeset {
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();  
		ts.add("Vinusha");  
		ts.add("Abburu"); 
		//Traversing elements  
		Iterator<String> itr=ts.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
	}

}
