package trond.testbenk.hallo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HallomannTest {

	@Test
	public void test() {
		assertEquals("Hei Lars", Hallomann.jegHeter("Lars"));
	}

}
