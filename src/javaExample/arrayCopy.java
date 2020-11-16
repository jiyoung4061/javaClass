package javaExample;

import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("변경전 - arr.length:"+arr.length);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];
		
		// for문을 사용해 배열 복사하기
		System.out.println("반복문을 사용해 배열 복사하기");
		for(int i = 0 ; i< arr.length ; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // tmp에 저장된 값(주소값!)을 arr에 저장
		
		System.out.println("변경후 - arr.length:"+arr.length);
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		// arrayCopy() 메소드 사용
		System.out.println("arraycopy메소드 사용");
		char[] abc = {'A','B','C'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println("abc:"+abc); // 는 주소값이 나옴! 아래와 뭐가다르지..
		System.out.println(abc);
		System.out.println(num);
		//asdfasdfsdf
		// 배열 abc와 num을 붙여서 하나의 배열로 만듬
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc, 배열 num의 첫번째 위치부터 배열 abc길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number인덱스 6위치에서 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		// Array 클래스 사용
		System.out.println("Array 클래스안에 함수 사용");
		int[] arr1 = {1,2,3,4,5};
		int[] copied = new int[10];
		
		copied = Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(copied));
		
		copied = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(copied));
	}

}
