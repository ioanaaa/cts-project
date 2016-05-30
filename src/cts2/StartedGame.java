package cts2;

public class StartedGame implements GameState {

	@Override
	public void showMessage(Game gameContext) {
		System.out.println("Game has now started! Enjoy!");
		gameContext.setState(this);
		
	}
	

}
