package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void test() {
		int source = 6;
		int expected = 15;
		
		int actual = 3 * source;
		assertEquals("\nНу кто так считает?\n", expected, actual);
	}

}
