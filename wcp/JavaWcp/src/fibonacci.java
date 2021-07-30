
public class fibonacci {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int n3 = n1 + n2;
		while (n1 <= 1000) {
			System.out.println(n1);
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
