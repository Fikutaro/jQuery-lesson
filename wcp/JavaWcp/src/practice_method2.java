
public class practice_method2 {
public static void main(String[] args){
	pyramid(5,'a');
	
} 

static void pyramid(int n, char ch) {
	for (int i = 0; i< n; i++) {
		for (int m = 0; m <= i; m++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}


}
