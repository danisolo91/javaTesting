package org.itacademy.javatesting.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoDniTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ 12345678, "Z" },
			{ 87654321, "X" },
			{ 12312312, "K" },
			{ 45645645, "Y" },
			{ 14715912, "Y" },
			{ 55544477, "Y" },
			{ 65165114, "L" },
			{ 98498445, "W" },
			{ 43243242, "E" },
			{ 66699987, "X" } 
		});
	}
	
	private int fInput;

    private String fExpected;

    public CalculoDniTest(int input, String expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

	@Test
	public void calculateDniLetter() {
		assertEquals(fExpected, CalculoDni.getLetra(fInput));
	}
}
