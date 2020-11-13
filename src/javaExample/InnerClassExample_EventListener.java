package javaExample;

import java.awt.*;
import java.awt.event.*;

// �Ϲ����� EventListener ��� ���
public class InnerClassExample_EventListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) { // ActionListener�ȿ� actionPerformed�Լ��� �������̵��ؼ� �̺�Ʈ ó��
		System.out.println("ActionEvent occurred!");
	}
}


//ex7�� �͸� Ŭ������ ��� ��
class InnerClassExample{
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() { // �͸� Ŭ������ ��� bin->�����ȿ� .class���� ���� ABC$1.class �̷������� '$'ǥ�ð� ��!
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		}); // �͸� Ŭ���� ��
	}// main ��
}// InnerEx8 �� 