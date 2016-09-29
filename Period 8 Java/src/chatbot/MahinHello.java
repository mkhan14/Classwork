package chatbot;

public class MahinHello implements Chatbot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello. Let's move the conversation along",
			"We said hello already. Did you forget"};
	private String[] angryResponses = {"Okay seriously. Stop saying hi.",
			"What is wrong with you and saying hello?"};
	
	private int helloCount;
	
	public MahinHello(){
		helloCount = 0;
	}
	
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = MahinMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				MahinMain.promptForever();//normal conversation
			}
		}
	}

	private void printResponse() {
		// TODO Auto-generated method stub
		if(helloCount > 4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
		MahinMain.print(angryResponses[responseSelection]);
		}else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			MahinMain.print(calmResponses[responseSelection]);
		}
		
	}

	@Override
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(MahinMain.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		if(MahinMain.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(MahinMain.findKeyword(userInput, "hey", 0)>=0){
			return true;
		}
		return false;
	}

}
