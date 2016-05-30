package cts2;

public class Game {
private GameState state;
public Game(){
	state=null;
}

public void setState(GameState state){
	this.state=state;
}
public GameState getState(){
	return state;
}
}
