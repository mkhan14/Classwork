package guiPractice.components;

import java.awt.image.BufferedImage;

public interface Visible {
//this is what is required for you to be visible
	//don't care what kind of object you are
	public BufferedImage getImage();
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean isAnimated();
	public void update();
	//can extend the abstract class
}
