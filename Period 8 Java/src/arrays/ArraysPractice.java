package arrays;

public class ArraysPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no superclass for primitive types.
		//array: fixed length, indices start at 0, indexed(ordered),
		//common data type(Student[])
		//arrays of any type must be Object[]
		//if you want to put different primitive types into an array, wrapper class.
		//you must use their
		//wrapper classes are over primitive types.
		//primitive types are not objects.
		//any time u want to treat primitive type like a class, use wrapper class.
		
		//these are two different ways to instantiate an array
		boolean[] boos1 = new boolean[3];
		//this can ONLY be done at the declaration because it sets size AND content
		boolean[] boos2 = {false, false, false};
		//this does NOT work:
		//boos3 = {false, true, true};
		//this is all that will work:
		boos3 = new boolean[3];
		
		//2 ways of iterating through an array:
		//STANDARD FOR LOOP
		//- the index is important to keep track of
		//-u also need to customize the order
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		//"FOR - EACH" LOOP
		//- the index is not important
		//- you don't need to customize
		//- automatically assigns a "handle"
		//- faster
		for(boolean b: boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String[] someStrings1 = new String[3];
		//you can do this to instantiate the elements...
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		//...but it is repetitive
		
		//String[] someString2 = {"a", "b", "c"};
		
		//for(String s: someStrings1){
		//	System.out.println(s);
			//primitive nothing is 0
			//null does nothing...making reference to thing that isn't there
		//for(String s: someStrings1){
			//s = "a new String";
			//prints null because at the end s points (assigns) to the "a new String", does nothing
		//local variables don't change the item they point to
		//}
		//a for loop to print it:
		for(String s: someStrings1){
			System.out.println(s);
		}
		
		//lets try a loop to instantiate:
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		}
	}


