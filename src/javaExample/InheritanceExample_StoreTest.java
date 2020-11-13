package javaExample;

import java.util.*;

class Product {
	int price;
	int bonusPoint;
	int count = 0;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product(){
		price = 0;
		bonusPoint = 0;
	}
}

class Electronic extends Product{
	int watt;
	String color;
	
	Electronic(int watt, String color){
		this.watt = watt;
		this.color = color;
	}
}

class Furniture extends Product{
	int size;
	String material;
	
	Furniture(int size, String material){
		this.size = size;
		this.material = material;
	}
}

class Tv extends Electronic {
	Tv() {
		super(110, "Balck");
		price = 500;
	}
	public String toString() { // �ֻ��� Ŭ������ ObjectŬ������ toString() �޼ҵ� �������̵�
		return "Tv";
	}
}

class Computer extends Electronic {
	Computer(){
		super(220, "white");
		price = 300;
	}
	
	public String toString() {
		return "Computer";
	}
}

class Bed extends Furniture{
	Bed(){
		super(1000, "Wood");
		price = 100;
	}
	
	public String toString() {
		return "Bed";
	}
}

class Table extends Furniture {
	Table(){
		super(500, "Marble");
		price = 50;
	}
	
	public String toString() {
		return "Table";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	String itemList = "";
	Product p;
	
	void buy(int selectBuyProduct, Store s) {
		switch(selectBuyProduct) {
		case 1 : 
			p = s.tv;
			break;
		case 2 :
			p = s.com;
			break;
		case 3:
			p = s.bed;
			break;
		default:
			p = s.tab;
			break;
	}
		
		if(money < p.price) {
			System.out.println("�ܾ��� ������ ������ �� �������ϴ�");
			return;
		}
		if(p.count == 0) {
			System.out.println("�Ǹ� ��ǰ�� ��� ������ ���Ű� �Ұ����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		
		// �Ǹ��� ���� �߰�, list ����
		s.sum += p.price;
		s.items.remove(p);
		
		p.count--; // ��� ����
		
		System.out.println(p+"��/�� �����ϼ̽��ϴ�"); // p.toString�� �����Ȱ�!
	}
	
	void refund(int selectRefundProduct, Store s) { // ��ǰ ȯ��
		Product p;
		
		switch(selectRefundProduct) {
		case 1 : 
			p = s.tv;
			break;
		case 2 :
			p = s.com;
			break;
		case 3:
			p = s.bed;
			break;
		default:
			p = s.tab;
			break;
		}
		
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			
			// �Ǹ��� ���� ����, list ����
			s.sum -= p.price;
			s.items.add(p);
			
			p.count++; // ��� Ȯ��
			
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		
		if(item.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i = 0 ; i < item.size() ; i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+"�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList+"�Դϴ�");
	}
}

class Store { // �Ǹ���
	Vector items = new Vector(); // ��ǰ ���
	int sum = 0;
	Product p;
		Tv tv = new Tv();
		Computer com = new Computer();
		Bed bed = new Bed();
		Table tab = new Table();
		
	void stock(int selectStockProduct) { // ��ǰ �԰�
		switch(selectStockProduct) {
		case 1 : 
			p = tv;
			break;
		case 2 :
			p = com;
			break;
		case 3:
			p = bed;
			break;
		default:
			p = tab;
			break;
	}
		items.add(p);
		p.count++;
	}
	
	void searchProduct() { // ��ǰ ��ȸ
		String itemsList = "";
		
		for(int i = 0 ; i<items.size(); i++) {
			Product p = (Product)items.get(i);
			itemsList += (i==0)? ""+p : ", "+p;
		}
		System.out.println("���� ��� �ִ� ��ǰ�� ["+itemsList+"] �Դϴ�");
	}
	
	void sumOfSale() {
		System.out.println("�� �Ǹ� �ݾ��� "+sum+"���� �Դϴ�.");
	}
}

/* ��ǰ ���(�԰�), ��� ��ȸ, �Ǹ� ���� ��� <= �Ǹ��� class �߰� */

public class InheritanceExample_StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer();
		Store s1 = new Store();
		
		int select=0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(select != 7) {
			
			
			System.out.println("1.��ǰ �԰� 2.��� ��ȸ 3.�� �Ǹűݾ� 4.��ǰ���� 5.��ǰȯ�� 6.���ų��� 7.��� ����");
			System.out.print("����� �������ּ��� :");
			select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("1.Tv 2.Computer 3.Bed 4.Table");
				System.out.print("�԰��� ��ǰ�� ������ �������ּ��� :");
				int selectStockProduct = scanner.nextInt();
				s1.stock(selectStockProduct);	
				break;
			case 2:
				s1.searchProduct();
				break;
			case 3:
				s1.sumOfSale();
				break;
			case 4:
				System.out.println("1.Tv 2.Computer 3.Bed 4.Table");
				System.out.print("�����ϰ����ϴ� ��ǰ�� ������ �������ּ��� :");
				int selectBuyProduct = scanner.nextInt();
				b1.buy(selectBuyProduct, s1);
				break;
			case 5:
				System.out.println(b1.itemList);
				System.out.println("1.Tv 2.Computer 3.Bed 4.Table");
				System.out.print("ȯ���ϰ����ϴ� ��ǰ�� ������ �������ּ��� :");
				int selectRefundProduct = scanner.nextInt();
				b1.refund(selectRefundProduct, s1);
				break;
			case 6:
				b1.summary();
				break;
			case 7:
				System.out.println("����� �����մϴ�");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			System.out.println();
		}		
	}
}
