package core;

import java.util.ArrayList;
import java.util.List;

class Followers{
	int id;
	String user_name;
	long contact;
	
	public Followers(int id, String user_name, long contact) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Followers [id=" + id + ", user_name=" + user_name + ", contact=" + contact + "]";
	}
	
	
}
public class P025_ListPractical {
	public static void main(String[] args) {
		Followers f1  = new Followers(1, "user1", 98765321);
		Followers f2  = new Followers(2, "user2", 98765321);
		Followers f3  = new Followers(3, "user3", 98765321);
		Followers f4  = new Followers(4, "user4", 98765321);
		Followers f5  = new Followers(5, "user5", 98765321);
		List<Followers> list = new ArrayList<Followers>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		System.out.println(list);
		
		for(Followers f:list) {
			System.out.println(f);
		}
	}
}
