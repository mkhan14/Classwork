package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen {

	private Graphic yoshi;
	private Button back;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		yoshi = new Graphic(200,200,0.25, "resources/sampleImages/yoshi.jpg");
		back = new Button(50, 50, 100, 60, "Back", Color.GRAY, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(yoshi);
		viewObjects.add(back);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
		
	}

}
