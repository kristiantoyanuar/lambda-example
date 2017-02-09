package o_lambda;

class PhoneFactory {
	public static Phone create(String name, int price) {
		return new Phone(name, price);
	}
}

