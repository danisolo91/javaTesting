package org.itacademy.javatesting.junit;

import org.junit.Test;

public class IndexOutOfBoundsTest {

	@Test(expected = IndexOutOfBoundsException.class) 
	public void returnsIndexOutOfBounds() {
		IndexOutOfBounds.getArrayValue(0);
	}
}
