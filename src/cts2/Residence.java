package cts2;

public abstract class Residence implements Construction{

		
	@Override
	public Material material() {
		// TODO Auto-generated method stub
		return new Wood();	}

	@Override
	public abstract float cost();
		

	
	
	
}
