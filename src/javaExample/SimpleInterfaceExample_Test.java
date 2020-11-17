package javaExample;

public class SimpleInterfaceExample_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterfaceExample_Interface s = new SimpleInterfaceExample_Class();
		
		System.out.println(s.sum(10, 20));
		
		s = new SimpleInterfaceExample_Interface() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println(s.sum(100, 200));
		
		s = (x,y) -> x + y; // simpleInterface의 경우에 추상 메소드가 하나이기때문에 람다식 사용 가능함!
		System.out.println(s.sum(7, 8));
	}

}
