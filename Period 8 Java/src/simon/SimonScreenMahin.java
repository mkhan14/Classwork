package simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenMahin extends ClickableScreen implements Runnable {

	private ArrayList<MoveInterfaceMahin> move;
	private ProgressInterfaceMahin progress;
	private ButtonInterfaceMahin button;
	private TextLabel label;
	private ButtonInterfaceMahin[] buttons;
	 
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private ArrayList<MoveInterfaceMahin> sequence;
	private int numberOfButtons;
	
	public SimonScreenMahin(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		changeText("");
		nextRound();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		//addButtons();
		Color[] colors = {Color.red, Color.blue, new Color(240,160,70), new Color(20,255,140), Color.yellow, new Color(180,90,210)};
		String[] names = {"RED", "BLUE", "ORANGE", "GREEN", "YELLOW", "PURPLE"};
		int buttonCount = 6;
		buttons = new ButtonInterfaceMahin[buttonCount];
		for(int i = 0; i < buttonCount; i++ ){
			buttons[i] = getAButton();
			buttons[i].setName(names[i]);
			buttons[i].setColor(colors[i]);
			buttons[i].setX(160 + (int)(100*Math.cos(i*2*Math.PI/(buttonCount))));
			buttons[i].setY(200 - (int)(100*Math.sin(i*2*Math.PI/(buttonCount))));
			final ButtonInterfaceMahin b = buttons[i];
			System.out.println(b+" has x = "+b.getX()+", y ="+b.getY());
			b.dim();
			buttons[i].setAction(new Action() {

				public void act() {

						Thread buttonPress = new Thread(new Runnable() {
							
							public void run() {
								b.highlight();
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
								
							}
						});
						buttonPress.start();
						

						if(acceptingInput && sequence.get(sequenceIndex).getButton() == b){
							sequenceIndex++;
						}else if(acceptingInput){
							gameOver();
							return;
						}
						if(sequenceIndex == sequence.size()){
							Thread nextRound = new Thread(SimonScreenMahin.this);
							nextRound.start();
						}
					}

				

			});
			viewObjects.add(buttons[i]);
		}
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
		int selection = (int) (Math.random()*buttons.length);
		while(selection == lastSelectedButton){
			selection = (int)(Math.random()*buttons.length);
		}
		lastSelectedButton = selection;
		//return getMove(b);
		return new Move(buttons[selection]);
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
	
	public void nextRound() {
		acceptingInput = false;
		roundNumber ++;
		progress.setRound(roundNumber);
		sequence.add(randomMove());
		progress.setSequenceLength(sequence.size());
		changeText("Simon's turn.");
		label.setText("");
		showSequence();
		changeText("Your turn.");
		label.setText("");
		acceptingInput = true;
		sequenceIndex = 0;
}

	private void showSequence() {
		ButtonInterfaceMahin b = null;
		for(MoveInterfaceMahin m: sequence){
			if(b!=null)b.dim();
			b = m.getButton();
			b.highlight();
			try {
				Thread.sleep((long)(2000*(2.0/(roundNumber+2))));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		b.dim();
		
	}

	private void changeText(String string) {
		try{
			label.setText(string);
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

	private void addButtons() {
		int numberOfButtons = 6;
		new Color(100,180,255);
		for(int i = 0; i < numberOfButtons; i++){
			getAButton();
		}
		
	}

	private ButtonInterfaceMahin getAButton() {
		return null;
		
	}

}
