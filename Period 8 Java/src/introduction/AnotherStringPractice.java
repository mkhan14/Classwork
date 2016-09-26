package introduction;

import java.util.Scanner;

public class AnotherStringPractice {

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
		String printString = "";
		int cutoff = 35;
		//check for words to add
		//IOW s has a length > 0
		while (s.length() > 0){
			//shorter and shorter until there is nothing left
			String cut = "";
			String nextWord = "";
			//check to see if the next word will fit on the line AND
			//there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				//add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, this is the last word, so add the whole
				//thing
				if(endOfWord == -1){
					endOfWord = s.length() - 1;//-1 for index
				}
				
				nextWord = s.substring(0, endOfWord+1); //include the space
				
			}
			
			printString += cut+"\n";
			
		}
		System.out.println(printString);
	}

}
