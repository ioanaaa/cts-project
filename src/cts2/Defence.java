package cts2;

public abstract class Defence implements Construction{

	@Override
	public Material material() {
		// TODO Auto-generated method stub
		return new Stone();	}

	@Override
	public abstract float cost();
		

}
