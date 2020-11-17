package javaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student2 {
	private String name;
	private String sex;
	private int score;

	public Student2(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
}

public class StandardAPI_Predict {

	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", "남자", 90), new Student2("김영희", "여자", 90),
			new Student2("박철수", "남자", 85), new Student2("이혜숙", "여자", 87));

	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum = 0;
		for (Student2 student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수:"+ maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수:" + femaleAvg);
	}

}
