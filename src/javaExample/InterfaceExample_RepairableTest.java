package javaExample;

public class InterfaceExample_RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); // error
	}

}

interface Repairable {} // �� �������̽��� �԰ݿ� �°� ������ �ض�!

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp){
		super(hp);
	}
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable { // � ������ �����ö� -> extends(���) 
														// � ǥ�ؿ� ���� ������ �� �� -> implements(����) => ���߻���� ȿ��!
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { // interfaceŸ���� ������� �Լ� repair -> Tank, Dropship, SCV��
		if( r instanceof Unit) {
			Unit u = (Unit)r; // UnitŸ������ UpCasting!
			while(u.hitPoint != u.MAX_HP) {
				// Unit�� HP����
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
}