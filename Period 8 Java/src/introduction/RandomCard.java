package introduction;

public class RandomCard {

	//String[] suits;
	//String[] symbols;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three",
		"Two", "One"};
		String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		System.out.println("The "+suits[drawSuit()]+" of "+symbols[drawSymbol()]);
		//drawCard();
	}
	
	/*public static void drawCard(){
		String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", 
				"Five", "Four", "Three", "Two", "One"};
		String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		//double rand = Math.random();
		//int draw = (int)(4*rand);
		int symbol =(int) (Math.random()*symbols.length);
		int suit = (int)(Math.random()*suits.length());
		*/
	
	public static int drawSuit(){
		String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three",
				"Two", "One"};
			//String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		double rand = Math.random();
		int suit = (int)(suits.length*rand);
		return suit;

		//System.out.println("The "+suits[suit]+" of "+symbols[symbol]);
	}
	
	public static int drawSymbol(){
		//String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three",
				//"Two", "One"};
			String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		double rand = Math.random();
		int symbol = (int)(symbols.length*rand);
		return symbol;
		
		//System.out.println("The "+suit[draw]+" of "+symbol[draw]);
	}

}
