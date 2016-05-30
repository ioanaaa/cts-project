package cts2;

public class StrongCharacterDecorator extends CharacterDecorator{

	public StrongCharacterDecorator(Character decoratedCharacter) {
		super(decoratedCharacter);
	}

	
	public void showMessage(){
		decoratedCharacter.showMessage();
		
	}
	
	@Override
	public void seeType() {
		// TODO Auto-generated method stub
		decoratedCharacter.seeType();
		improveStrength();
	}
	
	private void improveStrength(){
		System.out.println("Improved Strength");
	}


	
}
