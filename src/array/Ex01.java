package array;
/*
배열
- 같은 자료형으로 연속된 공간을 만드는 것
- 자료형 배열명[] 또는 자료형 [] 배열명
- index는 0부터 시작한다.(index는 배열의 위치)
*/
public class Ex01 {
public static void main(String[] args) {
	int[] arr = new int[10];
	arr[0] = 1111;
	arr[1] = 2222;
	arr[2] = 3333;
	System.out.println( arr.length );
	System.out.println( arr );
	for(int i = 0 ; i < 3 ; i++ ) {
		System.out.println( arr[i] );
	}
	
	int[] arr02 = {111,222,333,444,555};
	System.out.println( "arr2 length : "+arr02.length );
	//for(int i=0; i<5 ; i++ ) {
	//	System.out.println( arr02[i] );
	//}
	System.out.println( arr02[0] );
	System.out.println( arr02[1] );
	System.out.println( arr02[2] );
	System.out.println( arr02[3] );
	System.out.println( arr02[4] );
	
	int[] arr03 = new int[] {1,2,3,4,5};
	for(int i=0; i < arr03.length ; i++) {
		System.out.println( arr03[i] );
	}
}
}






