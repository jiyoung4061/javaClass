package javaExample;

class Cars {
	String color;
	int door; // ���� ����
	
	void drive() { // �����ϴ� ���
		System.out.println("drive, Brrr~");
	}
	
	void stop() { // ���� ���
		System.out.println("Stop!");
	}
}

class FireEngines extends Cars {
	void water() { // ���Ѹ��� ���
		System.out.println("water!!");
	}
}

public class PromotionExample_CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars car = null;
		FireEngines fe = new FireEngines();
		FireEngines fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; ���� ����ȯ�� ������ ����!
//		Car car = new FireEngine(); // error
//		car.water(); // error : 
		fe2 = (FireEngines)car; // �ڼ� Ÿ�� <- ����Ÿ��
		fe2.water();
	}
}
