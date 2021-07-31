
public class Array {
	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] * 2);
		}
		System.out.println();

		for (int i = 9; i >= 0; i--) {
			System.out.println(array[i]);

		}
		System.out.print("偶数:");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.print(" " + array[i]);
			}
		}

		System.out.println();
		System.out.print("奇数:");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 1) {

				System.out.print(" " + array[i]);
			}

		}
	}
}
