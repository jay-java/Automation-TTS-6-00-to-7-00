package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P024_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(23453456);
		list.add(45.34);
		list.add(false);
		list.add('a');
		list.add(345);
		list.add(1);
		System.out.println(list);
		list.add(2343.3243);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		System.out.println("num of elements : "+list.size());
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
