package cn.edu.qdu.rent;

public abstract class Moto {
	private String vehicle_no;
	private int price;
	public Moto(String MotoNo){
		this.vehicle_no=MotoNo;
	}
	public Moto(){}
	public abstract double rentType(int day);

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
