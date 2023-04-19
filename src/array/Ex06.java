package array;

public class Ex06 {
public static void main(String[] args) {
	int[] arr = new int[5];
	System.out.println( arr[0] );
	String[] str = new String[5];
	System.out.println( str[0] );
	
	str[0] = "aaaa";
	if( str[0] != null ) {
		System.out.println("값이 존재한다");
		if( str[0].equals("aaaa") ) {
			System.out.println("aaa와 같다");
		}else {
			System.out.println("aaa가 아니다");
		}
	}else {
		System.out.println("값이 없다");
	}
}
}