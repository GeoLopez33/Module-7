package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class toStringTest {

	@Test
	void test() {
		WordC test = new WordC("The");
		String output = test.toString();
		assertEquals("The", output);
	}

	
	//The toString method should only return the word itself in a String form
}
