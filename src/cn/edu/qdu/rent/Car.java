package cn.edu.qdu.rent;

import java.util.Scanner;

public class Car extends Moto {
	private String type;
	public Car(String MotoNo){
		super(MotoNo);
	}
	public Car(){}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double rentType(int day) {
		if (type.equals("�������")) {
			setVehicle_no("³A3152");
			setPrice(600);
		}

		else if (type.equals("����550i")) {
			setVehicle_no("³A2152");
			setPrice(500);
		}

		else {
			setVehicle_no("³A2152");
			setPrice(300);
		}
		return day*getPrice();

	}

}
