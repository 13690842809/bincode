package bin;

import java.util.Scanner;

public class compounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner s=new Scanner(System.in);
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

}
