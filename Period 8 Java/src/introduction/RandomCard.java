package introduction;

public class RandomCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit = {"King", "Queen", "Jack", "Ace"};
		String[] symbol = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		System.out.println("The "+suit[draw]+" of "+symbol[draw]);
		//drawCard();
	}
	
	public static int drawSuit(){
		double rand = Math.random();
		int drawSu = (int)(4*rand);
		
		
	}
	
	public static int drawSymbol(){
		double rand = Math.random();
		int drawSy = (int)(4*rand);
		
		System.out.println("The "+suit[draw]+" of "+symbol[draw]);
	}

}
