
public class Pyramid {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int r = i; r > 0; r--){
				System.out.print("　");
			}
			for (int h = i * 2; h < 9; h++){
				System.out.print("＊");
			}
			System.out.print("\n");
		}
	}
}