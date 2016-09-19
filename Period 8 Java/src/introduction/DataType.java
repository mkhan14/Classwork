package introduction;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass one = new SuperClass();
		//making a new Class will make the Class say method override the SuperClass say method.
		//making a new SuperClass will make the SuperClass say method override the Class say method.
		((SuperClass)one).say();
		//((SuperClass)(one.super)).say(); doesn't compile.
		//one.super.say(); doesn't compile.
		one.say();
	}

}
