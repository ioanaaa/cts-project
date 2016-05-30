package cts2;

enum mythologies{
	GREEK,
	EGYPTIAN,
	NORSE
}

public class God {
	
	private String name;
	private mythologies mythology;
	
	
	private static God instance = new God();
	private God(){}
	public static God getInstance(){
		return instance;
	}
	
	public void choose(String name){
		this.name=name;
		String name2= name.toLowerCase();
		
		switch(name2){
		case "poseidon":
		case "zeus":
		case "hades":
		     this.mythology=mythologies.GREEK;
		     break;
		case "ra":
		case "isis":
		case "set":
			this.mythology=mythologies.EGYPTIAN;
			break;
		case "odin":
		case "thor":
		case "loki":
			this.mythology=mythologies.NORSE;
			break;
		default: 
			System.out.println("invalid god name");
			break;
		}
		
		System.out.println("You have chosen "+name.toString().toUpperCase()+", a "+mythology.toString()+" god.");
		
	}
	public  String getName() {
		return name;
	}
	
	public  mythologies getMythology() {
		return mythology;
	}
	
	
	
}
