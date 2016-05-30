package cts2;

public class StoppedGame implements GameState{
	@Override
	public void showMessage(Game gameContext) {
		System.out.println("Game has stopped :( Come back soon!");
		gameContext.setState(this);
		
	}
	
	

}
