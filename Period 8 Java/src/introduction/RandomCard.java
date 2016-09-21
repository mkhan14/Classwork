package introduction;

public class RandomCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawCard();
	}
	
	public static void drawCard(){
		String[] suit = {"King", "Queen", "Jack", "Ace"};
		String[] symbol = {"Diamonds", "Spades", "Hearts", "Clubs"};
		
		double rand = Math.random();
		int draw = (int)(4*rand);
		
		System.out.println("The "+suit[draw]+" of "+symbol[draw]);
	}

}
