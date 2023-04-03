package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordCTest {

	@Test
	void test() {
		WordC test = new WordC("The");
		int output = test.getCount();
		assertEquals(1, output);
	}

	//When a word new word is initialized, it should always start at 1
	
}
