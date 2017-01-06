package simon;

import guiPractice.components.Visible;

public interface ProgressInterfaceMahin extends Visible {
	void setRound(int roundNumber);

	void setSequenceLength(int size);
	
	void gameOver();
}
