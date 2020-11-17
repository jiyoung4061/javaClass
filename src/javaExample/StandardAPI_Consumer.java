package javaExample;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class StandardAPI_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = t -> System.out.println(t + "Class");
		consumer.accept("JAVA");
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t+u);
		biConsumer.accept("java", "Class");
		
		DoubleConsumer doubleConsumer = d -> System.out.println(d + "를 나눈 나머지는 "+d%10 + "입니다");
		doubleConsumer.accept(14.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i)-> System.out.println(t+i);
		objIntConsumer.accept("java", 8);
	}

}
