package Shop;

public class AcouElec extends Guitar{
	//Association
	//Karena pada Acoustic Electric sudah pasti crunch sound typenya
	AEType type = new AEType("Crunch");
	
	public AcouElec(String gtrType, String sndType) {
		super(gtrType, sndType);
	}

	public void DisplayList() {
		System.out.println(super.getGtrType() + " Guitar - " + type.getAEsndType() + " - 0 - 0");
	}

}
