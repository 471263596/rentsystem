package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	
	public void menu(){
		//��ӭ����
		System.out.println("-----------------------------------");
		System.out.println("----------��ӭ��������ϵͳ----------");
		System.out.println("-----------------------------------\n");
	}
	public void chooseStyle(){
		//ѡ�������
		Car car=new Car();
		Bus bus=new Bus();
		int days;//��������
		String[] carType={"�������","����550i","���������"};
		String[] busType={"<=16",">16"};
		Scanner input=new Scanner(System.in);
		double total=0;
		boolean flag=false;
		do{
			System.out.print("�����복�����1.�γ� 2.�ͳ�����");
			int style=input.nextInt();
			if(style==1){//�γ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.������� 2.����550i 3.�������������");
					int a=input.nextInt();
					car.setType(carType[a-1]);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
					total=car.rentType(days);
					System.out.println(car.getType()+car.getVehicle_no()+" ����ѣ�Ԫ/�죩��"+car.getPrice()+"\n�ܼƣ�"+total);
				}while(flag1);
			}
			else if(style==2){//�ͳ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.<=16��  2.>16������");
					int a=input.nextInt();                       
					bus.setSeatCount(busType[a-1]);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
					total=bus.rentType(days);
					System.out.println(bus.getSeatCount()+bus.getVehicle_no()+" ����ѣ�Ԫ/�죩��"+bus.getPrice()+"\n�ܼƣ�"+total);
				}while(flag1);
			}
			else{//ѡ����Ч����������
				System.out.println("��������ȷѡ��");
				flag=true;
			}
			System.out.println("");
		}while(flag);
	}
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.chooseStyle();
	}
}
