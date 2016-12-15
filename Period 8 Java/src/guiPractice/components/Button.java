package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{

	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color,
			guiPractice.sampleGames.Action action2) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action2;
		update();
		
		// TODO Auto-generated constructor stub
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
		update();
		//updating pictures not data...everytime you wanna change something
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0,0,getWidth(),getHeight(),35,25);
		g.setColor(Color.black);
		g.drawRoundRect(getX(), getY(), getWidth(), getHeight(), 25, 35);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		if(getText() != null){
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.drawString(getText(), 4, getHeight()-5);	
		}
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(x < getX() + getWidth() && x > getX() && y < getY() + getHeight() && y > getY()){
			return true;
		}
		return false;
	}

	@Override
	public void act() {
		action.act();
	}
	
}
