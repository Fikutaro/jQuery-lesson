import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array {
public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	int array[] = new int[10];
	
	for (int i = 0; i < array.length; i++)
	array[i] = Integer.parseInt(br.readLine());
	
	System.out.println();
	
	for( int i = 0 ; i < 10 ; i++ )
	    System.out.println( array[i] * 2 );
}
}
