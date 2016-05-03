package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	
	public void menu(){
		//欢迎界面
		System.out.println("-----------------------------------");
		System.out.println("----------欢迎来到租赁系统----------");
		System.out.println("-----------------------------------\n");
	}
	public void chooseStyle(){
		Scanner input=new Scanner(System.in);
		System.out.println("要租几辆车：");
		int n=input.nextInt();
		int[] num=new int[n];
		//选择车辆类别
		Moto moto=new Car();
		Bus bus=new Bus();
		int days;//租赁天数
		String[] carType={"别克商务","宝马550i","别克林荫大道"};
		String[] busType={"<=16",">16"};
		double total=0;
		int i=0;
		do{
			System.out.print("请输入车辆类别（1.轿车 2.客车）：");
			int style=input.nextInt();
			if(style==1){//轿车
				boolean flag1=false;
				do{
					System.out.print("请输入车型（1.别克商务 2.宝马550i 3.别克林荫大道）：");
					int a=input.nextInt();
					Car car=(Car)moto;
					car.setType(carType[a-1]);
					System.out.print("请输入租赁天数：");
					days=input.nextInt();//获取天数
					total+=car.rentType(days);
					
				}while(flag1);
				i++;
			}
			else if(style==2){//客车
				boolean flag1=false;
				do{
					System.out.print("请输入车型（1.<=16座  2.>16座）：");
					int a=input.nextInt();                       
					bus.setSeatCount(busType[a-1]);
					System.out.print("请输入租赁天数：");
					days=input.nextInt();//获取天数
					total+=bus.rentType(days);
					
				}while(flag1);
				i++;
			}
			else{//选择无效，重新输入
				System.out.println("请输入正确选项");
				
			}
			System.out.println("");
			
		}while(i<n);
		System.out.println("总计："+total);
	}
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.chooseStyle();
	}
}
