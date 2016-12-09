package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{
	
	private Screen currentScreen;

	//main method for practice only
	//there is swing package...textbox...don't use...incompatible
	//exit operation, close window close program
	
		//ABSTRACTION
		//interface-description of methods
		//abstract class-same methods and same descriptions of methods
	//you cannot instantiate an abstract class
	
	public GUIApplication(){
		//constructor for creating a window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x, y, width, height);
		initScreen();
		setVisible(true);
	}

	//method for creating and setting the starting screen
	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		currentScreen = screen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
		//graphics is how you draw things
		//abstraction...interfaces
		//guidelines for any games we program
	}

}
