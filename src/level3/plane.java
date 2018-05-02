package level3;

import java.util.ArrayList;

public class plane {

	public static void main(String[] args) {
		ArrayList<Snake> snakelist = new ArrayList<Snake>();
		int totalvenom = 0;
		int numberOfPassengers = 100;
		for (int x = 0; x < 99; x++) {
			snakelist.add(new Snake(Randomness.randomInt(), Randomness.randomBoolean()));
		}
		for (int x = 0; x < 99; x++) {
			if (snakelist.get(x).isVenomous() == true) {
				totalvenom = totalvenom + snakelist.get(x).getViciousness();
			}

		}
		double chanceOfDeath = totalvenom * 10 / numberOfPassengers;
		System.out.println("TotalVenom" + totalvenom);

		System.out.println(chanceOfDeath + "%");

	}

}
