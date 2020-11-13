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
	public String toString() { // 최상위 클래스인 Object클래스의 toString() 메소드 오버라이딩
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
	
	void buy(Product2 p) { // 다형성!!(다형성X -> Product2 p가 아닌 Tv2 t 나 Computer2 c등으로 나타내야함)
		if(money < p.price) {
			System.out.println("잔액이 부족해 물건을 살 수없습니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구입하셨습니다"); // p.toString이 생략된것!
	}
	
	void refund(Product2 p) { // 제품 환불
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 상품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		for(int i = 0 ; i < item.size() ; i++) {
			Product2 p = (Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		System.out.println("구입하신 상품의 촘 금액은 "+sum+"만원입니다");
		System.out.println("구입하신 제품은 "+ itemList+"입니다");
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
		
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다");
		System.out.println("현재 포인트는 "+b.bonusPoint+"점입니다");
	}

}
