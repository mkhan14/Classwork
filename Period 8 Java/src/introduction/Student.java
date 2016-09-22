package introduction;

public class Student {
	
	//fields
	private String name;
	
	//constructor, must always match the class name (initialize fields)
	public Student(String name){
		this.name = name;
	}

	public void talk(){
		System.out.println("Hello, my name is "+name);
	}
}
