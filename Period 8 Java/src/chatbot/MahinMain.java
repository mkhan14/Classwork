package chatbot;


import java.util.Scanner;

public class MahinMain {

	static Scanner input; //something u use over again, is field
	static String user;
	static String response;
	static boolean inMainLoop;
	//list all the chatbots available under this class
	static Chatbot school;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstrateStringMethods();
		createFields();
		String s1 = " ";
		String s2 = "a";
		System.out.println(s1.compareTo(s2)); //comma, space comes before a...less than 0
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
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response = promptInput();
			//response to how you feel
			if(findKeyword(response, "good", 0) >= 0){//case sensitive
				print("That's wonderful. So glad you feel good.");
			}
			else if(response.indexOf("school") >= 0){
				print("School is great! Tell me about school.");
				//exit this while loop
				inMainLoop = false;
				//go to the school's talk method
				school.talk();
			}
			else{
				print("I don't understand.");
			}
			//inMainLoop = false means exit loop
		}
		
	}

	public static int findKeyword(String searchString, String keyword, int startPsn) {
		// TODO Auto-generated method stub
		//delete white space
		searchString = searchString.trim();
		//make lowercase
		searchString = searchString.toLowerCase(); //take this out for case-sensitive
		keyword = keyword.toLowerCase(); //take this out for case-sensitive
		System.out.println("The phrase is " +searchString);
		System.out.println("The keyword is "+keyword);
		//find first position of key word
		int psn = searchString.indexOf(keyword);
		System.out.println("The keyword was found at "+psn);
		
		while(psn >= 0){
			//assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front, in it exists
			if(psn > 0){
				before = searchString.substring(psn-1, psn); //-1 looks at the character
				//before the word
				System.out.println("The character before is "+before);
			}
			//check if there is a character after the keyword
			if(psn+keyword.length() < searchString.length()){
				after = searchString.substring(psn + keyword.length(),psn + keyword.length()+1);
				System.out.println("The character after is "+after);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0 &&
					noNegations(searchString, psn)){
				System.out.println("Found "+keyword+ "at "+psn);
				return psn;	
			}else{
				//psn+1 is one space after our current
				//psn, so this finds the NEXT word
				psn = searchString.indexOf(keyword,psn+1);
				System.out.println("Did not find "+keyword+", checking position"+psn);
			}
		}
		
		return -1;
	}

	//this is a helper method. it is a method designed for helping a larger method.
	//because of this, helper methods are generally private because they are only
	//used by the methods they are helping. also, when u do ur project, i expect to
	//see helper methods because they make code more readable.
	//tells what 30 lines of code does. checks to make sure there are no negations.
	//return true if there are no negation words in front of psn
	private static boolean noNegations(String searchString, int psn) {
		// TODO Auto-generated method stub
		//check to see if the word "no" is in front of psn
		//check to see if there are three spaces in front, then check to see
		//if "no" is there
		//searchString (always lowercase)
		if(psn - 3 >= 0 && searchString.substring(psn-3,psn).equals("no ")){
			return false;
		}
		//check for not
		if(psn - 4 >= 0 && searchString.substring(psn-4,psn).equals("not ")){
			return false;
		}
		if(psn - 6 >= 0 && searchString.substring(psn-6,psn).equals("never ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4,psn).equals("n't ")){
			return false;
		}
		return true;
	}

	public static String promptInput() {
		// TODO Auto-generated method stub
		String userInput = input.nextLine();
		return userInput;
		
	}

	public static void createFields() {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		user = "";
		school = new MahinSchool();
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


