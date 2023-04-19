package array;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	int arr[] = {10, 54, 13, 17, 25, 30};
	Scanner input = new Scanner(System.in);
	String oddEven;
	System.out.println("입력");
	oddEven = input.next();
	if(oddEven.equals("짝수")) {
		for( int num : arr ) {
			if(num % 2 == 0 ) {
				System.out.println(num);
			}
		}
	}else {
		for( int num : arr ) {
			if(num % 2 != 0 ) {
				System.out.println(num);
			}
		}
	}
}
}
