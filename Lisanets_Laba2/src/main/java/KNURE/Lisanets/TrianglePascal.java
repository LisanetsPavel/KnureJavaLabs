package KNURE.Lisanets;

public class TrianglePascal {

	public static void main(String[] args) {

		TrianglePascal trianglePascal = new TrianglePascal();
		int array[][] = new int[10][];
		trianglePascal.fillArray(array);
		trianglePascal.demoArray(array);

	}

	public int pascal(int i, int j) {
		return (j == 0 || j == i) ? 1 : pascal(i - 1, j - 1) + pascal(i - 1, j);
	}

	public void fillArray(int[][] array) {
		for (int i = 0; i < 10; i++) {
			array[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				array[i][j] = pascal(i, j);
			}
		}
	}

	public void demoArray(int[][] array) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
