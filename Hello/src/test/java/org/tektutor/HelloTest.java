package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

	@Test
	public void testSayHello() {
		Hello hello = new Hello();

		String expectedOutput = "Hello World";
		String actualOutput = hello.sayHello();
		
		assertEquals ( expectedOutput, actualOutput );
	}

}
