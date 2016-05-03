package cn.edu.qdu.rent;


public class Bus extends Moto{
	private String seatCount;
	public Bus(String MotoNo){
		super(MotoNo);
	}
	public Bus(){}
	public double rentType(int day){
		
		if(seatCount.equals("<=16")){
			setVehicle_no("³A1234");
			setPrice(800);
		}
		else{
			setVehicle_no("³A4321");
			setPrice(1500);
		}
		return day*getPrice();
	}
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}
}
