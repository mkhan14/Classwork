package guiPractice.sampleGames;

import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Clickable;
import guiPractice.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener, Runnable {

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);

	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	public abstract void initAllObjects(ArrayList<Visible> viewObjects);

	public void mouseClicked(MouseEvent a){
		for(int i = 0; i < clickables.size(); i++){
			Clickable c = clickables.get(i);
			if(c.isHovered(a.getX(), a.getY())){
				c.act();
				break;
			}
		}
	}
	
	 public void addObjects(Visible v){
		 super.addObject(v);
		 if(v instanceof Clickable){
			 clickables.add((Clickable)v);
		 }
	 }
	 
	 public void remove(Visible v){
		 super.remove(v);
		 clickables.remove(v);
	 }
}
