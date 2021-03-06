package arrays;

public class ArraysPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		//print(someStrings); print accepted string array parameter
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime-currentTime) + "ms." );
		
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		//print(fiftyNumbers);
		//randomize(fiftyNumbers);
		//print(fiftyNumbers);
		rollDice(fiftyNumbers, 50); //roll 2 die
		//count each die roll and provide a percentage
		countResult(fiftyNumbers, 4);
		
		//int x = 10;
		//x = increase(x);
		//System.out.println(x);
	}
	
	private static void countResult(int[] fiftyNumbers, int numberOfDice) {
		int[] counter = new int[numberOfDice * 6];
		//populate(counter);
		for(int n: fiftyNumbers){
			counter[n-1] = counter[n - 1] + 1;
		}
		for(int i = numberOfDice - 1; i < counter.length; i++){
			System.out.println((i + 1) + " was rolled" + 100*counter[i]/fiftyNumbers.length + "percent of the time");
		}
		//can specify the number of dice
	}

	private static void rollDice(int[] fiftyNumbers, int numberOfDice) {
		//for(int i = 0; i < fiftyNumbers.length; i++){
			//fiftyNumbers[i] = (int) ((Math.random() * 6) + 1);
		//}
		
		for(int i = 0; i < fiftyNumbers.length; i++){
			int dice = 0;
			for(int j = 0; j < numberOfDice; j++){
				dice = dice + (int) (1+6*Math.random());
			}
			fiftyNumbers[i] = dice;
		}
	}

	private static void randomize(int[] fiftyNumbers, int max) {
		for(int i = 0; i < fiftyNumbers.length; i++){
			fiftyNumbers[i] = (int) ((Math.random() * max) + 1);
		}	
	}

	private static void populate(int[] fiftyNumbers) {
		for(int i = 0; i < fiftyNumbers.length; i++){
			fiftyNumbers[i] = i + 1;
		}
	}

	private void passByValue(){
		
	}
	
	/*public static void initializingArraysExample(){
		//primitive type[]:
				//primitive types are "already" in the system, start as zero.
				//cannot mix types.
				//Object[]:
				//unless initialized, start as null.
				//different types of objects in an array of common super class.
				
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
			//AP Exam 1 or 2 questions: pass-by-value is a way in which java operates
	}*/

	private static String getASpecialString() {
		String s = "THIS STRING IS SPECIAL";
		return s;
	}

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";
		//pass by value means when u change a local variable ur not changing the value
		//you are changing what the value is assigned to
	}

	private static void print(int[] s) {
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}

	private static void standardPopulate(String[] s) {
		for(int i = 0; i < s.length; i++){
			String string = "String #"+(i+1);
			s[i] = string;
		}
		
		//int i = 0;
		//for(String x: s){
		//	i++;
		//	x = "String #"+1;
		//}
	}
	
	private static void increase(int i){
		i++;
		//same as i = i +1;
	}
}


