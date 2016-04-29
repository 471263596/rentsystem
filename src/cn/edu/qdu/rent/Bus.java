package cn.edu.qdu.rent;


public class Bus extends Moto{
	private String seatCount[]={"<=16",">16"};
	public void chooseType(int choose){
		switch (choose) {
		case 1:
			setVehicle_no("³A1234");
			setPrice(800);
			break;
		case 2:
			setVehicle_no("³A4321");
			setPrice(1500);
			break;

		default:
			break;
		}
	}
}
