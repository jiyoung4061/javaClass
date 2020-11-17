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
		System.out.println("[학생이름]");
		printString(t->t.getName());
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t-> t.getMathScore());
	}
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 95,88),
			new Student("이순신", 90,8)
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
