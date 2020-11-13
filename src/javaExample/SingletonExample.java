package javaExample;

final class Singleton { // final + class : 상속을 하지 않겠다
	// final + method : 하위클래스에서 override하지 않겠다
	private static Singleton s = new Singleton();

	private Singleton() { // 생성자를 private으로 해 내부에서만 사용가능하도록

	}

	public static Singleton getInstance() { // public 메소드를 통해 singleton 객체를 return 하는 getInstance메소드 정의
		if (s == null) { // Singleton객체는 하나로 유일해야하기때문에 null인경우에만 새로운 객체를 생성시켜줌
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
