package javaExample;

import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("������ - arr.length:"+arr.length);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];
		
		// for���� ����� �迭 �����ϱ�
		System.out.println("�ݺ����� ����� �迭 �����ϱ�");
		for(int i = 0 ; i< arr.length ; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // tmp�� ����� ��(�ּҰ�!)�� arr�� ����
		
		System.out.println("������ - arr.length:"+arr.length);
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		// arrayCopy() �޼ҵ� ���
		System.out.println("arraycopy�޼ҵ� ���");
		char[] abc = {'A','B','C'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println("abc:"+abc); // �� �ּҰ��� ����! �Ʒ��� �����ٸ���..
		System.out.println(abc);
		System.out.println(num);
		//asdfasdfsdf
		// �迭 abc�� num�� �ٿ��� �ϳ��� �迭�� ����
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// �迭 abc, �迭 num�� ù��° ��ġ���� �迭 abc���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number�ε��� 6��ġ���� 3�� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		// Array Ŭ���� ���
		System.out.println("Array Ŭ�����ȿ� �Լ� ���");
		int[] arr1 = {1,2,3,4,5};
		int[] copied = new int[10];
		
		copied = Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(copied));
		
		copied = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(copied));
	}

}
