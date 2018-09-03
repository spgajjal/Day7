package com.capgemini.domain.test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.WordCount;

public class WordCountTest{
	@Test
	void testCount() {
		File file=new File("C:\\Users\\spgajjal\\Desktop\\span.txt");
		
		assertEquals(4,WordCount.countWord(file));
	}


	
}