package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistenceTest {

	@Test
	void testExistence() {
		
		File file = new File("C:\\Users");
		assertEquals(true, file.exists());
		assertEquals(false, file.isFile());
	}

}
