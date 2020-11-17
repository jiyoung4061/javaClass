package javaExample;

import java.util.function.IntSupplier;

public class StandardAPI_Supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt(); // getAs타입 식
		System.out.println("주사위의 눈:"+num);
	}

}
