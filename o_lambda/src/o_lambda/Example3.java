package o_lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Example3 {
	public static final List<Phone> PHONES = Arrays.asList(PhoneFactory.create("Samsung", 550),
			PhoneFactory.create("Apple", 650), PhoneFactory.create("LG", 250), PhoneFactory.create("Nokia", 350),
			PhoneFactory.create("Sagem", 50));

	@Test
	public void test() {
		List<String> phoneNames = suggestMeAPhone(200, 400);
		assertPhoneNames(phoneNames);
	}

	@Test
	public void testLambda() {
		List<String> phoneNamesLambda = suggestMeAPhoneLambda(200, 400);
		assertPhoneNames(phoneNamesLambda);
	}

	private void assertPhoneNames(List<String> phoneNames) {
		assertThat(phoneNames.size(), is(2));
		assertThat(phoneNames.contains("LG"), is(true));
		assertThat(phoneNames.contains("Nokia"), is(true));
	}

	/**
	 * Return the phone names by given budget
	 * 
	 * @param budget
	 * @return
	 */
	public List<String> suggestMeAPhone(int budgetFrom, int budgetTo) {
		List<String> names = new ArrayList<String>();
		for (Phone phone : PHONES) {
			if (phone.getPrice() >= budgetFrom && phone.getPrice() <= budgetTo)
				names.add(phone.getName());
		}
		return names;
	}

	public List<String> suggestMeAPhoneLambda(int budgetFrom, int bugdetTo) {
		// TODO : implement me in lambda
		return null;
	}

}
