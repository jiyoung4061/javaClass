package javaExample;

import java.util.Scanner;

public class loopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("Enter the number:");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}
		if(input != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
			System.out.println("�Է��Ͻ� ���ڴ� "+input+"�Դϴ�");
		}
	}	

}
