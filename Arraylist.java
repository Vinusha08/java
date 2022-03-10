package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("5");
		l.add("9");
		l.add("95");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
	}

}
