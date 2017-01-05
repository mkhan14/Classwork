package whackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private double appearanceTime;
	
	public Mole(int x, int y, double scale, String imageLocation) {
		super(x, y, .50, "resources/sampleImages/yoshi.jpg");
		// TODO Auto-generated constructor stub
	}

	public Mole(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public Mole(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public double getAppearanceTime(double d) {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(double d) {
		// TODO Auto-generated method stub
		this.appearanceTime = d;
	}

	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAppearanceTime(int i) {
		// TODO Auto-generated method stub
		
	}

}
