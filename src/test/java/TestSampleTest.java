package test.java;
import org.sample.prog.TestSample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSampleTest {

	@Test
	public void test() {
		TestSample test1 = new TestSample();
		String result = test1.concatenateStrings("Hello", "World!");
		
		assertEquals("Hello dssWorld!", result);
	}

}
