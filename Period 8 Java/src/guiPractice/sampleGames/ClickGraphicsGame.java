package guiPractice.sampleGames;

import guiPractice.GUIApplication;
import guiPractice.components.ClickableGraphic;

public class ClickGraphicsGame extends GUIApplication {

	private static ClickableGraphic pic;
	
	public ClickGraphicsGame() {
		super(500,500);
	}
	
	public static void main(String[] args){
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		pic = new ClickableGraphic(getWidth(),
				getHeight(), "resources/sampleImages/yoshi.jpg");
		setScreen(pic);
	}

}
