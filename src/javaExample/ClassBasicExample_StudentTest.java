package javaExample;

class StudentClass {

	String major;
	String name;
	int studentNo;
	String professor;

	StudentClass() {

	}

	StudentClass(String name, String major) {
		this.major = major;
		this.name = name;
	}
}

public class ClassBasicExample_StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass st1 = new StudentClass();
		st1.name = "jiyoung";
		st1.major = "computer";

		StudentClass st2 = new StudentClass("youngji", "law");

		System.out.println("st1ÀÇ name=" + st1.name + ", major=" + st1.major);
		System.out.println("st2ÀÇ name=" + st2.name + ", major=" + st2.major);
	}

}
