package javaExample;

import java.util.function.IntBinaryOperator;

public class Sample {

		// TODO Auto-generated method stub
		private static int[] scores = {94, 96, 86};
		
		public static int maxOrMin(IntBinaryOperator operator) { // int값이 2개가 들어와서
			int result = scores[0];
			for(int score : scores) {
				result = operator.applyAsInt(result, score);
			}
			return result;
		}

		public static void main(String[] args) {		
			int max = maxOrMin((a, b) -> {
				if(a >= b)
					return a;
				else 
					return b;
			});
			
			System.out.println("최대값:" + max);
			
			int min = maxOrMin((a, b)-> {
				if(a <= b)
					return a;
				else 
					return b;
			});
		}

}
