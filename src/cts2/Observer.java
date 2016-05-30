package cts2;

public abstract class Observer {

	protected House house;
	public abstract void doSomething(HouseState state);
}
