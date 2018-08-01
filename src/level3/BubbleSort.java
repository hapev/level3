package level3;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 2, 8, 3, 3, 6 };

		for (int i : sort(a)) {
			System.out.println(i);
		}

	}

	public static int[] sort(int[] array) {
		boolean changed = false;
		do {
			changed = false;
			for (int i = 1; i < array.length; i++) {

				if (array[i] < array[i - 1]) {
					int iValue = array[i];
					array[i] = array[i - 1];
					array[i - 1] = iValue;
					changed = true;
				}

			}
		} while (changed);

		return array;
	}
}
