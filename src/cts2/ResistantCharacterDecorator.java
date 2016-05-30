package cts2;

public class ResistantCharacterDecorator extends CharacterDecorator{

	public ResistantCharacterDecorator(Character decoratedCharacter) {
		super(decoratedCharacter);
	}

	
	public void showMessage(){
		decoratedCharacter.showMessage();		
	}
	
	@Override
	public void seeType() {
		// TODO Auto-generated method stub
		decoratedCharacter.seeType();
		improveResistance();
	}
	private void improveResistance(){
		System.out.println("Improved resistance");
	}


	
	
}
