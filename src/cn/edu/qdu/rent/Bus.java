package cn.edu.qdu.rent;


public class Bus extends Moto{
	private String seatCount;
	public Bus(String MotoNo,String type){
		super(MotoNo);
		this.seatCount=type;
	}
	public double rentType(int day){
		
		if(seatCount.equals("<=16")){
			
			setPrice(800);
		}
		else{
			setPrice(1500);
		}
		return super.rentType(day);
	}
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}
}
