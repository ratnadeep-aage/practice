package com.ratnadeep.codingbat.fronttimes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FrontTimeServiceTest {
	
	@InjectMocks
	private FrontTimeService frontTimeService;
	
	@Test
	void testFrontTimes_should_return_3_copies_of_Cho_when_input_is_Chocolate_and_3() {
		String result = frontTimeService.frontTimes("Chocolate", 3);
		assertNotNull(result);
		assertEquals("ChoChoCho", result);
	}
	
	@Test
	void testFrontTimes_should_return_2_copies_of_Ab_when_input_is_Ab_and_2() {
		String result = frontTimeService.frontTimes("Ab", 2);
		assertNotNull(result);
		assertEquals("AbAb", result);
	}
	
	@Test
	void testFrontTimes_should_return_empty_string_when_input_is_empty_string() {
		String result = frontTimeService.frontTimes("", 10);
		assertNotNull(result);
		assertEquals("", result);
	}
	
	@Test
	void testFrontTimes_should_return_empty_string_when_input_is_null() {
		String result = frontTimeService.frontTimes(null, 10);
		assertNotNull(result);
		assertEquals("", result);
	}
}
