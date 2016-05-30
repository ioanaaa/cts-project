package cts2;

import java.util.ArrayList;
import java.util.List;

enum SoldierTypes{
	BASIC,
	ELITE,
	HERO
}
public class Soldier extends Observer implements Character{
  private String name;
  private int life;
  private int power;  
  SoldierTypes type;
  private List<Soldier> subordinates = new ArrayList<Soldier>();
  
    
	
	
	
	public Soldier(String name,  SoldierTypes type) {
	super();
	this.name = name;
	this.type = type;
	if(type.equals(SoldierTypes.BASIC)){
		this.power = 10;
		this.life=200;
	}else if(type.equals(SoldierTypes.ELITE)){
		this.power=12;
		this.life=300;
	}else if(type.equals(SoldierTypes.HERO)){
		this.power=14;
		this.life=400;
	}
}

	public Soldier() {
		// TODO Auto-generated constructor stub
	}

	public void add(Soldier s){
		subordinates.add(s);
	}
	
	public void remove(Soldier s){
		subordinates.remove(s);
	}
   
	public List<Soldier> getSoldiers(){
		return subordinates;
	}

/////////////////////////
	
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "\nSoldier [name=" + name + ", life=" + life + ", power=" + power + ", type=" + type + ",\n subordinates="
				+ subordinates + "]";
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public SoldierTypes getType() {
		return type;
	}


	public void setType(SoldierTypes type) {
		this.type = type;
	}


	public List<Soldier> getSubordinates() {
		return subordinates;
	}


	public void setSubordinates(List<Soldier> subordinates) {
		this.subordinates = subordinates;
	}


	@Override
	public void showMessage() {
		System.out.println("\n-- new soldier created --");
		
	}

	@Override
	public void doSomething(HouseState state) {
		String action=null;
		if(state.equals(HouseState.ATTACKED)){
			action="Soldier "+name+" is fighting";
		}else if(state.equals(HouseState.UNDER_CONSTRUCTION)){
			action="Soldier "+name+" is not doing anything";
		}else if(state.equals(HouseState.FINISHED)){
			action="Soldier "+name+" is not doing anyting";
		}
		
		System.out.println(action);
		
	}

	@Override
	public void seeType() {
		// TODO Auto-generated method stub
		System.out.println("Soldier");
	}
	
	
	

}
