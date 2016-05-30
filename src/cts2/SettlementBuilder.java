package cts2;

public class SettlementBuilder {

	public Settlement buildVillagerSettlement(){
		Settlement settlement = new Settlement();
		settlement.addConstruction(new House());
		settlement.addConstruction(new Wall());
		return settlement;
	}
	
	public Settlement buildArmySettlement(){
		Settlement settlement = new Settlement();
		settlement.addConstruction(new Fortress());
		settlement.addConstruction(new Tower());
		return settlement;
	}
}
