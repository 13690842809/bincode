package bin;

import java.util.Scanner;

public class compounding {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.��������   2.��������  3.�ܶ����㱾��  4.���Ʊ�����  5.������ֵ������  6.ÿ�궼Ͷ�뱾��");
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
					System.out.println("��ѡ�� 1.���궨Ͷ  2.���¶�Ͷ:");
					int six=s.nextInt();
					if(six==1)
						six1(s);
					else
						six2(s);
					break;
				default:
					System.out.println("��������");
					break;
		}
		
	}

	private static void five(Scanner s) {
		double sum=0;
		System.out.println("�����뱾��");
		double startmoney=s.nextDouble();
		System.out.println("��������ֵ:");
		double endmoney=s.nextDouble();
		System.out.println("����������:");
		double years=s.nextInt();
		double r=Math.pow((endmoney/startmoney), 1/years)-1;
		System.out.println(r);
	}

	private static void four(Scanner s) {
		double sum=0;
		System.out.println("�����뱾��");
		double startmoney=s.nextDouble();
		System.out.println("��������ֵ:");
		double endmoney=s.nextDouble();
		System.out.println("����������:");
		double r=s.nextDouble();
		double years=Math.log(endmoney/startmoney)/Math.log(1+r);
		System.out.println("����"+startmoney+"ÿ�갴"+r+"�������ջ��"+endmoney+"��Ҫ"+years);
	}

	private static void three(Scanner s) {
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

	private static void two(Scanner s) {
		double sum=0;
		System.out.println("�����뱾��");
		double money=s.nextDouble();
		System.out.println("����������:");
		int years=s.nextInt();
		System.out.println("����������:");
		double r=s.nextDouble();
		sum=money*r*years;
		System.out.println("��������"+years+"����ܶ�Ϊ:"+sum);
	}

	private static void one(Scanner s) {
		double sum=0;
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
	
	private static void six1(Scanner s){
		double sum=0;
		System.out.println("������ÿ��Ͷ�뱾��");
		double money=s.nextDouble();
		System.out.println("����������:");
		int years=s.nextInt();
		System.out.println("����������:");
		double r=s.nextDouble();
		sum=money*(1+r)*(-1+Math.pow(1+r, years))/r;

		System.out.println("����ܶ�Ϊ"+sum);
	}
	private static void six2(Scanner s){
		double sum=0;
		System.out.println("������ÿ��Ͷ�뱾��");
		double money=s.nextDouble();
		System.out.println("����������:");
		int years=s.nextInt();
		System.out.println("����������:");
		double r=s.nextDouble();
		sum=money*12*(1+r)*(-1+Math.pow(1+r, years))/r;
		System.out.println("����ܶ�Ϊ"+sum);
	}
	
	
	

}