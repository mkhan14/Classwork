package simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenMahin extends ClickableScreen implements Runnable {

	private ArrayList<MoveInterfaceMahin> move;
	private ProgressInterfaceMahin progress;
	private ButtonInterfaceMahin button;
	private TextLabel label;
	 
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private ArrayList<MoveInterfaceMahin> sequence;
	private int numberOfButtons;
	
	public SimonScreenMahin(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceMahin>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}
	private MoveInterfaceMahin randomMove() {
		ButtonInterfaceMahin b;
		int selection = (int) (Math.random()*numberOfButtons);
		if(selection == lastSelectedButton){
			selection = (int)(Math.random()*numberOfButtons);
		}
		lastSelectedButton = selection;
		return getMove(b);
	}

	private MoveInterfaceMahin getMove(Button b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceMahin getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 6;
		new Color(100,180,255);
		for(int i = 0; i < numberOfButtons; i++){
			getAButton();
		}
		
	}

	private void getAButton() {
		// TODO Auto-generated method stub
		
	}

}
