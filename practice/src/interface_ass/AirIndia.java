package interface_ass;

public class AirIndia implements Airfare {

	private int hours;
	private double costPerHour;
	
	public AirIndia() {
		this.hours=10;
		this.costPerHour=500.50;
		// TODO Auto-generated constructor stub
	}
	
	public AirIndia(int hours, double costPerHour) {
		
		this.hours = hours;
		this.costPerHour = costPerHour;
	}


	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		// TODO Auto-generated method stub
		return hours * costPerHour;
	}

}
