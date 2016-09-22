package introduction;

public class CardDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = {"King", "Queen", "Jack", "Ten"};
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		int value =(int) (Math.random()*values.length);
		int suit = (int)(Math.random()*suits.length);
		System.out.println(values[value]+" of"+suits[suit]);
		
	}

}
