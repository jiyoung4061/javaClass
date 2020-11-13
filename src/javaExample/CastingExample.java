package javaExample;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Casting Example */
		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int->byte] i = %d -> b = %d \n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int->byte] i = %d -> b = %d \n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte->int] b = %d -> i = %d \n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte->int] b = %d -> i = %d \n", b, i);
		
		System.out.println("i="+Integer.toBinaryString(i)); // Wrapper Class : 객체의 형태로 싼다!
		// int -> Integer  float -> Float
		
		System.out.println();
		
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %2.018f\n", f);
		System.out.printf("d = %2.018f\n", d);
		System.out.printf("d2 = %2.018f\n", d2);
		
		System.out.println();
		
		/* Overflow가 발생한 Casting*/
		System.out.println("Overflow가 발생시 값이 고리형태로 나오게 됨");
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin); // sMin = -32768
		System.out.println("sMin-1 = " + (short)(sMin-1)); // sMin-1 = 32767
		System.out.println("sMax = " + sMax); // sMax = 32767
		System.out.println("sMax+1 = " + (short)(sMax+1)); // sMax+1 = -32768
		System.out.println("cMin = " + (int)cMin); // cMin = 0
		System.out.println("cMin-1 = " + (int)--cMin); // cMin-1 = 65535
		System.out.println("cMax = " + (int)cMax); // cMax = 65535
		System.out.println("cMax+1 = " + (int)++cMax); // cMax+1 = 0
	} 

}
