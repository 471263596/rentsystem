package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	
	public void menu(){
		//��ӭ����
		System.out.println("-----------------------------------");
		System.out.println("----------��ӭ��������ϵͳ----------");
		System.out.println("-----------------------------------\n");
	}
	public void rentMoto(){
		Scanner input=new Scanner(System.in);
		System.out.println("Ҫ�⼸������");
		int n=input.nextInt();
		String[] cusType=new String[n];
		int[] cusPrice=new int[n];
		int[] cusDay=new int[n];//��������
		
		
		String[] carType={"�������","����550i","���������"};
		String[] busType={"<=16��",">16��"};
		double total=0;
		int i=0;
		//ѡ�������
		do{
			System.out.print(i+1+".�����복�����1.�γ� 2.�ͳ�����");
			int style=input.nextInt();
			if(style==1){//�γ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.������� 2.����550i 3.�������������");
					int a=input.nextInt();
					Moto moto=new Car("³A3152");
					Car car=(Car)moto;
					car.setType(carType[a-1]);
					System.out.print("����������������");
					
					cusDay[i]=input.nextInt();//��ȡ����
					total+=moto.rentType(cusDay[i]);
					cusType[i]=carType[a-1];//
					cusPrice[i]=car.getPrice();//
					
				}while(flag1);
				i++;
			}
			else if(style==2){//�ͳ�
				boolean flag1=false;
				do{
					System.out.print(".�����복�ͣ�1.<=16��  2.>16������");
					int a=input.nextInt();    
					Bus bus=new Bus("³A4321");
					bus.setSeatCount(busType[a-1]);
					System.out.print("����������������");
					cusDay[i]=input.nextInt();//��ȡ����
					total+=bus.rentType(cusDay[i]);
					cusType[i]=busType[a-1];//
					cusPrice[i]=bus.getPrice();//
					
				}while(flag1);
				i++;
			}
			else{//ѡ����Ч����������
				System.out.println("��������ȷѡ��");
				
			}
			System.out.println("");
			
		}while(i<n);
		for (int j = 0; j < n; j++) {
			System.out.println("��"+(j+1)+"�������ͣ�"+cusType[j]+"\t����������"+cusDay[j]+"\t����������ã�"+cusPrice[j]+"\t�˳������ܷ��ã�"+(cusDay[j]*cusPrice[j]));
		}
		System.out.println("�ܼƣ�"+total);
	}
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.rentMoto();
	}
}
