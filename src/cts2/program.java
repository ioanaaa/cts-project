package cts2;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//state		

		System.out.println("\nSTART GAME\n");
		Game game= new Game();		
		StartedGame startedGame = new StartedGame();
		startedGame.showMessage(game);		
		
	
		//singleton
		
		God god = God.getInstance();
		god.choose("zeus");
		
		//factory
		
		CharacterFactory characterFactory = new CharacterFactory();
		
		Character villager1= characterFactory.getCharacter("villager");	
		Character soldier1= characterFactory.getCharacter("soldier");
		Character soldier2=characterFactory.getCharacter("soldier");
		
		soldier1.showMessage();
		villager1.showMessage();
		
		//composite
		
		Soldier eliteSoldier= new Soldier("Myrmidon", SoldierTypes.ELITE);		
		
		Soldier basicSoldier1= new Soldier("Hypaspist", SoldierTypes.BASIC);		
		
		Soldier basicSoldier2= new Soldier("Peltast", SoldierTypes.BASIC);		
		
		Soldier heroSoldier= new Soldier("Heracles",SoldierTypes.HERO);
		
		
		heroSoldier.add(eliteSoldier);
		eliteSoldier.add(basicSoldier1);
		eliteSoldier.add(basicSoldier1);
		
		System.out.println(heroSoldier);
		
		
		//builder
		
		
		SettlementBuilder sb = new SettlementBuilder();
		Settlement villageSettlement = sb.buildVillagerSettlement();
		System.out.println("\nVILLAGE SETTLEMENT: ");
		villageSettlement.showConstructions();
		
		
		
		Settlement armySettlement = sb.buildArmySettlement();
		System.out.println("\nARMY SETTLEMENT: ");
		armySettlement.showConstructions();
		
		
		//observer
		
		Villager villager2= new Villager();
		
		House house = new House();
		
		house.attach(heroSoldier);
		house.attach(eliteSoldier);
		house.attach(villager2);
		
		System.out.println("\n--House is now under construction--");
		house.setState(HouseState.UNDER_CONSTRUCTION);
		
		System.out.println("\n--House is finished!--");
		house.setState(HouseState.FINISHED);
		
		System.out.println("\n--House is under attack!--");
		house.setState(HouseState.ATTACKED);		
		
		
		//Decorator
		Character resistantVillager = new ResistantCharacterDecorator(new Villager());
		Character strongSoldier = new StrongCharacterDecorator(new Soldier());
		
		System.out.println("\nnormal villager:");
		villager1.seeType();
		
		System.out.println("\nresistant villager:");
		resistantVillager.seeType();
		
		System.out.println("\nstrong soldier:");
		strongSoldier.seeType();
		
				
		//state		
		System.out.println("\n PAUSE GAME");
	    PausedGame pausedGame = new PausedGame();
		pausedGame.showMessage(game);	
		
		System.out.println("\n STOP GAME");
		StoppedGame stoppedGame = new StoppedGame();
		stoppedGame.showMessage(game);	
	}

}
