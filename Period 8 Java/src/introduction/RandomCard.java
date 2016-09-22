package introduction;

public class RandomCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawCard();
	}
	
	public static void drawCard(){
		String[] suits = {"King", "Queen", "Jack", "Ace", "Ten", "Nine", "Eight", "Seven", "Six", 
				"Five", "Four", "Three", "Two", "One"};
		String[] symbols = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		//double rand = Math.random();
		//int draw = (int)(4*rand);
		int symbol =(int) (Math.random()*symbols.length);
		int suit = (int)(Math.random()*suits.length);
		
		System.out.println("The "+suits[suit]+" of "+symbols[symbol]);
	}

}
