package javaExample;

public class AnonymousObjectExample_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousObjectExample_RemoteControll rc;

		rc = new AnonymousObjectExample_RemoteControll() {
			// AnonymousObjectExample_Television�� �͸�ü�� ����� �ڵ�
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
				if (volumn > AnonymousObjectExample_RemoteControll.MAX_VOLUMN) {
					this.volumn = AnonymousObjectExample_RemoteControll.MAX_VOLUMN;
				} else if (volumn < AnonymousObjectExample_RemoteControll.MIN_VOLUMN) {
					this.volumn = AnonymousObjectExample_RemoteControll.MIN_VOLUMN;
				} else {
					this.volumn = volumn;
				}
				System.out.println("���� TV ����: " + this.volumn);
			}
		};
		rc.turnOn();
		rc.turnOff();

		// ��Ŭ���� ���� ��� ��� => new Ÿ�� �ۼ��� ctrl+space ������ �ڵ����� override�Ǿ �ۼ���
		AnonymousObjectExample_RemoteControll rc2 = new AnonymousObjectExample_RemoteControll() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolumn(int volumn) {
				// TODO Auto-generated method stub

			}
		};

	}

}
