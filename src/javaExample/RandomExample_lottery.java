package javaExample;

public class RandomExample_lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0 ;i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.printf("ball[%d]=%d\n", i, lotto[i]);
		}
		
	}

}
