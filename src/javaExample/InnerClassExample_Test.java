package javaExample;

public class InnerClassExample_Test {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; // error: static변수는 사용 불가능
		final static int CONST = 100; // static 상수는 가능!
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() { // 인스턴스 메소드!
		class LocalInner{
			int iv = 300;
//			static int cv = 300; // error: static변수 불가능
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//class InnerClassExample_Test2 {
//	//인스턴스 ㅁ메버간 서로 직접 접근 가능
//	InstanceInner iv = new InstanceInner();
//	
//	//static 멤버 간에는 서로 직접 접근 가능
//	static StaticInner cv = new StaticInner();
//	
//	static void staticMethod() {
//		//static멤버는 인스턴스멤버에 직접 ㅂ접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();
//		StataicInner obj2 = new SstaticInner();
//		
//		//굳이 접근하려면 객체 생성해야함 -> 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성 가능
//		InnerEx2 outer = new InnerEx2();
//		InstatceInner obj1 = outer.new InstanceInner();
//		
//	}
//	
//	void instanceMethod() {
//		//인스턴스 메소드에서는 인스턴스멤버와 static멤버 모두 접근 가능
//		InstatnceInner ojb1 = new InstaceInner();
//		StaticInner obj2 = new StaticInner();
//		//메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가능
//		LocalInner lv = new LocalInner();
//	}
//	
//	Local
//}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; // 외부 클래스의 private멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//static 클래스는 외부 클래스의 인스턴스멤버에 접근X
//		int siv = outerIv;// error
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // JDK1.8부터 final생략 O
		
		class LocalInner{
			int liv = outerIv; // outerIv : 바깥클래스의 인스턴스 변수, myMethod: 인스턴스 메소드 => 인스턴스 메소드에서 인스턴스변수는 사용 가능
			int liv2 = outerCv; 
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능
//			int liv3 = lv; // JDK1.8부터는 에러 아니지만 그전에는 에러!
			int liv4 = LV; // OK
		}
		
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Outer{
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println("          value : "+value);
			System.out.println("          this.value : "+this.value);
			System.out.println("          this.value : "+Outer.this.value);
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 익명 클래스 -> 이벤트 핸들링에서 마니 사용됨
class InnerEx6 {
	Object iv = new Object() {// 익명 클래스
		void method() {}
	};
	static Object cv= new Object() {// 익명 클래스
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() { // 익명 클래스
			void method() {}
		}; 
	}
}
