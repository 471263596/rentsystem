package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	Car car=new Car();
	Bus bus=new Bus();
	int days;//��������
	int price;//���޳��͵ĵ���
	public void menu(){
		//��ӭ����
		System.out.println("-----------------------------------");
		System.out.println("----------��ӭ��������ϵͳ----------");
		System.out.println("-----------------------------------\n");
	}
	public void chooseStyle(){
		//ѡ�������
		Scanner input=new Scanner(System.in);
		boolean flag=false;
		do{
			System.out.print("�����복�����1.�γ� 2.�ͳ�����");
			int style=input.nextInt();
			if(style==1){//�γ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.������� 2.����550i 3.�������������");
					int a=input.nextInt();
					car.chooseType(a);
					price=car.getPrice();//��ȡ����
					System.out.println(car.getVehicle_no()+" ����ѣ�Ԫ/�죩��"+price);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
				}while(flag1);
			}
			else if(style==2){//�ͳ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.<=16��  2.>16������");
					int a=input.nextInt();
					bus.chooseType(a);
					price=bus.getPrice();//��ȡ����
					System.out.println("\n"+bus.getVehicle_no()+" ����ѣ�Ԫ/�죩��"+price);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
				}while(flag1);
			}
			else{//ѡ����Ч����������
				System.out.println("��������ȷѡ��");
				flag=true;
			}
			System.out.println("");
		}while(flag);
	}
	
	public void calculate(){
		//�������޼�
		int total=price*days;
		System.out.println("��������Ҫ֧��"+total+"Ԫ��лл");
	}
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.chooseStyle();
		rent.calculate();
	}
}
