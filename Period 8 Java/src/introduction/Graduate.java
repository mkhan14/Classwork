package introduction;

public class Graduate extends Senior {

	public Graduate(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public void talk(){//new talk method that takes prominence over old one
		super.talk();
		System.out.println("...and I will graduate.");
	}
}
