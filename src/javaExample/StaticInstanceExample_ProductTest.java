package javaExample;

class Products{
	static int count = 0; // ������ �ν��Ͻ� ���� �����ϱ����� ����
	int serialNo; // �ν��Ͻ� ���� ��ȣ
	
	{ // �ν��Ͻ� �ʱ�ȭ ��! -> �ν��Ͻ� �ʱ�ȭ���� ����Ǵ� ��
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
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� "+ p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(serial no)�� "+ p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(serial no)�� "+ p3.serialNo);

	}

}
