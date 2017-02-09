package o_lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Example4 {
	private static final List<Phone> PHONES = Example3.PHONES;

	@Test
	public void test() {
		assertThat(howMuchThisPhone("Apple"), is(650));
	}

	@Test
	public void testLambda() {
		assertThat(howMuchThisPhoneLambda("Apple"), is(650));
	}

	/**
	 * Return the phone price by the given phone name
	 * 
	 * @param budget
	 * @return
	 */
	public int howMuchThisPhone(String name) {
		for (Phone phone : PHONES) {
			if (phone.getName().equals(name))
				return phone.getPrice();
		}
		return 0;
	}

	public int howMuchThisPhoneLambda(String name) {
		// TODO : implement me in lambda
		return 0;
	}

}
