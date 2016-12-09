package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Screen {

	private int width;
	private int height;
	protected BufferedImage image;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		initImage();
	}

	private void initImage() {
		//buffered image data tells us what image it is
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		//a is alpha for transparency
		update();
	}

	public void update() {
		//this is where you draw stuff
		//everytime screen updates its gonna draw//
		Graphics2D g = image.createGraphics();
		//g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//graphics2d lets you construct things pixel by pixel
		g.setColor(Color.black);
		g.setFont(new Font("Helvetica", Font.PLAIN, 20));
		g.drawString("Hello", 40, 80);
		//40 across 40 down
		g.drawOval(0, 40, 120, 80);
		g.drawRect(20, 120, 80, 110);
		g.drawLine(100, 120, 110, 200);
		
		g.setColor(Color.green);
		for(int i = 0; i < image.getWidth(); i+=2){
			g.drawLine(i, 230, i, 234);
		}
	}
	
	public BufferedImage getImage(){
		return image;
	}

}
