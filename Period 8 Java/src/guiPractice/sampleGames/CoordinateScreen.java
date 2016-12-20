package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
//this is where i put label
	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,550,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		
		myButton = new Button(40, 200, 80, 40, "Button", new Color(100,100,250), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		picture = new Graphic(50,50,.5,"resources/sampleImages/yoshi.jpg");
		viewObjects.add(label);//push
		viewObjects.add(paragraph);
		viewObjects.add(myButton);
		viewObjects.add(picture);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at" + m.getX()+", "+m.getY());
		update();
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
		//anytime you wanna use mouse you override method
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(myButton.isHovered(e.getX(), e.getY())){
			myButton.act();
		}
		
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

}
