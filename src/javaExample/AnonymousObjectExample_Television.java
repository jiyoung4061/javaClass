package javaExample;

public class AnonymousObjectExample_Television implements AnonymousObjectExample_RemoteControll{
	private int volumn;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolumn(int volumn) {
		// TODO Auto-generated method stub
		if(volumn > AnonymousObjectExample_RemoteControll.MAX_VOLUMN) {
			this.volumn = AnonymousObjectExample_RemoteControll.MAX_VOLUMN;
		} else if(volumn < AnonymousObjectExample_RemoteControll.MIN_VOLUMN) {
			this.volumn = AnonymousObjectExample_RemoteControll.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		System.out.println("���� TV ����: " + this.volumn);
	}

}
