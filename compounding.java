package bin;

import java.util.Scanner;

public class compounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.��������   2.��������  3.�ܶ����㱾��");
		int num=s.nextInt();
		if(num==3){
			double sum=0;
			System.out.println("��������ֵ��");
			double money=s.nextDouble();
			System.out.println("����������:");
			int years=s.nextInt();
			System.out.println("����������:");
			double r=s.nextDouble();
			double Single=money/(1+years*r);
			double Double=money/(Math.pow((1+r),years));
			System.out.println("������ֵΪ:"+Single);
			System.out.println("������ֵΪ:"+Double);
		}
		
		else{
			double sum=0;
			System.out.println("�����뱾��");
			double money=s.nextDouble();
			System.out.println("����������:");
			int years=s.nextInt();
			System.out.println("����������:");
			double r=s.nextDouble();
			switch(num){
				case 1:
					for(int i=1;i<=years;i++){
						sum=(1+r)*i*money;
						System.out.println(i+"����ܶ�Ϊ"+sum);
					}
					break;
				case 2:
					sum=money*r*years;
					System.out.println("��������"+years+"����ܶ�Ϊ:"+sum);
					break;
				default:
					System.out.println("��������");
					break;
				
			}
			
		}
		
		
	}

}