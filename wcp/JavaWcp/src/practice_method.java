public class practice_method {

	public static void main(String[] args){
		System.out.println("3の2乗" + pow2(3));
		System.out.println("平均" + ave(3,7));
		System.out.println(max(9,8,7));
	}

	static int pow2(int n) {
		return n * n;
	}

	static int ave(int n, int m) {
		return (n + m) / 2;
	}

	static int max(int n, int m, int o) {
		if (n < m) {
			if (m < o) {
				return o;
			}
			else {
				return m;
			}
		}
		else{
			if (n < o) {
				return o;
			}
			else {
				return n;
			}
		}
	}
}
