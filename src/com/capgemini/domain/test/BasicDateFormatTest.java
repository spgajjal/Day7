package com.capgemini.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.BasicDateFormat;

class BasicDateFormatTest {

	@Test
	void testbasic() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02/06/1997", BasicDateFormat.convert1(date));
		
	}
	
	@Test
	void testformat() {

		//Date d1 = new Date(19970602);
		String date="02061997";
		assertEquals("02 jun,1997", BasicDateFormat.convert2(date));
		
	}

}