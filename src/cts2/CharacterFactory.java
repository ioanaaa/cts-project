package cts2;

public class CharacterFactory {

	public Character getCharacter(String type){
		if(type==null) return null;
		if(type.equalsIgnoreCase("villager")){
			return new Villager();
		}else if(type.equalsIgnoreCase("soldier")){
			return new Soldier();
		}
		return null;
	}
}
//poate mai bagam si un hero