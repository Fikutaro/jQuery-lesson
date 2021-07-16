
public class While01 {

	public static void main(String[] args) {

		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}

		int[] arrey = { 0, 1, 2, 3 };
		for (int m = 0; m < arrey.length; m++) {
			System.out.println(arrey[m]);
		}

		int[] arrey2 = { 0, 1, 2, 3 };
		for (int m = 0; m < arrey2.length; m++) {
			if (arrey2[m] % 2 == 0) {
				continue;
			}
			System.out.println(arrey[m]);
		}
	}
}
