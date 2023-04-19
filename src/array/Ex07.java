package array;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] id = new String[7];
		String[] pwd = new String[7];
		String inputId = null, inputPwd = null;

		int num;
		boolean bool = true;
		int index = 0, count = 0;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.특정회원 보기");
			System.out.println("4.특정회원 비밀번호 수정");
			System.out.println("5.특정회원 삭제");
			System.out.println("6.모든 회원 보기");
			System.out.println("7.나가기");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = input.next();
				bool = true;
				/*
				 * for(int i=0; i < id.length ; i++) { if( inputId.equals(id[i]) ) {
				 * if(inputPwd.equals(pwd[i]) ) { System.out.println("인증통과"); }else {
				 * System.out.println("비밀번호가 틀렸"); } bool = false; break; } } if(bool) {//bool
				 * ==true; System.out.println("존재하지 않는 아이디입니다");
				 * System.out.println("회원가입 먼저 하세요"); }
				 */
				for (index = 0; index < id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							System.out.println("인증통과");
						} else {
							System.out.println("비밀번호가 틀렸");
						}
						break;
					}
				}
				if (index == id.length) {// bool ==true;
					System.out.println("존재하지 않는 아이디입니다");
					System.out.println("회원가입 먼저 하세요");
				}
				System.out.println("로그인");
				break;
			case 2:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = input.next();
				if (count < id.length) {
					for (index = 0; index < count; index++) {
						if (inputId.equals(id[index])) {
							System.out.println("중복된 아이디 입니다");
							break;
						}
					}
					if (index == count) {
						id[count] = inputId;
						pwd[count] = inputPwd;
						count++;
					}
				} else {
					System.out.println("저장공간 부족!!");
				}
				/*
				 * for(index=0; index < id.length ; index++) { if( inputId.equals(id[index]) ) {
				 * System.out.println("중복된 아이디 입니다"); break; } if( id[index] == null ) {
				 * id[index]=inputId; pwd[index]=inputPwd; System.out.println("가입 완료"); break; }
				 * } if( index == id.length ) { System.out.println("저장공간이 부족합니다"); }
				 */
				System.out.println("회원가입");
				break;
			case 3:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = input.next();
				bool = true;
				for (index = 0; index < id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							System.out.println("아이디 " + id[index] + " 비번" + pwd[index]);
						}
						break;

					}
				}
				if (index == id.length) {
					System.out.println("존재하지 않는 아이디입니다");
					System.out.println("회원가입 먼저 하세요");
				}

				break;

			case 4:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = input.next();
				bool = true;
				for (index = 0; index < id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							System.out.println("변경할 비밀번호를 입력하시오");
							inputPwd = input.next();
							pwd[index] = inputPwd;

						}
						break;
					}
				}
				if (index == id.length) {
					System.out.println("존재하지 않는 아이디입니다");
					System.out.println("회원가입 먼저 하세요");
				}

				break;
			case 5:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = input.next();
				bool = true;
				for (index = 0; index < id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							id[index] = null;
							pwd[index] = null;

							System.out.println("삭제완료");
						}

						break;
					}
				}
				if (index == id.length) {
					System.out.println("존재하지 않는 아이디입니다");
					System.out.println("회원가입 먼저 하세요");
				}

				break;
			case 6:
				for (index = 0; index < id.length; index++) {
					System.out.println(id[index]);
				}
				break;
			case 7:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}

	}
}
