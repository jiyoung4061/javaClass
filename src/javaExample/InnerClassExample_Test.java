package javaExample;

public class InnerClassExample_Test {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; // error: static������ ��� �Ұ���
		final static int CONST = 100; // static ����� ����!
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() { // �ν��Ͻ� �޼ҵ�!
		class LocalInner{
			int iv = 300;
//			static int cv = 300; // error: static���� �Ұ���
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
//	//�ν��Ͻ� ���޹��� ���� ���� ���� ����
//	InstanceInner iv = new InstanceInner();
//	
//	//static ��� ������ ���� ���� ���� ����
//	static StaticInner cv = new StaticInner();
//	
//	static void staticMethod() {
//		//static����� �ν��Ͻ������ ���� �������� �� ����.
//		InstanceInner obj1 = new InstanceInner();
//		StataicInner obj2 = new SstaticInner();
//		
//		//���� �����Ϸ��� ��ü �����ؾ��� -> �ν��Ͻ� Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ���� ����
//		InnerEx2 outer = new InnerEx2();
//		InstatceInner obj1 = outer.new InstanceInner();
//		
//	}
//	
//	void instanceMethod() {
//		//�ν��Ͻ� �޼ҵ忡���� �ν��Ͻ������ static��� ��� ���� ����
//		InstatnceInner ojb1 = new InstaceInner();
//		StaticInner obj2 = new StaticInner();
//		//�޼ҵ� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ұ���
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
		int iiv = outerIv; // �ܺ� Ŭ������ private����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ����X
//		int siv = outerIv;// error
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // JDK1.8���� final���� O
		
		class LocalInner{
			int liv = outerIv; // outerIv : �ٱ�Ŭ������ �ν��Ͻ� ����, myMethod: �ν��Ͻ� �޼ҵ� => �ν��Ͻ� �޼ҵ忡�� �ν��Ͻ������� ��� ����
			int liv2 = outerCv; 
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���� ����
//			int liv3 = lv; // JDK1.8���ʹ� ���� �ƴ����� �������� ����!
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
// �͸� Ŭ���� -> �̺�Ʈ �ڵ鸵���� ���� ����
class InnerEx6 {
	Object iv = new Object() {// �͸� Ŭ����
		void method() {}
	};
	static Object cv= new Object() {// �͸� Ŭ����
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() { // �͸� Ŭ����
			void method() {}
		}; 
	}
}
