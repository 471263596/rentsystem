package cn.edu.qdu.rent;

import java.util.Scanner;

public class Car extends Moto {
	private String type;
	public Car(String MotoNo,String type){
		super(MotoNo);
		this.type=type;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double rentType(int day) {
		if (type.equals("别克商务")) {
			
			setPrice(600);
		}

		else if (type.equals("宝马550i")) {
			setPrice(500);
		}

		else {
			setVehicle_no("鲁A2152");
			setPrice(300);
		}
		return super.rentType(day);

	}

}
