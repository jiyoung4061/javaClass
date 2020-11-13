package javaExample;

import java.util.Scanner;

public class loopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("Enter the number:");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		}
		if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다");
			System.out.println("입력하신 숫자는 "+input+"입니다");
		}
	}	

}
