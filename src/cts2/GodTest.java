package cts2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GodTest {

	@Test
	public void test_choose() {
		God god = God.getInstance();
		god.choose("Ra");		
		assertEquals(mythologies.EGYPTIAN, god.getMythology());
	}

}
