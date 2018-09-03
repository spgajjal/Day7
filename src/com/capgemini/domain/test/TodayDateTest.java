package com.capgemini.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.domain.TodayDate;

public class TodayDateTest {

	@Test
	public void testformat() {

		assertEquals("SATURDAY,SEPTEMBER 1,2018", TodayDate.format());
	}

}
