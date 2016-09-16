package introduction;

public class OOPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jillian = new Graduate("Jillian"); //senior is a subclass of student. every senior is a student
		//jillian is a local variable, a field
		Student jordan = new Junior("Jordan");
		Student joseph = new Freshman("Joseph");
		
		//use the talk method that jillian has. will use all of jillian's fields to execute method
		jillian.talk();
		//jillian.name = "BaloneyPants";
		//jillian.talk();
		
		jordan.talk();
		//casting a Student into a Junior
		//((Junior)jordan).boastScore();
		joseph.talk();
		//can't make student talk first
		//senior can't exist without a student existing. senior constructor includes student constructor. senior is a student
		
	}

}
