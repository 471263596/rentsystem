package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSystem {
	Moto motos[];
	public void menu(){
		//欢迎界面
		System.out.println("-----------------------------------");
		System.out.println("----------欢迎来到租赁系统----------");
		System.out.println("-----------------------------------\n");
	}
	public void rentMoto(){
		Scanner input=new Scanner(System.in);
		System.out.println("要租几辆车：");
		int n=input.nextInt();
		motos=new Moto[n];
		String type="";
		
		String[] carType={"别克商务","宝马550i","别克林荫大道"};
		String[] busType={"<=16座",">16座"};
		int i=0;
		
		System.out.print("请输入租赁天数：");//选择天数
		int day=input.nextInt();
		//选择车辆类别
		do{
			System.out.print(i+1+".请输入车辆类别（1.轿车 2.客车）：");
			int style=input.nextInt();
			int a=0;
			if(style==1){//轿车
				boolean flag1=false;
				do{
					System.out.print("请输入车型（1.别克商务 2.宝马550i 3.别克林荫大道）：");
					a=input.nextInt();
					type=carType[a-1];
					if(a!=1&&a!=2){flag1=true;}
					else{motos[i]=new Car("鲁A3152",type);}
				}while(flag1);
				i++;
			}
			else if(style==2){//客车
				boolean flag1=false;
				do{
					System.out.print(".请输入车型（1.<=16座  2.>16座）：");
					a=input.nextInt();  
					type=busType[a-1];
					if(a!=1&&a!=2){flag1=true;}
					else{motos[i]=new Bus("鲁A4321",type);}
				}while(flag1);
				i++;
			}
			else{//选择无效，重新输入
				System.out.println("请输入正确选项");
				
			}
			System.out.println("");
			
		}while(i<n);
		calculate(day);
		
	}
	public void calculate(int day){
		double total=0;
		for (int i = 0; i < motos.length; i++) {
			total+=motos[i].rentType(day);
			if(motos[i] instanceof Car){//属于
				System.out.println("第"+(i+1)+"辆 汽车车车型："+((Car) motos[i]).getType()+"\t租赁天数："+day+"\t车的日租费用："+motos[i].getPrice()+"\t此车租赁总费用："+(day*motos[i].getPrice()));
			}
			else{
				System.out.println("第"+(i+1)+"辆 客车车车型："+((Bus) motos[i]).getSeatCount()+"\t租赁天数："+day+"\t车的日租费用："+motos[i].getPrice()+"\t此车租赁总费用："+(day*motos[i].getPrice()));
			}
		}
		System.out.println("总计："+total);
	}
	
    public static void main(String[] args) {
		RentSystem rent=new RentSystem();
		rent.menu();
		rent.rentMoto();
	}
}
