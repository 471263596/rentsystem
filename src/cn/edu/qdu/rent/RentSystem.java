package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	Moto motos[];
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
		motos=new Moto[n];
		String type="";
		
		String[] carType={"�������","����550i","���������"};
		String[] busType={"<=16��",">16��"};
		int i=0;
		
		System.out.print("����������������");//ѡ������
		int day=input.nextInt();
		//ѡ�������
		do{
			System.out.print(i+1+".�����복�����1.�γ� 2.�ͳ�����");
			int style=input.nextInt();
			int a=0;
			if(style==1){//�γ�
				boolean flag1=false;
				do{
					System.out.print("�����복�ͣ�1.������� 2.����550i 3.�������������");
					a=input.nextInt();
					type=carType[a-1];
					if(a!=1&&a!=2){flag1=true;}
					else{motos[i]=new Car("³A3152",type);}
				}while(flag1);
				i++;
			}
			else if(style==2){//�ͳ�
				boolean flag1=false;
				do{
					System.out.print(".�����복�ͣ�1.<=16��  2.>16������");
					a=input.nextInt();  
					type=busType[a-1];
					if(a!=1&&a!=2){flag1=true;}
					else{motos[i]=new Bus("³A4321",type);}
				}while(flag1);
				i++;
			}
			else{//ѡ����Ч����������
				System.out.println("��������ȷѡ��");
				
			}
			System.out.println("");
			
		}while(i<n);
		calculate(day);
		
	}
	public void calculate(int day){
		double total=0;
		for (int i = 0; i < motos.length; i++) {
			total+=motos[i].rentType(day);
			if(motos[i] instanceof Car){//����
				System.out.println("��"+(i+1)+"�� ���������ͣ�"+((Car) motos[i]).getType()+"\t����������"+day+"\t����������ã�"+motos[i].getPrice()+"\t�˳������ܷ��ã�"+(day*motos[i].getPrice()));
			}
			else{
				System.out.println("��"+(i+1)+"�� �ͳ������ͣ�"+((Bus) motos[i]).getSeatCount()+"\t����������"+day+"\t����������ã�"+motos[i].getPrice()+"\t�˳������ܷ��ã�"+(day*motos[i].getPrice()));
			}
		}
		System.out.println("�ܼƣ�"+total);
	}
	
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.rentMoto();
	}
}
