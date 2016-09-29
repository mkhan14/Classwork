package chatbot;

public class MahinSchool implements Chatbot{ //automatically extends object. everything has
	//a default constructor
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		inSchoolLoop = true;
		while(inSchoolLoop){
			MahinMain.print("Type 'quit' to go back.");
			schoolResponse = MahinMain.promptInput();//static call on promptInput method from
			//MahinMain class
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				MahinMain.promptForever();
			}
			MahinMain.print("That's my favorite part about school");
			//write an algorithm to handle input context
			//case sensitivity
			//surrounding spaces/punctuation
			//preceding not or no
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		String[] triggers = {"school", "class", "teacher"};
		//idea: create a for loop to iterate through your array of triggers
		
		if(MahinMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(MahinMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
}
