package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("Javabean");
		assertEquals(3,output);
	}

}
