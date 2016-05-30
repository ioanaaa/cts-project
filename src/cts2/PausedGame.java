package cts2;

public class PausedGame implements GameState{

	@Override
	public void showMessage(Game gameContext) {
		System.out.println("Game is paused.");
		gameContext.setState(this);
		
	}
	
	
}
