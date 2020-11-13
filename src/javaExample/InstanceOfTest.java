package javaExample;

class Car {
	String color;
	int door; // ���� ����
	
	void drive() { // �����ϴ� ���
		System.out.println("drive, Brrr~");
	}
	
	void stop() { // ���� ���
		System.out.println("Stop!");
	}
}

class FireEngine extends Car {
	void water() { // ���Ѹ��� ���
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
		
		System.out.println(fe.getClass().getName()); // Ŭ������ �̸� 
	}

}
