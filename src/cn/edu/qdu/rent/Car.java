package cn.edu.qdu.rent;

import java.util.Scanner;

public class Car extends Moto{
	String[] type={"�������","����550i","���������"};
    
	public void chooseType(int choose){
		switch (choose) {
		case 1:
			setVehicle_no("³A3152");
			setPrice(600);
			break;
		case 2:
			setVehicle_no("³A2152");
			setPrice(500);
			break;
		case 3:
			setVehicle_no("³A2152");
			setPrice(300);
			break;

		default:
			break;
		}
	}

}
