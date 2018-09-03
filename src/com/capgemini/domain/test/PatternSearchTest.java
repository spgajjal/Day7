package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.PatternSearch;

class PatternSearchTest {

	@Test
	
		void testPatternSearch() throws FileNotFoundException, IOException {
			File file = new File("C:\\Users\\spgajjal\\Desktop\\span.txt");

			assertEquals("Line number 3 : Ok spandhana\n", PatternSearch.findString(file,"spandhana"));
			assertEquals("Line number 2 : how are you,I am good neeraj.\n", PatternSearch.findString(file,"neeraj"));
		}
	}


