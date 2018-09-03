package com.capgemini.domain.test;



import static org.junit.Assert.assertEquals;

import java.io.IOException;


import org.junit.jupiter.api.Test;

import com.capgemini.domain.LineCount;



public class LineCountTest {

	@Test
	void testLineCount() throws IOException {
		
		LineCount l=new LineCount();
		
			
				assertEquals(3,l.LineCount1("C:\\Users\\spgajjal\\Desktop\\span.txt"));
	
	}

	
	
}



