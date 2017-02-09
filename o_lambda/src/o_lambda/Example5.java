package o_lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Example5 {
	private static final List<Phone> PHONES = Example3.PHONES;

	@Test
	public void test() {
		assertThat(purchaseItem(PHONES.get(1), 3), is(1950L));
	}

	@Test
	public void testLambda() {
		assertThat(pruchaseItemLambda(PHONES.get(1), 3), is(1950L));
	}

	private Long purchaseItem(Phone phone, int qty) {
		return new PurchaseProcessor() {

			@Override
			public Long purchase(int price, int quantity) {
				return (long) (price * quantity);
			}
		}.purchase(phone.getPrice(), qty);
	}
	
	private Long pruchaseItemLambda(Phone phone, int qty) {
		
		return 0L;
	}

}
