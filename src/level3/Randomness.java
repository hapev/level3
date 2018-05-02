package level3;

import java.util.Random;

public class Randomness {

	static boolean randomBoolean() {
		Random random = new Random();
		return random.nextBoolean();
	}

	static int randomInt() {
		Random random = new Random();
		return random.nextInt(10);

	}
}
