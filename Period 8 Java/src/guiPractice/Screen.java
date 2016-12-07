package guiPractice;

import java.awt.Graphics2D;
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
		//everytime screen updates its gonna draw
		Graphics2D g = image.createGraphics();
		g.drawString(, 40, 40);
	}
	
	public BufferedImage getImage(){
		return image;
	}

}
