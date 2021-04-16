package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testnum {

	@Test
	public void test() {
		jUnitmethods obj = new jUnitmethods();
		int res = obj.addNum(100, 20);
		assertEquals(120,res);
	}

}
