package com.chandu.ValidParenthses;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.chandu.validParentheses.ValidParentheses;

public class ValidParenthesesTest {
	
	@Test
	public void test() {
		ValidParentheses validParentheses = new ValidParentheses();
		List<String> inputListTrue = Arrays.asList("",
				"(d,jd{tyhth}frgrfg)",
				"sfgvdf({dfdf})[][{}(())]",
				"");
		
		List<String> inputListFalse = Arrays.asList(")dsg{}[]",				
				"((((}}}}",
				"dkjgnsk}{}{}((");
		for(String inputTrue: inputListTrue) {
			assertEquals(true, validParentheses.isValidParenthses(inputTrue));
		}
		
		for(String inputFalse: inputListFalse) {
			assertEquals(false, validParentheses.isValidParenthses(inputFalse));
		}
	}
}
