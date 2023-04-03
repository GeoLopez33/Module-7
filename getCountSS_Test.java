package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getCountSS_Test {

	@Test
	void test() {
		WordC test = new WordC("The");
		String output = test.getCountSS();
		assertEquals("The: 1", output);
	}

	//This is the format it should come out as when using this method
}
