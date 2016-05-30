package cts2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoldierTest {

	@Test
	public void test_constructor() {
		
		Soldier soldier = new Soldier("Odysseus", SoldierTypes.HERO);		
		assertEquals(400, soldier.getLife());
	}

}
