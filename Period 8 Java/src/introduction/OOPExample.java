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
		
		//9/19/16:
		//encapsulation: private fields
		//polymorphism: calling a senior a studfent
		//inheritance: inhereting the talk method
		//primitive types:data that is not its own class(objects are made up of primitive
		//types)
		//String- is made up of a char[]
		//size-byte, short, int, boolean, long(time in milliseconds), float, double (long)
		//(Integer), (Floating Point)
		//int has less space than the double, is good so computer works optimally
		//double is twice the size of a float (in storage space)
		
	}

}
