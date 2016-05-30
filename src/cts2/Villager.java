package cts2;

public class Villager extends Observer implements Character {
	private int life;
	private int power;  
	
	@Override
	public void showMessage() {
		System.out.println("\n-- new villager created --");
		
	}

	
	
	public Villager() {		
		this.life = 100;
		this.power = 8;
	}



	@Override
	public void doSomething(HouseState state) {
		String action=null;
		if(state.equals(HouseState.ATTACKED)){
			action="Villager is running away";
		}else if(state.equals(HouseState.UNDER_CONSTRUCTION)){
			action="Villager is building the house";
		}else if(state.equals(HouseState.FINISHED)){
			action="Villager is not doing anyting";
		}
		
		System.out.println(action);
		
		
	}

	@Override
	public void seeType() {
		// TODO Auto-generated method stub
		System.out.println("Villager");
	}
	
	


}
