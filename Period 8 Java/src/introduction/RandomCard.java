package introduction;

public class RandomCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three",
			"Two", "One"
		};
		String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		System.out.println("The "+suit[drawSuit()]+" of "+symbol[drawSymbol]);
		//drawCard();
	}
	
	public static int drawSuit(){
		double rand = Math.random();
		int drawSu = (int)(suits.length*rand);
		return drawSu;
		
	}
	
	public static int drawSymbol(){
		double rand = Math.random();
		int drawSy = (int)(symbols.length*rand);
		return drawSy;
		
		//System.out.println("The "+suit[draw]+" of "+symbol[draw]);
	}

}
