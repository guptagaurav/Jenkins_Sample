package org.sample.prog;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestClass {

	@Test
	public void concatenateTest(){
		MyFirstTest test1 = new MyFirstTest();
		String result = test1.concatenateStrings("Hello", "World!");
		
		assertEquals("Hello World!", result);
	}
	
}
