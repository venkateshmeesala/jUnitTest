package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testStr {

	@Test
	public void test() {
		jUnitmethods str = new jUnitmethods();
		String venky = str.addStr("venkatesh", "meesala");
		assertEquals("venkateshmeesala",venky);
	}

}
