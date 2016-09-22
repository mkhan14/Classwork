package introduction;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = new String("Hello World"); //strings are only object that have alternate constructor
		String text2 = "Hello World"; //same as above...they are not really the same
		
		System.out.println("Hello World");
		if(text1.equals(text2)){//== is comparison you use for primitive types
			System.out.println("These strings are equal:");
			//.equals use for comparing objects!
		}
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){//1 is after..use equals
			print("word1 comes before word2");
		}
		//out is an instance of an object
	}
	
	public static void print(String s){
		System.out.println(s);
	}

}
