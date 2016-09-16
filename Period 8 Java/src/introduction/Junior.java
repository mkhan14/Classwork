package introduction;

public class Junior extends Student {

	public Junior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){//new talk method that takes prominence over old one
		super.talk();
		System.out.println("...and I am a junior!");
	}

}
