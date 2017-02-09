package o_lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Example2 {

	public static List<Integer> NUMBERS = Arrays.asList(1, 2, 3);

	@Test
	public void testSum() {
		assertThat(doCount(NUMBERS), is(14));
		assertThat(doCountLambda(NUMBERS), is(14));
	}

	private Integer doCount(List<Integer> numbers) {
		Integer sum = 0;
		for (Integer num : numbers)
			sum = sum + (num * num);
		return sum;
	}

	private Integer doCountLambda(List<Integer> numbers) {
		// TODO : implement me in lambda
		return null;
	}

}
