package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\Users\\spgajjal\\Desktop\\span.txt");

		assertEquals("Number of vowels = 28\nNumber of consonants = 34", VowelsAndConsonants.findVowelAndConsonant(file));
	}

		
	}


