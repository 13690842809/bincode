package bin;

import java.util.Scanner;

public class compounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("�����뱾��");
		double money=s.nextDouble();
		System.out.println("����������:");
		int years=s.nextInt();
		System.out.println("����������:");
		double r=s.nextDouble();
		for(int i=1;i<=years;i++){
			sum=(1+r)*i*money;
			System.out.println(i+"����ܶ�Ϊ"+sum);
		}
	}

}
