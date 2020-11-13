package javaExample;

final class Singleton { // final + class : ����� ���� �ʰڴ�
	// final + method : ����Ŭ�������� override���� �ʰڴ�
	private static Singleton s = new Singleton();

	private Singleton() { // �����ڸ� private���� �� ���ο����� ��밡���ϵ���

	}

	public static Singleton getInstance() { // public �޼ҵ带 ���� singleton ��ü�� return �ϴ� getInstance�޼ҵ� ����
		if (s == null) { // Singleton��ü�� �ϳ��� �����ؾ��ϱ⶧���� null�ΰ�쿡�� ���ο� ��ü�� ����������
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Singleton s = new Singleton(); // error
		Singleton s = Singleton.getInstance();
	}

}
