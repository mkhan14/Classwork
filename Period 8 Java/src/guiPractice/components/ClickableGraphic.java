package guiPractice.components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import guiPractice.components.Action;

import guiPractice.sampleGames.MouseFollower;

public class ClickableGraphic extends Graphic implements Clickable, MouseListener {
	private Action action;
	private ClickableGraphic yoshi;

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX()+getWidth() && y > getY()
				&& y < getY() + getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(action != null){
			action.act();
		}
	}
	
	public void setAction(Action a){
		this.action = a;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(yoshi.isHovered(e.getX(), e.getY())){
			yoshi.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		yoshi = new ClickableGraphic(20,20,0.2, "resources/sampleImages/yoshi.jpg");
		yoshi.setAction(new Action(){
			@Override
			public void act() {
				// TODO Auto-generated method stub
				yoshi.setX(getX() + 10);
			}
		});
		viewObjects.add(yoshi);
	}

}
