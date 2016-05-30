package cts2;

import java.util.ArrayList;
import java.util.List;



public class House extends Residence{

	private List<Observer> observers = new ArrayList<Observer>();
	private HouseState state;
	
	public HouseState getState(){
		return state;
	}
	
	public void setState(HouseState state){
		this.state=state;
		notifyEveryone();
	}
	
	public void attach(Observer obs){
		observers.add(obs);
	}
	
	public void notifyEveryone(){
		for(Observer obs: observers){
			obs.doSomething(state);
		}
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "House";
	}
	
	

}
