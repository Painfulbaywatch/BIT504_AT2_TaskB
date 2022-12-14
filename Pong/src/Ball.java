import java.awt.Color;

public class Ball extends Sprite{
	
	private final static Color BALL_COLOUR = Color.red;
	private final static int BALL_WIDTH = 35;
	private final static int BALL_HEIGHT = 35;
	
	public Ball(int panelWidth, int panelHeight) {
		setColour(BALL_COLOUR);
		setHeight(BALL_HEIGHT);
		setWidth(BALL_WIDTH);
		
		
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
	}

}
