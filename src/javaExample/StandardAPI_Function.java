package javaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
	
//	private static void printString(Function<Student, String> function) {
//		for(Student student:list ) {
//			System.out.println(function.apply(student)+" ");
//		}
//	}
}

public class StandardAPI_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[�л��̸�]");
		printString(t->t.getName());
		
		System.out.println("[��������]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[��������]");
		printInt(t-> t.getMathScore());
	}
	
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 95,88),
			new Student("�̼���", 90,8)
		);
	
	public static void printString(Function<Student, String> function) {
		for(Student student: list) {
			System.out.println(function.apply(student)+" ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student: list) {
			System.out.println(function.applyAsInt(student));
		}
		System.out.println();
	}

}
