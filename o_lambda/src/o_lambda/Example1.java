package o_lambda;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Example1 {
	public static final List<String> COUNTRY_LIST = Arrays.asList("Indonesia", "Malaysia", "Japan", "India");

	/**
	 * Return the list of element if it partially match
	 * 
	 * @param someWord
	 * @return
	 */
	public static List<String> guessTheCountry(String someWord) {
		List<String> matches = new ArrayList<>();
		for (String country : COUNTRY_LIST) if (country.contains(someWord)) matches.add(country);
		return matches;
	}

	public static List<String> guessTheCountryLambda(String someWord) {
		// TODO : can you implement me in single line of code?
		return null;
	}

	@Test
	public void test() {
		String guessMe = "sia";
		List<String> result = guessTheCountry(guessMe); 
		assertResult(result);
	}
	
	@Test
	public void testLambda() {
		String guessMe = "sia";
		List<String> resultLambda = guessTheCountryLambda(guessMe); 
		assertResult(resultLambda);
	}
	
	private void assertResult(List<String> result) {
		assertTrue(result.contains("Indonesia"));
		assertTrue(result.contains("Malaysia"));
		assertThat(result.size(), is(2));
	}

}
