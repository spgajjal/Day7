package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.BinaryInteger;

class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\spgajjal\\WorkSpace\\CreateData.dat");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
