package actions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testGiveMeNumber() {
		assertEquals(Utils.giveMeNumber(1), -2);
		assertEquals(Utils.giveMeNumber(0), 0);
		assertEquals(Utils.giveMeNumber(5), 5);
	}
}
