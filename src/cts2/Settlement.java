package cts2;

import java.util.ArrayList;
import java.util.List;

public class Settlement {

	private List<Construction> constructions = new ArrayList<Construction>();
	
	public void addConstruction(Construction c){
		constructions.add(c);
	}
	

	
	public void showConstructions(){
		System.out.println("This settlement is composed of: ");
		for(Construction c : constructions){
			System.out.println(c.name().toUpperCase()+", made of "+c.cost()+" units of "+c.material().use().toUpperCase());
		}
	}
}
