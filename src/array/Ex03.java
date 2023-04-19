package array;

public class Ex03 {
public static void main(String[] args) {
	String[] str = {"aaa","bbb","ccc"};
	for(int i=0; i<str.length ; i++) {
		System.out.println( str[i] );
	}
	System.out.println("===========");
	for( String s : str ) {
		System.out.println( s );
	}
	int arr[] = {10, 54, 13, 17, 25, 30};
	for(int i =0; i<arr.length ; i++) {
		if(arr[i] % 2 == 0) {
			System.out.println(arr[i]+":짝수");
			continue;
		}
		System.out.println(arr[i]+":홀수");
	}
}
}







