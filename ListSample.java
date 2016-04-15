import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSample {
	
	public static void main(String[] args){
		
		List<Integer> a = new ArrayList<>();
		
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(3);
		
		
		
		for (int i=0;i<a.size();i++){
			System.out.println("Print from For loop"+a.get(i));
		}
		
		Iterator<Integer> itr = a.listIterator();
		int j=0;
		while(itr.hasNext())
		{

			System.out.println("Print list from Iterator interface:" +a.get(j));
			itr.next();
			j++;

		}
		
//		List<String> str = new ArrayList<>();
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(3);
		s1.add(3);
		Iterator<Integer> itr1 = a.listIterator();
		int k=0;
		while(itr1.hasNext())
		{

			System.out.println("Set size:" +s1.size());
			itr1.next();
			k++;

		}
		
		
		
		
	}

}
