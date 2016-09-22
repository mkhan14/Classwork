package introduction;

import java.util.Scanner;//util is a package inside java

public class StringPractice {
	
	static Scanner input; //something u use over again, is field
	static String user;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstrateStringMethods();
		createFields();
		//promptInput();
		promptName();
		promptForever();
	}
	
	public static void promptName() {
		// TODO Auto-generated method stub
		print("Enter your name");
		user = input.nextLine();
		print(" Glad to meet you, "+user+". For the rest of time, I will call you, "+user+"."
				+" You may call me Computer. We should become friends.");
		
	}

	public static void promptForever() {
		// TODO Auto-generated method stub
		while(true){
			promptInput();
		}
		
	}

	public static void promptInput() {
		// TODO Auto-generated method stub
		print("Please type something, "+user+".");
		String userInput = input.nextLine();
		print ("Congratulations. You typed: "+userInput);
		
	}

	public static void createFields() {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		user = "";
		
	}

	public static void demonstrateStringMethods(){
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
		String printString = s;
		int cutoff = 45;
		if(printString.length() > cutoff){
			for(int i = 0; i < s.length(); i++){
				//append
			printString += getCut(s, cutoff, i+1)+"\n";
			}
		}
		System.out.println(printString);
	}

	private static String getCut(String s, int cutoff, int cut){
			int cutIndex = cut * cutoff;
			if(cutIndex > s.length()){
				cutIndex = s.length();
			}
			String currentCut = s.substring(0,cutIndex);
			
			int indexOfLastSpace = currentCut.length()-1;
			//start at last index, go backwards
			for(int i = currentCut.length()-1; i >= 0; i--){
				String letter = currentCut.substring(i, i+1); //includes i, excludes i+1
				//ap exam obsessed with substring method... not char
				if(letter.equals(" ")){
					indexOfLastSpace = i;
					break;
				}
			}
			//shorten the cut to end on a space
			currentCut = currentCut.substring(0,indexOfLastSpace);
			return currentCut;
	}
}
