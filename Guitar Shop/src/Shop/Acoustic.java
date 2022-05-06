package Shop;

public class Acoustic extends Guitar {

	public Acoustic(String gtrType, String sndType) {
		super(gtrType, sndType);
	}

	public void DisplayList() {
		System.out.println(super.getGtrType() + " Guitar - " + super.getSndType());
	}

}
