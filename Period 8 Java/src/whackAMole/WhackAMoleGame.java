package whackAMole;

import guiPractice.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(),
				getHeight());
		setScreen(wams);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();
		//assignment 6 finish blue part
	}

}
