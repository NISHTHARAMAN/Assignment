package interface_ass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirIndia ai = new AirIndia();
		KingFisher kf = new KingFisher();
		Indigo i = new Indigo();
		
		System.out.println("AirIndia Flight:"+ai.calculateAmount());
		System.out.println();
		System.out.println("KingFisher Flight:"+kf.calculateAmount());
		System.out.println();
		System.out.println("Indigo Flight:"+i.calculateAmount());

	}

}
