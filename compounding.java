package bin;

import java.util.Scanner;

public class compounding {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.复利计算   2.单利计算  3.总额反向计算本金  4.买股票算年份  5.本金终值求利率  6.每年都投入本金");
		int num=s.nextInt();
		
			switch(num){
				case 1:
					one(s);
					break;
				case 2:
					two(s);
					break;
				case 3:
					three(s);
					break;
				case 4:
					four(s);
					break;
				case 5:
					five(s);
					break;
				case 6:
					System.out.println("请选择 1.按年定投  2.按月定投:");
					int six=s.nextInt();
					if(six==1)
						six1(s);
					else
						six2(s);
					break;
				default:
					System.out.println("输入有误");
					break;
		}
		
	}

	private static void five(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double startmoney=s.nextDouble();
		System.out.println("请输入终值:");
		double endmoney=s.nextDouble();
		System.out.println("请输入年数:");
		double years=s.nextInt();
		double r=Math.pow((endmoney/startmoney), 1/years)-1;
		System.out.println(r);
	}

	private static void four(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double startmoney=s.nextDouble();
		System.out.println("请输入终值:");
		double endmoney=s.nextDouble();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		double years=Math.log(endmoney/startmoney)/Math.log(1+r);
		System.out.println("存入"+startmoney+"每年按"+r+"利率最终获得"+endmoney+"需要"+years);
	}

	private static void three(Scanner s) {
		double sum=0;
		System.out.println("请输入终值：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		double Single=money/(1+years*r);
		double Double=money/(Math.pow((1+r),years));
		System.out.println("单利现值为:"+Single);
		System.out.println("复利现值为:"+Double);
	}

	private static void two(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*r*years;
		System.out.println("单利计算"+years+"年后总额为:"+sum);
	}

	private static void one(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		for(int i=1;i<=years;i++){
			sum=(1+r)*i*money;
			System.out.println(i+"年后总额为"+sum);
		}
	}
	
	private static void six1(Scanner s){
		double sum=0;
		System.out.println("请输入每年投入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*(1+r)*(-1+Math.pow(1+r, years))/r;

		System.out.println("年后总额为"+sum);
	}
	private static void six2(Scanner s){
		double sum=0;
		System.out.println("请输入每月投入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*12*(1+r)*(-1+Math.pow(1+r, years))/r;
		System.out.println("年后总额为"+sum);
	}
	
	
	

}