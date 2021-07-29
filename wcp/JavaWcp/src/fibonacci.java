
public class fibonacci {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = x + y;
		while (x <= 1000) {
			System.out.println(x);
			x = y;
			y = z;
			z = x + y;

		}
	}
}
