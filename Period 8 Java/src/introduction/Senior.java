package introduction;

public class Senior extends Student {
	
	//String favoriteColor;

	public Senior(String name) {
		super(name);//constructs a Student first
		//super is reference to student class. before make senior make student class
		//whatever name u give the senior is the name u give the student
		//make student first
		//this.favoriteColor = color;
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){//new talk method that takes prominence over old one
		super.talk();
		System.out.println("...and I am a senior!");
	}

}
