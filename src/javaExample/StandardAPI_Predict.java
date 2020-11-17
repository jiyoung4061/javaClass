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
			new Student2("ȫ�浿", "����", 90), new Student2("�迵��", "����", 90),
			new Student2("��ö��", "����", 85), new Student2("������", "����", 87));

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
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����:"+ maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����:" + femaleAvg);
	}

}
