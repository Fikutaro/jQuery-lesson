public class practice_method {

	public static void main(String[] args){
		System.out.println("3の2乗" + pow2(3));
		System.out.println("平均" + ave(3,7));
	} 
	
	static int pow2(int n)
	{
		return n * n;
	}
	
	static int ave(int n,int m) {
		return (n + m) / 2;
	}
}
