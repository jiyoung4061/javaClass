package javaExample;

class Products{
	static int count = 0; // 생성된 인스턴스 수를 저장하기위한 변수
	int serialNo; // 인스턴스 고유 번호
	
	{ // 인스턴스 초기화 블럭! -> 인스턴스 초기화마다 실행되는 블럭
		++count;
		serialNo = count;
	}
	
	public Products() {}
}

public class StaticInstanceExample_ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p1 = new Products();
		Products p2 = new Products();
		Products p3 = new Products();
		
		System.out.println("p1의 제품번호(serial no)는 "+ p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 "+ p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 "+ p3.serialNo);

	}

}
