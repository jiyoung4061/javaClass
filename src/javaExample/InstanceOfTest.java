package javaExample;

class Car {
	String color;
	int door; // 문의 개수
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() { // 멈춤 기능
		System.out.println("Stop!");
	}
}

class FireEngine extends Car {
	void water() { // 물뿌리는 기능
		System.out.println("water!!");
	}
}

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName()); // 클래스의 이름 
	}

}
