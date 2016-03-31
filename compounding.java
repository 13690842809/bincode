package bin;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class compounding  {


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driver =new com.mysql.jdbc.Driver();
		String url="jdbc:mysql://127.0.0.1:3306/compounding";
		Properties info=new Properties();
		info.put("user","root");
		info.put("password","abc97520");
		Connection conn=driver.connect(url, info);
		conn.close();
		System.out.println(conn);
		
		Scanner s=new Scanner(System.in);
		System.out.println("1.复利计算   2.单利计算  3.总额反向计算本金  4.买股票算年份  5.本金终值求利率  6.每年都投入本金  7.贷款");
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
				case 7:
					seven(s);
					break;
				default:
					System.out.println("输入有误");
					break;
		}
		
	}

	public static void five(Scanner s) {
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

	public static void four(Scanner s) {
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

	public static void three(Scanner s) {
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

	public static void two(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*r*years;
		System.out.println("单利计算"+years+"年后总额为:"+(sum+money));
	}

	public static void one(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*Math.pow(1+r, years);
		System.out.println(years+"年后总额为"+sum);
	}
	
	public static void six1(Scanner s){
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
	public static void six2(Scanner s){
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
	
	public static void seven(Scanner s) {
		double sum=0;
		System.out.println("请输入本金：");
		double money=s.nextDouble();
		System.out.println("请输入年数:");
		int years=s.nextInt();
		System.out.println("请输入利率:");
		double r=s.nextDouble();
		sum=money*Math.pow(1+r, years);
		double monthMoney=sum/years/12;
		System.out.println("每月还的本息金额为："+monthMoney);
	}
	
	public static double test_one(double a,int b,double c) {
		double sum=a*Math.pow(1+c, b);
		return sum;
	}
	public static double test_two(double a,int b,double c) {
		double sum=a*c*b;
		return sum+a;
	}
	public static double test_three(double a,int b,double c) {
		double single=a/(1+b*c);
		return single;
	}
	public static double test_four(double a,double b,double c) {
		double years=Math.log(b/a)/Math.log(1+c);
		return years;
	}
	public static double test_five(double a,double b,int c) {
		double r=Math.pow((b/a), 1/c)-1;
		return r;
	}
	public static double test_six1(double a,int b,double c) {
		double sum=a*(1+c)*(-1+Math.pow(1+c, b))/c;
		return sum;
	}
	public static double test_six2(double a,int b,double c) {
		double sum=a*12*(1+c)*(-1+Math.pow(1+c, b))/c;
		return sum;
	}
	public static double test_seven(double a,int b,double c) {
		double sum=a*Math.pow(1+c, b);
		double monthMoney=sum/b/12;
		return monthMoney;
	}


}