package javaExample;

import java.util.*;

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}
	public String toString() { // �ֻ��� Ŭ������ ObjectŬ������ toString() �޼ҵ� �������̵�
		return "Tv2";
	}
}

class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	
	public String toString() {
		return "Computer2";
	}
}

class Phone extends Product2{
	Phone(){
		super(150);
	}
	
	public String toString() {
		return "Phone";
	}
}

class Audio extends Product2 {
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product2 p) { // ������!!(������X -> Product2 p�� �ƴ� Tv2 t �� Computer2 c������ ��Ÿ������)
		if(money < p.price) {
			System.out.println("�ܾ��� ������ ������ �� �������ϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"��/�� �����ϼ̽��ϴ�"); // p.toString�� �����Ȱ�!
	}
	
	void refund(Product2 p) { // ��ǰ ȯ��
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i = 0 ; i < item.size() ; i++) {
			Product2 p = (Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+"�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList+"�Դϴ�");
	}
}

public class InheritanceExample_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Phone phone = new Phone();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(phone);
		b.buy(audio);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
		System.out.println();
		
		System.out.println("���� ���� ���� "+b.money+"�����Դϴ�");
		System.out.println("���� ����Ʈ�� "+b.bonusPoint+"���Դϴ�");
	}

}
