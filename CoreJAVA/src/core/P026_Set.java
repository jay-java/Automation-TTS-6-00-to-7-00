package core;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P026_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("java");
		set.add('g');
		set.add(3454.545);
		set.add(false);
		set.add(254356454);
		set.add("hello user");
		set.add(1);
		System.out.println(set);
		Iterator itr=  set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
