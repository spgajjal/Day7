package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.MagicDate;

class Question12Test {

	@Test
	
	void testCheckIfMagic() {
		MagicDate date1=new MagicDate() ;
		assertEquals("magic",date1.checkIfMagicDate(LocalDate.of(30,6,5))) ;
	}

}
