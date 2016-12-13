package guiPractice;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{
	
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
		//stop control from last screen
		if(currentScreen != null){
			if(currentScreen.getMouseListener() != null){
				removeMouseListener((MouseListener) currentScreen.getMouseListener());
			}
			if(currentScreen.getMouseMotionListener() != null){
				removeMouseMotionListener((MouseMotionListener) currentScreen.getMouseMotionListener());
			}
		}
		currentScreen = screen;
		//add controls for new screen
		if(currentScreen != null){
			addMouseListener((MouseListener) currentScreen.getMouseListener());
			addMouseMotionListener((MouseMotionListener) currentScreen.getMouseMotionListener());
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
		//graphics is how you draw things
		//abstraction...interfaces
		//guidelines for any games we program
	}
	
	public void run(){
		while(true){
			currentScreen.update();
			//update the window
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
