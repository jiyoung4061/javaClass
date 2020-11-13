package javaExample;

class Cars {
	String color;
	int door; // 문의 개수
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() { // 멈춤 기능
		System.out.println("Stop!");
	}
}

class FireEngines extends Cars {
	void water() { // 물뿌리는 기능
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
		car = fe; // car = (Car)fe; 에서 형변환이 생략된 형태!
//		Car car = new FireEngine(); // error
//		car.water(); // error : 
		fe2 = (FireEngines)car; // 자손 타입 <- 조상타입
		fe2.water();
	}
}
