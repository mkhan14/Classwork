package whackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPractice.components.Component;

public class Player extends Component implements PlayerInterface {

	private int score;
	
	public Player(int x, int y, int w, int h) {
		super(x, y, 100, 100);
		int score = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseScore(int i) {
		// TODO Auto-generated method stub
		score+=i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.black);
		g.drawOval(0,0,100,100);
		g.drawString(""+ score, 45,55);
	}

}
