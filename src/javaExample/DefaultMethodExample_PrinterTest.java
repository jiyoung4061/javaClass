package javaExample;

public class DefaultMethodExample_PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPrinterable printer = null;	
		
		printer = new InkJetPrinter();
		printer.print();
		printer.cancel();
		
		printer = new LaserPrinter();
		printer.print();
		printer.cancel(); // IPrinterable의 cancel함수가 호출됨!!		
	}

}

interface IPrinterable {
	public void print();
	public default void cancel() { // => 선택적 구현이 가능해짐
		System.out.println("Printer Cancel");
	}
}

class InkJetPrinter implements IPrinterable{
	
	@Override
	public void print() {
		System.out.println("InkJetPrinter Print");
	}
	
	@Override
	public void cancel() {
		System.out.println("InkJetPrinter Cancel");
	}
}

class LaserPrinter implements IPrinterable {
	@Override
	public void print() {
		System.out.println("LaserPrinter Print");
	}
	
	// cancel Method를 override안해도 에러 안남! ( default함수이기때문에!!-> 아니면 override안해주면 오류남!)
	
}