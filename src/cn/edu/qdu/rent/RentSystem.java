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
		Scanner input=new Scanner(System.in);
		System.out.println("Ҫ�⼸������");
		int n=input.nextInt();
		int[] num=new int[n];
		//ѡ�������
		Moto moto=new Car();
		Bus bus=new Bus();
		int days;//��������
		String[] carType={"�������","����550i","���������"};
		String[] busType={"<=16",">16"};
		double total=0;
		int i=0;
		do{
			System.out.print("�����복�����1.�γ� 2.�ͳ�����");
			int style=input.nextInt();
			if(style==1){//�γ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.������� 2.����550i 3.�������������");
					int a=input.nextInt();
					Car car=(Car)moto;
					car.setType(carType[a-1]);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
					total+=car.rentType(days);
					
				}while(flag1);
				i++;
			}
			else if(style==2){//�ͳ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.<=16��  2.>16������");
					int a=input.nextInt();                       
					bus.setSeatCount(busType[a-1]);
					System.out.print("����������������");
					days=input.nextInt();//��ȡ����
					total+=bus.rentType(days);
					
				}while(flag1);
				i++;
			}
			else{//ѡ����Ч����������
				System.out.println("��������ȷѡ��");
				
			}
			System.out.println("");
			
		}while(i<n);
		System.out.println("�ܼƣ�"+total);
	}
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.chooseStyle();
	}
}
