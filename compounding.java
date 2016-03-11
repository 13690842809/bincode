package bin;

import java.util.Scanner;

public class compounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.复利计算   2.单利计算  3.总额反向计算本金");
		int num=s.nextInt();
		if(num==3){
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
		
		else{
			double sum=0;
			System.out.println("请输入本金：");
			double money=s.nextDouble();
			System.out.println("请输入年数:");
			int years=s.nextInt();
			System.out.println("请输入利率:");
			double r=s.nextDouble();
			switch(num){
				case 1:
					for(int i=1;i<=years;i++){
						sum=(1+r)*i*money;
						System.out.println(i+"年后总额为"+sum);
					}
					break;
				case 2:
					sum=money*r*years;
					System.out.println("单利计算"+years+"年后总额为:"+sum);
					break;
				default:
					System.out.println("输入有误");
					break;
				
			}
			
		}
		
		
	}

}