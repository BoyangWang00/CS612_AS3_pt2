package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTestNegative {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		try 
		{
			test.divide(10,0);
			assertFalse("Should not reach to this line", true);
		}
		catch(ArithmeticException e) 
		{
			  //Expected Exception
		}
	}

}
