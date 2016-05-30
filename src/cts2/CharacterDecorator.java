package cts2;

public abstract class CharacterDecorator implements Character {

	protected Character decoratedCharacter;
	
	public CharacterDecorator(Character decoratedCharacter){
		this.decoratedCharacter=decoratedCharacter;
	}
	@Override
	public void showMessage() {
		decoratedCharacter.showMessage();		
	}

}
