package javaExample;

import java.awt.*;
import java.awt.event.*;

// 일반적인 EventListener 사용 방식
public class InnerClassExample_EventListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) { // ActionListener안에 actionPerformed함수를 오버라이딩해서 이벤트 처리
		System.out.println("ActionEvent occurred!");
	}
}


//ex7을 익명 클래스를 사용 시
class InnerClassExample{
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() { // 익명 클래스의 경우 bin->폴더안에 .class파일 명이 ABC$1.class 이런식으로 '$'표시가 됨!
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		}); // 익명 클래스 끝
	}// main 끝
}// InnerEx8 끝 