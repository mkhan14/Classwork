package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPractice.components.Visible;

public abstract class Screen {

	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;
	
	protected BufferedImage image;
	//constructor used by subclasses
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		//buffered image data tells us what image it is
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		//a is alpha for transparency
		update();
	}

	public void update() {
		//this is where you draw stuff
		//everytime screen updates its gonna draw
		Graphics2D g = image.createGraphics();
		//g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//graphics2d lets you construct things pixel by pixel
		//make background
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v:viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		//g.setFont(new Font("Helvetica", Font.PLAIN, 20));
		//g.drawString("Hello", 40, 80);
		//40 across 40 down
		//g.drawOval(0, 40, 120, 80);
		//g.drawRect(20, 120, 80, 110);
		//g.drawLine(100, 120, 110, 200);
		
		//g.setColor(Color.green);
		//for(int i = 0; i < image.getWidth(); i+=2){
		//	g.drawLine(i, 230, i, 234);
		//}
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() {
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

}
