package KNURE.Lisanets;

import java.util.Arrays;

public class ArrayService {

	public static void main(String arr[]) {

		ArrayService arrayService = new ArrayService();
		int[] array = new int[100];
		arrayService.fillArray(array);
		System.out.println(Arrays.toString(array));

	}

	private void fillArray(int[] arr) {
		int num = 1;

		for (int i = 0; i < 100; i++) {

			while (true) {
				if (isSimple(num)) {
					arr[i] = num;
					num++;
					break;
				} else {
					num++;
				}
			}

		}

	}

	private boolean isSimple(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}

		return true;
	}

}
