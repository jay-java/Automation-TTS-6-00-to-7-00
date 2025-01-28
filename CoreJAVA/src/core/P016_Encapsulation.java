package core;

class Users {
	private int id;
	private String name;
	private String address;
	private long contact;
	Users(){
		
	}
	Users(int id,String name,String address,long contact){
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}
	
	public void showData() {
		System.out.println("id : "+id+" name : "+name+" contact : "+contact+" addrss : "+address);
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" contact : "+contact+" addrss : "+address;
	}

}

public class P016_Encapsulation {
	public static void main(String[] args) {
		Users u1  =new Users();
		u1.setId(1);
		u1.setName("java");
		u1.setAddress("ahmedabad");
		u1.setContact(987654321);
		System.out.println(u1.getId());
		System.out.println(u1.getName());
//		u1.showData();
		System.out.println(u1);
		
		Users u2 = new Users(2, "python", "delhi", 9876540);
//		u2.showData();
		System.out.println(u2);
	}
}
