package Shop;

public class Electric extends Guitar {

	private int tone;
	private int volume;
	private int sp;

	public Electric(String gtrType, String sndType, int tone, int volume, int sp) {
		super(gtrType, sndType);
		this.tone = tone;
		this.volume = volume;
		this.sp = sp;
	}

	public int getTone() {
		return tone;
	}

	public void setTone(int tone) {
		this.tone = tone;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public void DisplayList() {
		System.out.println(super.getGtrType() + " Guitar - " + super.getSndType() + " - " + this.getTone() + " - "
				+ this.getVolume() + " - " + this.getSp());
	}

}
