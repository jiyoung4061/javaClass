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

interface Repairable {} // 이 인터페이스의 규격에 맞게 구현을 해라!

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

class Tank extends GroundUnit implements Repairable { // 어떤 동작을 가져올땐 -> extends(상속) 
														// 어떤 표준에 대한 제한을 둘 땐 -> implements(구현) => 다중상속의 효과!
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
	
	void repair(Repairable r) { // interface타입을 대상으로 함수 repair -> Tank, Dropship, SCV등
		if( r instanceof Unit) {
			Unit u = (Unit)r; // Unit타입으로 UpCasting!
			while(u.hitPoint != u.MAX_HP) {
				// Unit의 HP증가
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}