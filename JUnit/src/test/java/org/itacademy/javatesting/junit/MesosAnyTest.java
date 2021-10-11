package org.itacademy.javatesting.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MesosAnyTest {
	
	MesosAny mesos = new MesosAny();

	@Test
	public void mesosHas12Positions() {
		assertEquals(mesos.getMesos().size(), 12);
	}
	
	@Test
	public void mesosIsNotNull() {
		assertNotNull(mesos);
	}
	
	@Test
	public void mesosHasAgostInPosition8() {
		assertTrue(mesos.getMesos().get(8).equals("Agost"));
	}
}
